class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        char[] arr = str.toCharArray();
        int vals = 0;

        for(char a : arr){
            int val = Character.getNumericValue(a);
            vals += val;
        }
        if(x % vals == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}