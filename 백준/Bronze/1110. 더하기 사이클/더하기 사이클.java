import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int originalN = N;  // 처음 입력된 숫자를 저장합니다.
        int M = N;
        int count = 0;
        int a, b, c;

        if (N < 10) {
            N = N * 10;  // 한 자리 수일 경우 두 자리 수로 변환
        }

        do {
            a = M / 10;
            b = M % 10;
            c = a + b;
            if (c >= 10) {
                c -= 10;
            }
            M = b * 10 + c;
            count++;
        } while (originalN != M);  // 처음 입력된 숫자와 비교합니다.
        
        System.out.print(count);
    }
}
