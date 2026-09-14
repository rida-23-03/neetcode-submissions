class Solution {
    public int maxArea(int[] he) {
        int n=he.length;
        int l=0;
        int r=n-1;
        int area=0;
        int maxa=0;
        while(l<=r){
            int h=Math.min(he[l],he[r]);
            int b=r-l;
            area=h*b;
            if(area>maxa){
                maxa=area;
            }
            if(he[l]<he[r]) l++;
            else r--;
        }
        return maxa;
    }
}
