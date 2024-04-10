public class leetcode1909 {
    //Remove one element to make the array strictly increasing
    public static void main(String[] args) {

        int[] nums = {1,2,3,2,4,5};
        System.out.println(canBeIncreasing(nums));
        //System.out.println(check(bleh));

        
    }
    static boolean canBeIncreasing(int[] nums) {
        // initially check if the given array is already increasing else create a new array and copy all ellements except one element and recheck each time.(This is done by skipping the element when i = j)
        if (check(nums)){
                return true;
        }
        int nums2[] = new int[nums.length-1];
        for(int i=0;i<nums.length;i++){
            int h= 0;
            for(int j=0;j<=nums2.length;j++){
                if(i==j){
                    continue;
                }
                nums2[h]=nums[j];
                h++;
            }
            for(int k = 0;k<nums2.length;k++){
                System.out.print(nums2[k]);
               }
               System.out.println(" ");  
            if (check(nums2)){
             for(int k = 0;k<nums2.length;k++){
                    System.out.print(nums2[k]);
                   }   
            return true;
            
        }
        }
        return false;

        
    }
    static boolean check(int[] nums){
        // this is function to check if the passed array is increasing or not
        boolean chk = true;
        for(int i=1; i<nums.length; i++){
            if (nums[i-1]>=nums[i]){
                chk = false;
                return chk;
            }
        }
        return chk;
    }
}
    

