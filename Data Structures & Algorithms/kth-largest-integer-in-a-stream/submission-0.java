class KthLargest {
    PriorityQueue<Integer> largest;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        largest=new PriorityQueue<>();

        for(int x:nums){
            largest.add(x);

            if(largest.size()>k){
                largest.poll();
            }
        }
    }
    
    public int add(int val) {
        largest.add(val);
        if(largest.size()>k){
            largest.poll();
        }
        return largest.peek();
    }
}
