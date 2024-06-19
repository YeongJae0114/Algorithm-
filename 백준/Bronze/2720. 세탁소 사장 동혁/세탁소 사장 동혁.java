import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arys = new int[n];
        for(int i=0; i<n; i++){
            arys[i] = Integer.parseInt(br.readLine());
            int[] result = change(arys[i]);
            System.out.println(result[0] + " " + result[1] + " " + result[2] + " " + result[3]);
        }
        
    }
    public static int[] change(int change){
        int [] list = {25, 10, 5, 1};
        int result[] = new int[4];
        for( int i=0; i<4; i++){
            result[i] = change / list[i];
            change = change % list[i];
        }
        return result;
    }
}