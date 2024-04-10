public class CheckSort {
    public static void main(String args[]){
        int arr[] = {1,23,4,5,6,7};
        int arr1[] = {1};
        System.out.println(check(arr));
        System.out.println(check(arr1));

    }
    public static boolean check(int arr[]){
        int n = arr.length;
       // if(n==1){
         //   return true;
        //}
        for(int i=0;i<n-1;i++ ){
            if(arr[i]>=arr[i+1]){
                return false;
            }
            
        }
        return true;
    }
}
