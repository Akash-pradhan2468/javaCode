package assignment2;

import java.util.Stack;

public class PostfixEvaluation {
	public static boolean isNumber(char a) {
		if(a>=48&&a<=57) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="23*5+";
		 Stack<Integer> stack = new Stack<>();
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(isNumber(c)) {
				st.push(c-'0');
			}else {
				int d=st.pop();
				int b=st.pop();
				switch(c) {
				case '+':
					st.push(d+b);
		 			break;
				case '-':
					st.push(d-b);
		 			break;
				case '*':
					st.push(d*b);
		 			break;
				case '/':
					st.push(d/b);
				}
				
			}
			
		}
		System.out.println(st.pop());
//	       for (int i = 0; i < a.length(); i++) {
//	            char c = a.charAt(i);
//	 
//	            // If the scanned character is an operand
//	            // (number here), push it to the stack.
//	            if (Character.isDigit(c))
//	                stack.push(c - '0');
//	 
//	            //  If the scanned character is an operator, pop
//	            //  two elements from stack apply the operator
//	            else {
//	                int val1 = stack.pop();
//	                int val2 = stack.pop();
//	 
//	                switch (c) {
//	                case '+':
//	                    stack.push(val2 + val1);
//	                    break;
//	                case '-':
//	                    stack.push(val2 - val1);
//	                    break;
//	                case '/':
//	                    stack.push(val2 / val1);
//	                    break;
//	                case '*':
//	                    stack.push(val2 * val1);
//	                    break;
//	                }
//	            }
//	        }
//	       System.out.println(stack.pop());
	}

}
