class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String curr=tokens[i];
            if(!st.isEmpty() && curr.equals("+")){
                int a=st.pop();
                int b=st.pop();
                int c=a+b;
                st.push(c);
            }
            else if(!st.isEmpty() && curr.equals("-")){
                int a=st.pop();
                int b=st.pop();
                int c=b-a;
                st.push(c);
            }
            else if(!st.isEmpty() && curr.equals("*")){
                int a=st.pop();
                int b=st.pop();
                int c=a*b;
                st.push(c);
            }
            else if(!st.isEmpty() && curr.equals("/")){
                int a=st.pop();
                int b=st.pop();
                if(a!=0){
                    int c=b/a;
                    st.push(c);
                }
                else{
                    st.push(0);
                }
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        if(!st.isEmpty()) return st.peek();
        else return 0;
    }
}
