class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch  == '['){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                } 
                char stck = stack.pop();
                if(ch == ')' && stck != '(') {return false;}
                if (ch == '}' && stck != '{') {return false;}
                if (ch == ']' && stck != '[') {return false;}
            }
        }

        return stack.isEmpty();
    }
}