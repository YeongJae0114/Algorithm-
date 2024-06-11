import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] s = br.readLine().split(" ");
            int[] ary = {1,1,2,2,2,8};
            int[] newAry = new int[s.length]; 
           
            for(int i=0; i<6; i++){
               newAry[i] = Integer.parseInt(s[i]);
               ary[i] = ary[i] - newAry[i];
               System.out.print(ary[i]+" ");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}