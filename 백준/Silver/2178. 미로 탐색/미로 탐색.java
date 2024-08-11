import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M=  Integer.parseInt(st.nextToken());

        map = new int [N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            String line = br.readLine();
            for (int j=0; j<M; j++){
                map[i][j] = line.charAt(j)-'0';
            }
        }
        bfs(0,0);
        System.out.println(map[N-1][M-1]);
    }
    static void bfs(int rowx, int coly){
        Queue<Point> que = new LinkedList<>();
        que.offer(new Point(rowx, coly));
        visited[rowx][coly] = true;

        while (!que.isEmpty()){
            Point p = que.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = p.x + dx[i];
                int nextY = p.y + dy[i];

                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M) continue; // 수정된 부분
                if (map[nextX][nextY] == 0) continue;
                if (visited[nextX][nextY]) continue;

                que.offer(new Point(nextX,nextY));
                visited[nextX][nextY] = true;
                map[nextX][nextY] = map[p.x][p.y]+1;
            }
        }
    }
}
