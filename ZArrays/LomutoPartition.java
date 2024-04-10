public class LomutoPartition {
   
    public static void main(String[] args) {
        int[] arr= {1,6,7,9,8,4,3,2,5};
        lomuto(arr,0,arr.length-1);
        for(int x:arr){
            System.out.print(x);

        }
    }
    public static void lomuto(int[] arr, int low, int high){
        int pivot= arr[high];
        int i = low-1;

        for(int j=low;j<high-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
    }
}
