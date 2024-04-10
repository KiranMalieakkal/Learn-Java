import java.util.Scanner;

class Prime {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        System.out.println(Isprime(j));
        System.out.println(NextPrime(j));


    }
    static boolean Isprime(int j){
        int count = 0 ;
        for(int i= 2;i<=j/2;i++){
            if(j%i==0){
                count++;
            }

        }
        if(count>0){
            return false;
        }
        else{
            return true;
        }
    }
    static int NextPrime(int j){
        int i = j+1;
        while(Isprime(i)==false){
            i++;
        }
        return i;
    }
    
}
