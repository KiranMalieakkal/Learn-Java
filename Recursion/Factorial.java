import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int n;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        System.out.println(factorial(n));

    }
    static int factorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        return(n*factorial(n-1));
    }
    
}
