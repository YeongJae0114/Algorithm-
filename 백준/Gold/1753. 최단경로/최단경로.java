
import java.io.*;
import java.util.*;

public class Main {
    static class Node implements Comparable<Node>{
        int end, weight;

        public Node(int end, int weight){
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    private static final int INF = 100_000_000;
    static int v,e,k;
    static List<Node>[] list;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken()); // 정점
        e = Integer.parseInt(st.nextToken()); // 간선
        k = Integer.parseInt(br.readLine()); // 시적점

        list = new ArrayList[v + 1];
        dist = new int[v + 1];

        // 그래프 초기화
        Arrays.fill(dist, INF);

        for(int i = 1; i <= v; i++){
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            // start에서 end로 가는 weight 가중치
            list[start].add(new Node(end, weight));
        }
        dijkstra(k);
        for(int i = 1; i <= v; i++){
            if(dist[i] == INF){
                System.out.println("INF");
            } else System.out.println(dist[i]);
        }
    }
    private static void dijkstra(int start){
        PriorityQueue<Node> queue = new PriorityQueue<>();

        boolean[] check = new boolean[v + 1];// 방문 여부를 체크 하기위한 배열
        queue.add(new Node(start, 0));
        dist[start] = 0;

        while(!queue.isEmpty()){
            Node curNode = queue.poll();
            int cur = curNode.end; // 현재 노드의 목적지

            if(check[cur] == true) continue; // 방문했던 노드라면 밑에 코드를 넘어간다
            check[cur] = true;

            // 정점에서 이동할 수 있는 간선의 최소 비용을 탐색
            for(Node node : list[cur]){
                if(dist[node.end] > dist[cur] + node.weight){
                    dist[node.end] = dist[cur] + node.weight; // 최단거리 갱신
                    queue.add(new Node(node.end, dist[node.end])); // 다시 큐에 넣어서 다른 최단 거리가 있나 탐색
                }
            }
        }
    }
}
