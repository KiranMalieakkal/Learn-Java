import java.util.Scanner;

public class SumofDigits{

    
    public static void main(String[] args){
        int n;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        System.out.println(sum(n));
    
}
    static int sum(int n){
        if(n==0){
            return 0;
        }

        return(n%10+sum(n/10));
    }
}