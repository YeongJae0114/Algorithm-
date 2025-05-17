
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

class Main{
    static int N, M;
    static int[] arr;
    static int[] map;
    static boolean[] visited;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N];
        arr = new int[M];
        map = new int[N];

        String str = br.readLine();
        st = new StringTokenizer(str);

        for(int i=0; i<N; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(map);
        bt(0);

        System.out.println(sb);
        br.close();
    }

    static void bt(int depth){
        if(depth == M){
            for(int val : arr){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < map.length; i++) {
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = map[i];
                bt(depth+1);
                visited[i] = false;
            }
        }
    }
}
