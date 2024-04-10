import java.util.*;
/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Pair 
{
    static void getMinMax(int a[], int n)  
    {
        //Write your code here
        int max1 = a[0];
        int min1 = a[0];
        for(int i= 0; i<n-1; i++){
            if(a[i]<a[i+1]){
                max1 = a[i+1];
            }
            if(a[i]>a[i+1]){
                min1 = a[i+1];
            }
            
           // System.out.printf("%d , %d",max1,min1);
            System.out.println(max1 +" "+ min1);
        }
        
    }
    public static void main(String[] args){
        int a[]={3,100000,1,56,1000,167};
        int n = a.length;
        getMinMax(a,n);


    }
}
