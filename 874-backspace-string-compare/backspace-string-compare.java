class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!stk.isEmpty())
                    stk.pop();
            } else {
                stk.push(c);
            }
        }
        int i = 0;
        char[] arr1 = new char[stk.size()];
        while (!stk.isEmpty()) {
            arr1[i++] = stk.pop();
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!stk.isEmpty())
                    stk.pop();
            } else {
                stk.push(c);
            }
        }
        i = 0;
        char[] arr2 = new char[stk.size()];
        while (!stk.isEmpty()) {
            arr2[i++] = stk.pop();
        }

        return new String(arr1).equals(new String(arr2));
    }
}