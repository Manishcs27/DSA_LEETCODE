class Solution {
    public int minInsertions(String s) {
     Stack<Character> stack = new Stack<>();
        int insertions = 0;
        int i = 0;
        int n = s.length();

        while (i < n) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
                i++;
            } else {
                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    i += 2;
                } else {
                    insertions++;
                    i++;
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    insertions++;
                }
            }
        }

        insertions += stack.size() * 2;
        return insertions;
    }
}