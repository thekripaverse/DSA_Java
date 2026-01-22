package Stack;

import java.util.Stack;
class ValidParenthesis {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> a=new Stack<>();
        int c=0;
        while(c<n){
            char i=s.charAt(c);
            if(i=='(' || i=='[' || i=='{'){
                a.push(i);
            }
            else{
                if(a.isEmpty()){
                    return false;
                }
                char res=a.pop();
                if(i==')' && res!='('){
                    return false;
                }
                else if(i=='}' && res!='{'){
                    return false;
                }
                else if(i==']' && res!='['){
                    return false;
                }
        }
            c++;
        }
        if (a.isEmpty()){
            return true;
        } 
        else{
            return false;
        }
    }
}
