public class rotateArray {
    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int d = 3;
        rotate(arr,d);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
           } 
	
    }
    static void rotate(int arr[], int d){
        for(int i=0;i<arr.length;i++){
            if(i-d<0){
                arr[i-d+arr.length]= arr[i];
            }
            else{
                arr[i-d]= arr[i];
            }
        }
    }
}
