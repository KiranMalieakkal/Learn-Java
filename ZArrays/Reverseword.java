public class Reverseword {
	// Function to find the peak element
	public static void main(String[] args){
	    String str = " kiran may love to code";
        char p[] = str.toCharArray();
        int size = p.length;
        System.out.println(size);
        //for(int i = 0;i<size;i++){
          //  System.out.println(p[i]);
           //}
           reverseword(p);
           reverse(p,0,p.length-1);


           for(int i = 0;i<p.length;i++){
            System.out.print(p[i]);
           } 
	
    }
    static void reverse(char[] p, int start, int end){
       // int start = 0;
       // int end = p.length-1;
        while(start <= end){
            char tmp= p[start];
            p[start]=p[end];
            p[end]= tmp;
            end--;
            start++;
               //System.out.print(start);
               //System.out.print(end);
        }
        /*
        for(int i = 0;i<p.length;i++){
            System.out.print(p[i]);
           }        
        */
        }

    static void reverseword(char p[]){
        
        int start = 0;
        for(int end = 0; end < p.length; end ++){
            if(p[end]== ' '){
                reverse(p,start,end-1);
                start= end + 1;

            }
      
        }
        reverse(p,start,p.length-1);
        /* 
        for(int i = 0;i<p.length;i++){
            System.out.print(p[i]);
           }  
            */
    }
    }


