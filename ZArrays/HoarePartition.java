public class HoarePartition {
    public static void main(String[] args) {
        int[] arr= {1000,5,6,7,9,8,4,3,2,1};
        lomuto(arr,1,arr.length-1);
        for(int x:arr){
            System.out.print(x);

        }
    }
    public static void lomuto(int[] arr, int low, int high){
        int pivot= arr[low];
        int i=low-1;
        int j= high+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>=pivot);
            if(i<j){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
            else break;

        }
        

    }
    
}
