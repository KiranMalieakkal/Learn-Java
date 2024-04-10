import java.util.Scanner;
import java.io.*;

class HelloWorld{

    public static double function(int a,int b,int c){
        double X = a * Math.pow(b, (c-1));
        return X;
    }
        
    public static void function2(int a){
            int sum = 0;
        for(int i =0;i<a;i++){
         sum = sum + i;   
        }
        System.out.println(sum);
    }

    public static void function3(int a){
            String sum = " ";
            String sum2 = "*";
        for(int j=1;j<=a;j++) {  
            for(int i=1;i<=(a-j);i++){
            System.out.print(sum);   
            }
            for(int i=1;i<=(2*j)-1;i++){
            System.out.print(sum2);     
            }
            System.out.println();

     }
    }
    public static void main (String[] args){
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
      //  int b = S.nextInt();
       // int c = S.nextInt();
        function3(a);
        function2(a);
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1==str2);
        System.out.println(str1==str3);


       // System.out.println(function(a,b,c));
    
    }
}