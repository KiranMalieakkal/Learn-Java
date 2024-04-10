import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){
        int n;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        System.out.println(fibo(n));
    
}
    static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return(fibo(n-1)+fibo(n-2));
    }
}
