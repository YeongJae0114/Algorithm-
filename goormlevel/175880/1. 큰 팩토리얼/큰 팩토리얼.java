
import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int input = Integer.parseInt(st.nextToken());
        System.out.println(fac(input));
    }

    static BigInteger fac(int input) {
        BigInteger result = BigInteger.ONE;
        BigInteger mod = BigInteger.valueOf(1000000007);

        for (int i = 2; i <= input; i++) {
            result = result.multiply(BigInteger.valueOf(i)).mod(mod);
        }
        return result;
    }
}
