import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static int N, M;
    static int[] map, arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N];
        arr = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(map); // 중복 수를 제대로 필터링하기 위해 정렬 필요
        bt(0);
        System.out.print(sb);
    }

    static void bt(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        int prev = -1; // 같은 depth에서 중복된 숫자 방지용
        for (int i = 0; i < N; i++) {
            if (map[i] == prev) continue;

            arr[depth] = map[i];
            prev = map[i];
            bt(depth + 1);
        }
    }
}
