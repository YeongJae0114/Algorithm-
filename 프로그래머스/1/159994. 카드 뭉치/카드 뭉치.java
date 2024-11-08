import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        List <String> c1 = new ArrayList<>(List.of(cards1));
        List <String> c2 = new ArrayList<>(List.of(cards2));
        for(int i = 0; i < goal.length; i++) {
            if(c1.indexOf(goal[i]) == 0)
                c1.remove(0);
            else if(c2.indexOf(goal[i]) == 0)
                c2.remove(0);
            else
                break;
            if(i + 1 == goal.length)
                answer = "Yes";
        }
        return answer;
    }
}