public class MoveZeroes {
    //partially working.
    public static void main(String[] args){
        int arr[] = {0,1,2,3,0,5,6,79,0,6,0,0};
        move(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(" " + arr[i]);
    }
}
    static void move(int[] arr){
        int k= arr.length-1;
        for(int i=0;i<arr.length;i++){
            if( arr[i]== 0){
                for(int j=k;j>0;j-- ){
                    if(arr[j]==0){
                        k--;
                        continue;
                    }
                    else{
                        int temp = arr[k];
                        arr[k]= arr[i];
                        arr[i]=temp;
                        k--;
                        break;
                    }
                }
                for(int h = 0;h<arr.length;h++){
                    System.out.print(" " + arr[h]);
            }
            System.out.println(" ");
            }
        }
    }
}
