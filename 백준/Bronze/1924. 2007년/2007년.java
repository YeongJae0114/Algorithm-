import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<x-1; i++){
            y += month[i];
        }
        if(y % 7 == 1){
            System.out.println("MON");
        }else if(y % 7 == 2){
            System.out.println("TUE");
        }else if(y % 7 == 3){
            System.out.println("WED");
        }else if(y % 7 == 4){
            System.out.println("THU");
        }else if(y % 7 == 5){
            System.out.println("FRI");
        }else if(y % 7 == 6){
            System.out.println("SAT");
        }else if(y % 7 == 0){
            System.out.println("SUN");
        }
        
    }
}