import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] line = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(st.nextToken(" "));
        }
        Arrays.sort(line);

        if(N % 2 ==0){
            System.out.println(line[N/2-1]);
        }else{
            System.out.println(line[N/2]);
        }
    }
}
