class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        int target=(int)Math.sqrt(x);
        while(start<=end){
            int mid=start+(end-start)/2;
        
            if(mid==target){
                return mid;
            }
            else if(target>mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}