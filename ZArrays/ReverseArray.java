public class ReverseArray {
    public static void main(String[] args){
        int p[] = {1,2,3,4,5,6,7,8};
        ReverseArray obj1 = new ReverseArray();
        obj1.reverse(p);
           for(int i = 0;i<p.length;i++){
            System.out.print(p[i]);
           } 
	
    }
    public void reverse(int[] p){
        int low =0;
        int high = p.length-1;
        while(high>low){
            int temp = p[low];
            p[low] = p[high];
            p[high] = temp;
            low++;
            high--;

        }
    }
    
}
