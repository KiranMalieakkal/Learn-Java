public class presuffix {
    public static void main(String[] args){
        String Str1 = "adulation";
        String Str2 = "obstreperous";
        int p =6;
        char[] j = Str1.toCharArray();
        char[] k = Str2.toCharArray();
        get(j,k,p);

    }
     static void get(char[] j,char[] k, int p){
        char[] x = new char[2*p];
        for(int i=0; i<p;i++){
         x[i]= j[i];
        }
        int y=k.length-1;
        for(int i=2*p-1; i>=p;i--){
            
            x[i]= k[y];
            y--;
           // System.out.println(y);
           }
        for(int i = 0;i<x.length;i++){
            System.out.print(x[i]);
           } 
     }
}
