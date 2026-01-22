// Stack 
// in JAVA

import java.util.*;

class StackDemo {

	public static void main(String[] args) {
	
		Stack<Integer> st = new Stack<Integer>();

		st.push(10);
		st.push(20);
		st.push(30);

		System.out.println(st);   // 10,20 30

		System.out.println(st.pop());
		System.out.println(st);

		System.out.println(st.peek());
		System.out.println(st);

		System.out.println(st.empty());
		
	
	}
}
