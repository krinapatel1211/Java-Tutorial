package LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "})[]{}";

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (Character ch : s.toCharArray()){
            if (stack.isEmpty()){
                stack.push(ch);
            }
            else{
                System.out.println(stack.peek() + " " + map.get(ch));
                if (stack.peek().equals(map.get(ch))){
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("Valid");
        }
        else{
            System.out.println("NOT VALID");
        }


    }
}
