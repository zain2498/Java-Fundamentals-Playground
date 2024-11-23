package AppliedProgramming;

import java.util.Stack;

public class ParenthesisComparator {
    private boolean isbalanced= true;
    //    {[( - )]}  / {([ - ])}  / [{( - )}]  / [({ - })]  / ([{ - }])  / ({[ - ]})
    public boolean isParenthesisBalanced(Stack<String> listOfString){
        Stack<Character> charStack = new Stack<>();
        for (String str : listOfString ){
            char character = str.charAt(0);

            if(character == '{' || character == '(' || character == '['){
                charStack.push(character);
            } else if (character == ')' || character == '}' || character == ']'){

                if(charStack.isEmpty()){
                    isbalanced = false;
                    break;
                }
                char topOfChar = charStack.pop();
                System.out.println("poped out the top character: "+topOfChar);

                if (!((character == ')' && topOfChar == '(') ||
                        (character == ']' && topOfChar == '[') ||
                        (character == '}' && topOfChar == '{'))) {
                    isbalanced = false;
                    break;
                }
            }
        }

        if(!charStack.isEmpty()){
            isbalanced = false;
        }

        System.out.println(isbalanced);
        return isbalanced;
    }

    public static void main(String[] args) {

        ParenthesisComparator pComparator = new ParenthesisComparator();
        Stack<String> stack = new Stack<>();
        stack.push("{");
        stack.push("[");
        stack.push("(");
        stack.push(")");
        stack.push("]");
        stack.push("}");
        pComparator.isParenthesisBalanced(stack);
    }
}