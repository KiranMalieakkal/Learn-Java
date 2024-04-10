import java.util.Scanner;
import java.math.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        String str= S.next();
        System.out.println(Pali(str));
        int[] height= {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));// this is for leetcode
        //System.out.println(str.substring(1, str.length()-2));

    }
    static boolean Pali(String str){
        if (str.length()==0 ||str.length() == 1){
            return true;
        }
        if (str.charAt(0)==str.charAt((str.length()-1)) && str.length()==2){
            return(true);
        }
        if (str.charAt(0)==str.charAt((str.length()-1)) && str.length()>2){
            return(Pali(str.substring(1, str.length()-2)));
        }
        else 
        return false;
    }
    static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                if (height[i] < height[j]) {
                    int current = Math.abs(height[i] * (j - i));
                    if (current > max) {
                        max = current;
                    }
                } else if (height[i] > height[j]) {
                    int current = Math.abs(height[j] * (i - j));
                    if (current > max) {
                        max = current;
                    }
                } else {
                    continue;
                }
            }
        }
        return max;

    }
}


