import java.util.*;

class stack{
	private int arr[];
	private int top;
	
	public stack(int size) {
		arr=new int [size];
		int top=-1;
		 
	}
	public void push(int val) {
		if(isFull()){
			throw new RuntimeException("Stack is full");
		}
		top++;
	    arr[top]=val;
	}
	public void pop() {
		if(isEmpty())
			throw new RuntimeException("Stack is Empty");
		top--;
	}
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Stack is Empty");
		return arr[top];
	}
	public boolean isFull() {
		return top== arr.length-1;
	}
	public boolean isEmpty() {
			return top==-1;
	}
	
}
public class stackMain {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		stack s  = new stack(6);
		int choices;
		int val;
		do {
		System.out.println("/n 0.Exit /n 1.push /n 2.pop /n 3.peek/n Enter choices");
	    choices =sc.nextInt();
		switch(choices) {
		case 1: //push
			try {
				System.out.println("Enter a value ");
				val=sc.nextInt();
				s.push(val);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			break;
			
		case 2://pop
			try {		
				val=s.peek();
				s.pop();
				System.out.println("popped is:"+val);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case 3://peek
			try {		
				val=s.peek();
				System.out.println("peek/topmost:"+val);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
			
		}
		}while(choices!=0);
			
		sc.close();
	}

	private static void push(int val) {
		// TODO Auto-generated method stub
		
	}

}
