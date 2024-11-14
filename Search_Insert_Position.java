class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length;
        while(start<end){
            int mid=(start+end)/2;
            int k=nums[mid];
            if(target==k)
            {
                return mid;
            }
            else if(target<k){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}