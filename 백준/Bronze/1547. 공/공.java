import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> cups = new ArrayList<>();

        cups.add(1);
        cups.add(0);
        cups.add(0);
        cups.add(0);

        int cnt = sc.nextInt();

        for (int i = 1; i <= cnt; i++) {

            int cup1 = sc.nextInt();
            int cup2 = sc.nextInt();

            Collections.swap(cups, cup1-1, cup2-1);
        }

        System.out.println(cups.indexOf(1) + 1);
    }
}
