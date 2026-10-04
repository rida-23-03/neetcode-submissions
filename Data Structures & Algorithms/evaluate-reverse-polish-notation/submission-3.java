class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String curr=tokens[i];
            if(!st.isEmpty() && curr.equals("+")){//actually checking empty is not even req becoz this ques says input is valid and there so 
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
                int c=b/a;
                st.push(c);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}
