// Problem - 4
// Two Sorted stack -> 3rd Stack  Merge Two sorted Stack

import java.util.*;
class MergeStacks{

	Stack<Integer> mergeStacks(Stack<Integer> s1,Stack<Integer> s2) {
	
		Stack<Integer> s3 = new Stack<Integer>();

		while(!s1.empty() && !s2.empty()) {
		
			if(s1.peek() > s2.peek()) {
			
				s3.push(s1.pop());
			} else {
			
                               s3.push(s2.pop());
			}
		}
		while(!s1.empty()) {
			s3.push(s1.pop());
		}
		while(!s2.empty()) {
                        s3.push(s2.pop());
                
		}
		while(!s3.empty()) {
                        s2.push(s3.pop());

		}
		return s2;
	}

	
}
class Client {

	public static void main(String[] args){
          Stack<Integer> s1 = new Stack<Integer>();
	  Stack<Integer> s2 = new Stack<Integer>();

	  s1.push(10);
          s1.push(30);
	  s1.push(50);
	  s1.push(70);

	  s2.push(20);
	  s2.push(40);
	  s2.push(60);
	  s2.push(80);
	  s2.push(100);


	  MergeStacks ms = new MergeStacks();
	  Stack s3 = ms.mergeStacks(s1,s2);

	  System.out.println(s3);

	}
}
