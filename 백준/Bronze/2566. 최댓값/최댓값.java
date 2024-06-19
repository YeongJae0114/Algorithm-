import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] arys = new int[9][9];
        int x = 0;
        int y = 0;
        int max = -1;
        for(int i = 0; i<9;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j<9;j++){
                  arys[i][j] = Integer.parseInt(st.nextToken());   
            }
        }
        br.close();
        for(int i = 0; i<9;i++){
            for(int j = 0; j<9;j++){
                if(max < arys[i][j]){
                    max = arys[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((x+1) + " "+ (y+1));
        
    }
}