import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int id= 0; id < commands.length; id++){
            int i = commands[id][0];
            int j = commands[id][1];
            int k = commands[id][2];
            int[] tmp = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(tmp);
            answer[id] = tmp[k-1];
        }
        return answer;
    }
}