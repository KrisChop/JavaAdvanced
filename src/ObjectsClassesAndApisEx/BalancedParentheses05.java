package ObjectsClassesAndApisEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BalancedParentheses05 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        if(isBalanced(input)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isBalanced( String input) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char parenthesis  = input.charAt(i);
            if(parenthesis == '[' || parenthesis == '(' || parenthesis == '{'){
                stack.addFirst(parenthesis);
            } else {
                if(!stack.isEmpty()) {
                    char first = stack.pop();
                    if (first == '{') {
                        if (parenthesis != '}') {
                            return false;
                        }
                    } else if (first == '[') {
                        if (parenthesis != ']') {
                            return false;
                        }
                    } else if (first == '(') {
                        if (parenthesis != ')') {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
