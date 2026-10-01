class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack <>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char st = s.charAt(i);
            if(st=='(' || st=='[' || st=='{'){
                stack.push(st);
            }
            else{
                if (stack.isEmpty()) return false;
                char top = stack.pop();
        if ((st == ')' && top != '(') ||
                    (st == '}' && top != '{') ||
                    (st == ']' && top != '[')) {
                    return false;
            }
        }
        }
        return stack.isEmpty();
        
    }
}