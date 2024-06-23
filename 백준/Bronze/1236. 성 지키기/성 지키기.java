import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count =0;
        String[] strs = new String[N];
        
        for(int i=0; i<N; i++){
            strs[i] = br.readLine();
            if(strs[i].contains("X")==false){
                count++;
            }
        }
        int max = count;
        count=0;
      
        for(int i=0; i<M; i++){
            int counts = 0;
            for(int j=0; j<N; j++){
                if(strs[j].charAt(i)=='.'){
                    counts++;
                }
            }
            if(counts == N) count++;
        }
        max = Math.max(max, count);
        System.out.println(max);
    }
}