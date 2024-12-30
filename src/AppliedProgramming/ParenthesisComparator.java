package AppliedProgramming;

import java.util.Stack;

public class ParenthesisComparator {
    private boolean isbalanced = true;

    public boolean isParenthesisBalanced(Stack<String> listOfString) {
        Stack<Character> characterStack = new Stack<>();
        for (String str : listOfString) {
            char character = str.charAt(0);

            if (character == '{' || character == '(' || character == '[') {
                characterStack.push(character);
            } else if (character == ')' || character == '}' || character == ']') {

                if (characterStack.isEmpty()) {
                    isbalanced = false;
                    return isbalanced;
                }

                char topEle = characterStack.pop();
                System.out.println("poped out element " + topEle);

                if (!((character == ')' && topEle == '(') || (character == '}' && topEle == '{') || (character == ']' && topEle == '[')))
                {
                    isbalanced = false;
                    return isbalanced;
                }
            }
        }
        System.out.println("its balanced");
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