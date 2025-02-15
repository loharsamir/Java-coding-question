public class target {
    public static int targetIndex(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
            
        }
        return -1;
       
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
        int target=7;
        System.err.println(targetIndex(nums, target));
    }
}
