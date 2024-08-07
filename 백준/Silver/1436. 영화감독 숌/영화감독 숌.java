import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();
        
        int num = 666;
        int cnt = 1;
        while(cnt != N){
            num++;
            if(String.valueOf(num).contains("666")){
                cnt++;
            }
        }
        bw.write(num + "\n");
        bw.flush();
        bw.close();
    }
}