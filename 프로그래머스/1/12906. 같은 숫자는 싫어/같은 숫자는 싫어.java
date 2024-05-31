import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int a : arr){
            if(preNum != a){
                tempList.add(a);
            }
            preNum = a;
        }
        int[] answer = new int[tempList.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = tempList.get(i).intValue();
        }
        
        return answer;
    }
}