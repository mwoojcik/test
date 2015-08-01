package algo;

import java.util.Stack;

public class Nesting {

	public static void main(String[] args) {
		String a = "VW";
		String b = "[t[t]t]";
		String c = "[t[t}t]";
		String d = "())";
		
		System.out.println(solution(d));
	}
	
	public static int solution(String s) {
        
		boolean isValid = true;
		
        Stack<Character> stack = new Stack<Character>();
        String openingBrackets = "{[(";
        
        char currentChar, lastOnStack = ' ';
        
        if (s != null && s.length() > 0) {
        	
        	for (int i = 0; i < s.length(); i++) {
        		
        		currentChar = s.charAt(i);
        		
        		if (stack.size() > 0) {
        			lastOnStack = stack.get(stack.size()-1);
        		}

        		if (currentChar == ')') {
        			if (lastOnStack != '(') {
        				isValid = false;
        			} else {
        				stack.remove(stack.size()-1);
        				lastOnStack = ' ';
        			}
        		}
        		
        		if (currentChar == '}') {
        			if (lastOnStack != '{') {
        				isValid = false;
        			} else {
        				stack.remove(stack.size()-1);
        				lastOnStack = ' ';
        			}
        		}
        		
        		if (currentChar == ']') {
        			if (lastOnStack != '[') {
        				isValid = false;
        			} else {
        				stack.remove(stack.size()-1);
        				lastOnStack = ' ';
        			}
        		}
        		
        		if (openingBrackets.indexOf(currentChar) != -1) {
        			stack.add(currentChar);
        		}
        	}
        }
               
        return isValid ? 1 : 0;
    }

}
