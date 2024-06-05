class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        int stPoint = section[0];
        for(int i=0; i<section.length; i++){
            int nPoint = section[i];
            if(stPoint + m <= nPoint){
                stPoint = nPoint;
                answer++;
            }
        }

        return answer;
    }
}