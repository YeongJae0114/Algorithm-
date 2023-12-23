class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;

        for(int ary : array){
            if(ary > height){
                answer += 1;
            }
        }
        return answer;
    }
}