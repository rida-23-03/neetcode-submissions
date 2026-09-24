class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        HashSet<Integer> s=new HashSet<>();
        
        while(sum!=1){
            n=sum;
            if(s.contains(n)){
                return false;
            }
            s.add(n);
            sum=0;
            while(n!=0){
                int d=n%10;
                sum+=d*d;
                n=n/10;
            }
        }
        
        return true;
        
    }
}
