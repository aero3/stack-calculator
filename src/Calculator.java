import java.util.Stack;

public class Calculator {
	
	
	Stack<Integer> stack;
	
	// Constructor creates a empty Stack of type 'Integer'
	
	public Calculator() {
		
		stack = new Stack<Integer>();
		
	}
	
	// Push the integer passed in the parameter to the end of the stack

	public void loadConstant(int i) {
		stack.push(i);
		
	}
	
	// Adds the last 2 values in the stack, removes them and adds the result

	public void add() {
		
		// Check whether stack is empty
		
		if(stack.size() >= 2) {
			
			int numberTwo = stack.pop();
			int numberOne = stack.pop();
			
			int value = numberOne + numberTwo;
			stack.push(value);
			
		}
	}
	
	// Subtract the last 2 values in the stack, removes them and adds the result

	public void subtract() {
		
		// Check whether stack is empty
		
		if(stack.size() >= 2) {
			
			int numberTwo = stack.pop();
			int numberOne = stack.pop();
			
			int value = numberOne - numberTwo;
			stack.push(value);
			
		}
	}
	
	// Multiplies the last 2 values in the stack, removes them and adds the result

	public void multiply() {
		
		// Check whether stack is empty
		
		if(stack.size() >= 2) {
			
			int numberTwo = stack.pop();
			int numberOne = stack.pop();
			
			int value = numberOne * numberTwo;
			stack.push(value);
			
		}
	}
	
	// Divides the last 2 values in the stack, removes them and adds the result

	public void divide() {

		// Check whether stack is empty
		
		if(stack.size() >= 2) {
			
			int numberTwo = stack.pop();
			int numberOne = stack.pop();
			
			int value = numberOne / numberTwo;
			stack.push(value);
			
		}
	}
	
	// Return the stack as a string e.g "[1 2 3]." or "[1]."
	
	public String toString() {
		
		String stackAsString = "[";
		
		// Loop through the stack 

		for(int i = 0; i < stack.size(); i++) {
			
			// Check whether current value is last element in stack 
			// and if it is then do not add a space after the value
			// else add a space after the value
			
			if(stack.get(i) == stack.lastElement()) {
				stackAsString += stack.get(i);
			}else {
				stackAsString += stack.get(i) + " ";
			}
			
		}
		
		// Return the stack in the appropriate format
		
		stackAsString += "].";
		
		
		return stackAsString;
	}
	
	// Adds all the values in the stack, removes them and then adds the sum to the stack

	public void total() {
		
		int total = 0;
		
		for ( int number : stack) {
			
			total += number;
			
		}
		
		stack.removeAllElements();
		stack.push(total);
		
	}

}
