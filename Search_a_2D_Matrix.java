class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int row=nums.length;
        int col=nums[0].length;
        int start=0;
        int end=row*col-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int midval=nums[mid/col][mid%col];
            if(midval==target){
                return true;
            }
            else if(midval<target){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}