class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (angle < 90){
            answer = 1;
        }else if (angle < 180){
            answer = 3;
        }
        if (angle ==180){
            answer = 4;
        }
            
        if (angle == 90 ){
            answer = 2;
        }
        
        return answer;
    }
}