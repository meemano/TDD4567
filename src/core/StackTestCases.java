package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {

	//TC1
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		assertEquals(true,s1.isEmpty());
		
		assertEquals(0,s1.getSize());
	}
	
	//TC2 
	public void testPushElmToTop() {
		
	
		//create new stack 
		Stack s = new Stack();
		
		
		//check whether the stack is full.
		boolean isFullStack = s.isFull() ;
		
		//if not full then push an element to the stack.
		if(isFullStack == false) {
			s.push(new Integer(1));
		
		
			//get top element of the stack.
			int topElm = (Integer)s.top();
		
		
			//assert that the top element is equal to the pushed element.
			assertEquals(1, topElm);
			
		}
		
		
		
		
	}
	
	
}
