
public class ReverseOFSTACK {

	public static void main(String[] args) throws Exception {
		StackOperations stack = new StackOperations();
		for (int i = 1; i <= 10; i++) {
			stack.push(i * 10);
			}
			stack.display();
		StackOperations helper = new StackOperations();
		reverseStack(stack,helper,0);
		stack.display();
	}
	
	public static void reverseStack(StackOperations stack , StackOperations helper,int index) throws Exception {
		if(stack.isEmpty()) {
			return;
		}
		
		
		int item  = stack.pop();
		reverseStack(stack, helper, index+1);
		helper.push(item);
		if(index==0) {
			while(!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
	}
	

}
