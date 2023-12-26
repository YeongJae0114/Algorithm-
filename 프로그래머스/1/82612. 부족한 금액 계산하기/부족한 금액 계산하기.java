class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long mon = 0;
        for(int i=1; i<=count; i++){
            mon += price * i;
        }
        if(mon < money){
            answer = 0;
        }else{
            answer =  mon - money;
        }
        return answer;
    }
}