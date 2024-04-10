public class BubbleSort {
    public static void main(String[] args) {
        int arr[]= {2,10,8,7};
        bubblesort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
           } 
    }
    static void bubblesort(int[] arr){
        for(int i= 0; i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
