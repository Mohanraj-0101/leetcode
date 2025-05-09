class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str){
        Stack<Character> stk = new Stack<>();

        for(char c : str.toCharArray()){
            if(c == '#'){
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }else{
                stk.push(c);    
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }

        return sb.toString();
    }
}