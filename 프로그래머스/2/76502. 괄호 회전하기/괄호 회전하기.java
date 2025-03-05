import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        
        for (int i = 0; i < len; i++) { // i는 0부터 시작해야 한다.
            if (fn(s)) { // 올바른 괄호 문자열인지 체크
                answer++;
            }
            // 문자열 회전
            s = s.substring(1, len) + s.charAt(0);
        }
        
        return answer;
    }
    
    public static boolean fn(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            if (!stack.isEmpty()) {
                char top = stack.peek();
                
                if ((top == '{' && c == '}') || 
                    (top == '[' && c == ']') || 
                    (top == '(' && c == ')')) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        return stack.isEmpty();
    }
}
