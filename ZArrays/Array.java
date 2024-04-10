import java.util.Scanner;
import java.io.*;

class Array{
     int abc;
     static int abc2;
    public  void Sum(int[] arr){
        int sum = 0;
        for(int i= 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        System.out.println(arr.length);
    }
    public void Max(int[] arr){
        int max = arr[0];
        for(int i= 1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

    }

    public void String(){


    }
        
    public static void main (String[] args){
       Scanner S = new Scanner(System.in);
       System.out.println("Enter the Size");
       int size = S.nextInt();
       int arr1[] = new int[size];

       for(int i = 0;i<size;i++){
        arr1[i] = S.nextInt();
       }
       Sum(arr1);
       Array obj1= new Array();
       
       obj1.Sum(arr1);
       obj1.Max(arr1);
       int max = 0;
       max = abc2;
       max = obj1.abc;


       // System.out.println(function(a,b,c));
    
    }
}