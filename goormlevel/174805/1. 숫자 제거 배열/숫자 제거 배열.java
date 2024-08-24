
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄에서 N과 K를 읽어오기
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        String K = firstLine[1];

        // 두 번째 줄에서 숫자 목록을 읽어오기
        String[] numbers = br.readLine().split(" ");
        
        int count = 0;

        for (String num : numbers) {
            // 숫자에 K가 포함되지 않는 경우 count 증가
            if (!num.contains(K)) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
