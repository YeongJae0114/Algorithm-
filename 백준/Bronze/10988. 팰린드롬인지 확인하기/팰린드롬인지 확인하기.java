import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String restr = "";
        for(int i = str.length()-1; i>=0; i--){
            restr += str.charAt(i); 
        }
        if(str.equals(restr)){
            System.out.printf("1");
        }else{
             System.out.printf("0");
        }
    }
}