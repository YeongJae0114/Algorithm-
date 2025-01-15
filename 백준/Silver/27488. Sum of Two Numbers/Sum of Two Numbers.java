import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void solve(String s) {
        int A = 0, B = 0;
        int L = 0, R = 0;

        for (char ch : s.toCharArray()) {
            int x = ch - '0';
            int y = x;
            x /= 2;
            y -= x;

            if (L < R) {
                A = A * 10 + y;
                B = B * 10 + x;
                L += y;
                R += x;
            } else {
                A = A * 10 + x;
                B = B * 10 + y;
                L += x;
                R += y;
            }
        }

        System.out.println(A + " " + B);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine().trim());

        while (T-- > 0) {
            String s = reader.readLine().trim();
            solve(s);
        }
    }
}
