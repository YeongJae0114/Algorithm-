import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


class Main{
    static int N, M;
    static int[] arr, map;
    static boolean[] visited;
    static StringBuffer sb = new StringBuffer();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        arr = new int[M];
        map = new int[N];
        visited = new boolean[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(map);
        
        bt(0, 0);
        System.out.println(sb);
        br.close();
    }
    
static void bt(int depth, int start){
    if(depth == M){
        for(int val : arr){
            sb.append(val).append(' ');
        }
        sb.append('\n');
        return;
    }

    for(int i = start; i < N; i++){
        arr[depth] = map[i];
        bt(depth + 1, i + 1);  // 중복 없이 다음 값만 탐색
    }
}
}