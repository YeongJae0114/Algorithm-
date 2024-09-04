import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[1001];

        // DP 테이블 초기화
        dp[1] = 1;
        dp[2] = 3;

        // 점화식에 맞는 반복문 실행
        for (int i = 3; i < N + 1; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2])%10007;
        }
        System.out.println(dp[N]);
    }
}
