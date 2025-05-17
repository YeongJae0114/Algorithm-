import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main{
    static int N, M;
    static int[] arr, map;
    static StringBuffer sb = new StringBuffer();
    static boolean visited[];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new int[N];
        arr = new int[M];
        visited = new boolean[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] =  Integer.parseInt(st.nextToken());
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
        int prev = -1;
        for(int i=0; i<map.length; i++){
            
            if(visited[i] || map[i] == prev) continue;
            
             visited[i] = true;
             arr[depth] = map[i];
             prev = map[i];
             bt(depth+1);
             visited[i] = false;
        }
    }
}
