class Solution {
    public int trap(int[] he) {
        int n=he.length;
        int l=0;
        int h=n-1;
        int lmax=0;
        int hmax=0;
        int water=0;
        while(l<=h){
            if(he[l]<=he[h]){
                lmax=Math.max(lmax,he[l]);
                int curr=he[l];
                water+=lmax-curr;
                l++;
            }
            else{
                hmax=Math.max(hmax,he[h]);
                int curr=he[h];
                water+=hmax-curr;
                h--;
            }
        }
        return water;

        
    }
}
