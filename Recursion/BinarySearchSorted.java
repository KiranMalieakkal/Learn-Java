public class BinarySearchSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int p = 77;
        int high =arr.length-1;
        int low= 0;
        System.out.println(search(arr,p,low,high));
    }

    public static int search(int[] arr,int p,int low, int high){
        int mid = (low+high)/2;

        if(low==high){
            if(p==arr[mid]){
                return mid;
            }
            else return -1;
        }
        else{
            if(p==arr[mid]){
                return mid;
            }
            else if(p>arr[mid]){
                return(search(arr, p,mid+1, high));
            }
            else{
                return(search(arr, p,low,mid-1));
            }
        }
    }
}
