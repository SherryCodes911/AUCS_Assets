package DSA_Lab_05_Ahtisham;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "()"
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * <p>
 * Output: true
 * <p>
 * Example 3:
 * <p>
 * Input: s = "(]"
 * <p>
 * Output: false
 * <p>
 * Example 4:
 * <p>
 * Input: s = "([])"
 * <p>
 * Output: true
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class Part_03_Task_01 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));

            else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                char c = stack.pop();
                if ((s.charAt(i) == ')' && c != '(') ||
                        (s.charAt(i) == ']' && c != '[') ||
                        (s.charAt(i) == '}' && c != '{'))
                    return false;
            }

        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
//        String s = "()";
//        String s = "()[]{}";
        String s = "(]";

        System.out.println(new Part_03_Task_01().isValid(s));

    }
}
