public class DeleteArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        System.out.println(n);
        System.out.println(search(arr,n,6));
        int y = search(arr,n,6);
        print(arr);
        delete(arr,n,y);
        print(arr);
    }

    public static int search(int arr[], int n,int x ){
        for(int i= 0; i<=n-1;i++){
            if( arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void delete(int arr[], int n,int y ){
        for(int i= y; i<n-1;i++){
             arr[i] = arr[i+1];
             System.out.println(arr[i]);
        }

    }
    public static void print(int arr[]){
        int s= arr.length-1;
        //System.out.println(s);
        for(int i= 0; i<=s-1;i++){
             System.out.print(arr[i]);
         }
         System.err.println();
    }
}
