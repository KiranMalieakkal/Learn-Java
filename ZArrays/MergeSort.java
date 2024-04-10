public class MergeSort{
    public static void main(String[] args) {
        int a[] = {100,1,3,5,7,2,4,6};
        int low =1;
        int mid= 4;
        int high= a.length-1;
        //merge(a,low,mid,high);
        mergesort(a,0,a.length-1);
        for(int x:a)
        System.out.print(x+" ");
    }

    static void mergesort(int[]a,int low, int high){
        int mid = (low + high)/2;
        if(low!=high){

            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);

        }
    }
    static void merge(int[] a,int low, int mid, int high){
        int size1= mid-low+1, size2 = high-mid;
        int[] left= new int[size1];
        for(int x=0;x<left.length;x++){
         left[x]=a[low+x];
         System.out.print(left[x]);
        }
        int[] right= new int[size2];
        for(int x=0;x<right.length;x++){
         right[x]=a[x+mid+1];
         System.out.print(right[x]);
        }
        int mark1=0, mark2=0, actual=low;
       // System.out.println(size1 +" "+ size2);
        while(mark1<size1 && mark2<size2){
           System.out.println(mark1+"Hi"+mark2);
            if (left[mark1]<=right[mark2]){
                a[actual] = left[mark1];
                actual++;
                mark1++;
            }
            else{
                a[actual] = right[mark2];
                actual++;
                mark2++;
            }
        }
        //the if statement is unecessary.
        if(mark1==size1){
            while(mark2<size2){
            a[actual] = right[mark2];
            actual++;
            mark2++;
            }
        }
        if(mark2==size2){
            while(mark1<size1){
            a[actual] = left[mark1];
            actual++;
            mark1++;
            }
        }

    }
}