import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 8;
        String[] strs = new String[N];
        int count = 0;

        // 문자열을 배열에 읽어들임
        for (int i = 0; i < N; i++) {
            strs[i] = br.readLine();
        }

        // 'F'를 세는 로직
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                // 1-인덱스로 홀수 줄 및 짝수 칸을 검사
                if (((i % 2 == 0) && (j % 2 == 0)) || ((i % 2 == 1) && (j % 2 == 1))) {
                    if (strs[i].charAt(j) == 'F') {
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
