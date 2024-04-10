import java.util.Scanner;

public class CutRope {
    public static void main(String[] args) {
        int n,a,b,c;
        Scanner S = new Scanner(System.in);
        n= S.nextInt();
        a= S.nextInt();
        b= S.nextInt();
        c= S.nextInt();
        int count = 0;
        find(n,a,b,c,count);

    }
    static int find(int n,int a,int b,int c, int count){
        if(n<0) return -1;
        if(n==0) return count++;
        if(n>0){
            count++;
            return(find(n-a,a,b,c,count));
            return(find(n-b,a,b,c,count));
            return(find(n-c,a,b,c,count));
        }
        



    }    
    }
    

