class Solution {
    public static int CountInRange(int[] nums, int num,int lo, int hi) {
        int count=0;
        for(int i=lo; i<=hi; i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;      
    }
    public static int majorityElementRec(int[]nums, int lo, int hi){
        if(lo==hi){
            return nums[lo];
        }
        int mid=(hi-lo)/2+lo;
        int left=majorityElementRec(nums,lo,mid);
        int right=majorityElementRec(nums, mid+1,hi);

        if(left==right){
            return left;
        }
        int leftcount= CountInRange(nums, left, lo, hi);
        int rightcount= CountInRange(nums, right, lo, hi);
        return leftcount>rightcount? left: right;
    }
    public static int majorityElement(int[] nums){
        return majorityElementRec(nums, 0, nums.length-1);
    }  
}