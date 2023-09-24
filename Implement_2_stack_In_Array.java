import java.util.* ;
import java.io.*; 
public class TwoStack {

	// Initialize TwoStack.
	int arr[] ;
	int top1 ;
	int top2 ;
	int size; 
	public TwoStack(int s) {
		this.size = s ;
		arr = new int[s];
		top1 = -1 ;
		top2 = s ;
	}

	// Push in stack 1.
	public void push1(int num) {
		if(top2 - top1  >1){
			top1++;
			arr[top1] = num;
		}
	}

	// Push in stack 2.
	public void push2(int num) {
		if(top2 - top1  >1){
			top2--;
			arr[top2] = num;
		}
	}

	// Pop from stack 1 and return popped element.
	public int pop1() {
		if(top1 == -1){
			return -1;
		}
		int poppedElement = arr[top1];
		top1--;
		return poppedElement;
	}

	// Pop from stack 2 and return popped element.
	public int pop2() {
		if(top2 == size){
			return -1;
		}
		int poppedElement = arr[top2];
		top2++;
		return poppedElement;
	}

}
