
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static Integer[][] dp;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        dp = new Integer[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // dp 배열 (depth = N-1)인 부분 초기화
        for (int i = 0; i < N; i++) {
            dp[N - 1][i] = arr[N - 1][i];
        }
        System.out.println(find(0,0));

    }
    static int find(int depth, int index){
        // (depth = N-1) 마지막 행이면 초기화 했던 값 반환
        if(depth == N - 1) return dp[depth][index];
        //dp 배열이 비어있다면, 방문 X
        if(dp[depth][index]==null){
            dp[depth][index] = Math.max(find(depth + 1, index), find(depth + 1, index + 1))
                    + arr[depth][index];
        }
        return dp[depth][index];
    }
}
