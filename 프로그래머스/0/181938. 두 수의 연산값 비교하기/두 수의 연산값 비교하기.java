class Solution {
    public int solution(int a, int b) {
        String strAB = "";
        
        strAB += a;
        strAB += b;
        
        return Integer.parseInt(strAB) > 2 * a * b ? Integer.parseInt(strAB) : 2 * a * b;
    }
}