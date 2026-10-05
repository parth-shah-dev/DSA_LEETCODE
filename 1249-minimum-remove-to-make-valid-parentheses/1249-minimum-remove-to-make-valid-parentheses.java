class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack=new Stack<>();
        char arr[]= s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i]=='('){
                stack.push(i);
            }else if(arr[i]==')'){

                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    arr[i]='#';
                }

            }
        }
        while(!stack.isEmpty()){
            arr[stack.pop()]='#';

        }
        StringBuilder ans=new StringBuilder();
        for(char ch:arr){
            if(ch!='#'){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna