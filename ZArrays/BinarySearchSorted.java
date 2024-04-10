public class BinarySearchSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int p = 0;
        System.out.println(search(arr,p));
    }

    public static int search(int[] arr,int p){
        int high = arr.length-1;
        int low = 0;
        while(high!=low){
            if(p==arr[high]) return high;
            if(p==arr[low]) return low;
            if(p<arr[(low+high)/2]){
                high = (low+high-1)/2;
            }
            else if(p>arr[(low+high)/2]){
                low = (low+high+1)/2;
            } 
            else return((low+high)/2);       
        }
        return -1111111;
    }
}
