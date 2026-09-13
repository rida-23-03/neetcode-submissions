class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        HashMap<String,List<String>> mp=new HashMap<>();
        for(int i=0;i<s.length;i++){
            String curr=s[i];
            char[] a=curr.toCharArray();
            Arrays.sort(a);
            String sorted=new String(a);

            if(!mp.containsKey(sorted)){
                mp.put(sorted,new ArrayList<>());
            }
            mp.get(sorted).add(curr);
        }
        List<List<String>> ans=new ArrayList<>();
        for(List<String> x:mp.values()){
            ans.add(x);
        }
        return ans;

    }
}
