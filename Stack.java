// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// banspate

import java.io.InputStream;
import java.util.Scanner;

public class Stack <E>{
	
	private int top;
	
	private int size;
	
	private E [] stack;
	
	public Stack(){
		
		// Default size = 10
		size = 10;
		// Initialize new integer array.
		stack = (E[]) new Object[size];
		// Initialize the value of the top position.
		top = -1;
		
	}
	//set the stack size
	public Stack( int stackSize ){
		
		// Ensure that the stackSize entered is greater than 0.
		if(size > 0){
			
			size = stackSize;
			
		}else{
			
			System.out.println("Invalid Stack size!");
			
			System.out.println("Using default size of 10");
			
			size = 10;
		}
		stack = (E[]) new Object[size];
		top = -1;
		
	}
	//check to see if the stack is empty 
	public boolean isEmpty(){
		
		return top == -1;
		
	}
	//check to see if the stack is full the top value would be equal to size of stack if full
	public boolean isFull(){
		
		return top == size;
		
	}
	//retrieve the top element of the stack
	public E peek(){
		
		return stack[top];
		
	}
	public void push(E dataElement){
		//if the stack is full notify the user stack is full and cannot push further
		if(isFull()){
			
			System.out.println( " Your Stack is full! " );
			
		//else push the data element to the stack 
		}else{
			
			stack[++top] = dataElement;
			
		}
		
	}
	//pop the elements from the array
	public E pop(){
		//as long as stack is not empty pop the elements
		if(!isEmpty()){
		
			return stack[top--];
			
		}else{
			//if the stack is empty print cannot pop
			System.out.println( " Your Stack is empty cannot pop! " );
			
		}
		return stack[top];
	}
	
}
	
	
	
	
	
	
	
	
		
		
		