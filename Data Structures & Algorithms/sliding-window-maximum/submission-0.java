class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int n=nums.length;
        int i=0;
        int[] ans=new int[n-k+1];
        for(int r=0;r<n;r++){
            while(!dq.isEmpty()&& dq.peekFirst()<=r-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty()&& nums[dq.peekLast()]<=nums[r]){
                dq.pollLast();
            }

            dq.offerLast(r);
            if(r>=k-1){
                ans[i++]=nums[dq.peekFirst()];
            }

        }
        return ans;
    }
}
