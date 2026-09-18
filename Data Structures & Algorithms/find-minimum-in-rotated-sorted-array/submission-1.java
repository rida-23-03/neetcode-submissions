class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int mv=Integer.MAX_VALUE;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[l]<=nums[mid]){
                if(nums[l]<mv){
                    mv=nums[l];
                }
                l=mid+1;
            }
            else{
                if(nums[mid]<mv){
                    mv=nums[mid];
                }
                h=mid-1;
            }
        }
        return mv;

    }
}
