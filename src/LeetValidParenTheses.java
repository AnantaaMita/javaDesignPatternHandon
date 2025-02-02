import java.util.*;
public class LeetValidParenTheses {
    public static void main(String[] args) {
        String expr = "(){}[]";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
    static boolean areBracketsBalanced(String s)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
                = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < s.length(); i++) {
            char x=s.charAt(i);
            if(x=='('||x=='{'||x=='['){
                stack.push(x);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            char check;
            switch (x){
                case ')':
                    check =stack.pop();
                    if(check=='{'||check=='['){
                        return false;
                    }
                    break;
                case '}':
                    check =stack.pop();
                    if(check=='('||check=='['){
                        return false;
                    }
                    break;
                case ']':
                    check =stack.pop();
                    if(check=='('||check=='{'){
                        return false;
                    }
                    break;
            }

        }
        return (stack.isEmpty());

    }

}
