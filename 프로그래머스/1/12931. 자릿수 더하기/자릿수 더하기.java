import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int N = n;
        
        while (N > 0) {
            answer += N % 10; // 마지막 자릿수를 더함
            N /= 10;          // 마지막 자릿수를 제거함
        }
        
        return answer;
    }
}