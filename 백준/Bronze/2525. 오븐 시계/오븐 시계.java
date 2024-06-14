import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        int min = Integer.parseInt(br.readLine());
        minute += min;
        while(minute >= 60){
            minute -= 60;
            hour ++;
        }
        if(hour >= 24){
            hour -= 24;
        }
        System.out.print(hour + " "+ minute);
    }
}