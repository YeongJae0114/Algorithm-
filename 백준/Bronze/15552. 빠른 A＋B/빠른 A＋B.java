import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
            int num = Integer.parseInt(bf.readLine());
            StringBuffer str = new StringBuffer();
            for(int i = 0; i < num; i++) {
                String s = bf.readLine();
                StringTokenizer st = new StringTokenizer(s);
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                str.append(a+b+"\n");
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(str+"");
            bw.flush();
            bw.close();
            bf.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        
        /*Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 0; i < num; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a+b);
        }
        scan.close();      */
    }
}
