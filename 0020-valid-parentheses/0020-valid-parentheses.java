class Solution {
    public boolean isValid(String s) {
    
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else{
                if(st.empty())
                    return false;
                else if(match(st.peek(), s.charAt(i))){
                    st.pop();
                }
                else{
                    // if(st.empty())
                    //     return true;
                    return false;
                }
            }
        }
        if(st.empty())
            return true;
        return false;
    }
    static boolean match(char peek, char check){
            if(peek=='(' && check==')')
                return true;
            else if(peek=='{' && check=='}')
                return true;
            else if(peek=='[' && check==']')
                return true;
            else return false;
            
    }
}