import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        int tmp;
        
        for(int i = 0; i<a.length(); i++){
            tmp = (int)a.charAt(i);
            if(65 <= tmp && tmp <= 90){
                b += (char)(tmp + 32);
            }else if(97 <= tmp && tmp <= 122){
                b += (char)(tmp - 32);
            }else{
                b += (char)tmp;
            }  
        }
    System.out.println(b);  
    }
}