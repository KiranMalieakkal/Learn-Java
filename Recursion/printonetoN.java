
public class printonetoN{
    public static void main(String[] args){
        int x = 10;
        prints(x);
    }
    static void prints(int x){
        if(x==0)
        return;
        System.out.println(x);
        prints(x-1);
    }
}
