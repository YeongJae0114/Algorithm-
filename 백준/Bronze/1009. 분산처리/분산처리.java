import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, r;

        for(int i=0 ; i<n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            r = 1;
            for(int j = 0; j < b ; j++){
                r = (r*a)%10;
                if(r==0) {
                    r = 10;
                }
            }
            System.out.println(r);
        }
    }
}
