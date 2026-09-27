class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st=new Stack<>();
        int n=t.length;
        int[] nge=new int[n];
        Arrays.fill(nge,0);
        for(int i=n-1;i>=0;i--){
            int curr=i;
            while(!st.isEmpty() && t[curr]>=t[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                nge[i]=st.peek()-curr;
            }
            st.push(curr);
        }
        return nge;
    }
}
