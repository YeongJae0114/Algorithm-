import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;


class Main{
    static int N, M;
    static int[] arry;
    static boolean[] visited;
    static StringBuilder sb;
    
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        arry = new int[M];
        visited = new boolean[N];
        bt(0);
        System.out.println(sb);
    }
    
    public static void bt(int depth){
        if(depth == M){
            for(int val : arry){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
            // 기저 조건
        }
        
        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                arry[depth] = i+1;
                bt(depth+1);
                visited[i] = false;
            }
        }
        
    }
}