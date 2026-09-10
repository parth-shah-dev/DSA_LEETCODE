class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    private String build(String str){
        Stack<Character> stack=new Stack<>();
        for (char ch:str.toCharArray()){
            if(ch=='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
            
        }
        StringBuilder res=new StringBuilder();
        for(char ch:stack){
            res.append(ch);
        }
        return res.toString();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna