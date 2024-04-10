public class ArrayDeletion {
    public static void main(String[] args){

        int arr[]= {1,2,3,4,5,6,7,8,9};
        int idx = 3;
        delete(arr,idx);
        for(int i = 0;i<arr.length-1;i++){
            System.out.print(arr[i]);
           } 
    }
    static void delete(int arr[],int idx){
        for(int i=idx; i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }

    }
}
