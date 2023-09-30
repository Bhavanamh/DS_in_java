/*Implementation of Stack Using Singly Linked List */

			package stack;
			import java.util.*;
			public class PushandPop {
				private List top;
				private int len;
				private class List{
					private int data;
					private List next;
					public List(int data) {
						this.data=data;
					}
				}
				public PushandPop() {
					this.top=null;
					this.len=0;
				}
				public boolean isEmpty() {
					return len==0;
				}
				public int length() {
					return len;
				}
				public int peek() {
					if(isEmpty()) {
						throw new EmptyStackException();
					}
					return top.data;
				}
				public void push(int data) {
					List temp=new List(data);
					temp.next=top;
					top=temp;
					len++;
				}
				public int pop() {
					if(isEmpty()) {
						throw new EmptyStackException();
					}
					int res=top.data;
					top=top.next;
					len--;
					return res;
				}
				public static void main(String[] args) {
					PushandPop t=new PushandPop();
					t.push(5);
					t.push(4);
					t.push(3);
					t.push(2);
					t.push(1);
					System.out.println("Top of the Stack ="+t.peek());
					t.pop();
					System.out.println("Top of the Stack ="+t.peek());
					t.pop();
					System.out.println("Top of the Stack ="+t.peek());
					t.pop();
					System.out.println("Top of the Stack ="+t.peek());
					t.pop();
					System.out.println("Top of the Stack ="+t.peek());
					t.pop();
					System.out.println("Top of the Stack ="+t.peek());
					t.pop();
					System.out.println("Top of the Stack ="+t.peek());
					
					
				}
			
			}


/* Reverse a given String Using Stack data structure */

				package stack;
				import java.util.Stack;
				public class Reverse {
				public static String reverse(String s) {
					Stack<Character> stack=new Stack<>();
					char[] c= s.toCharArray();
					for(char ch:c) {
						stack.push(ch);
					}
					for(int i=0;i<s.length();i++) {
						c[i]=stack.pop();
					}
					return new String(c);
				}
				public static void main(String args[]) {
					String str="ABCD";
					System.out.println("Before Reverse="+str);
					System.out.println("After Reverse="+reverse(str));
				}
				}


/*  
Given a string s, containing just the characters (, ), 'T', 'T', '{' and '}', determine if the input string is valid. An input string is valid if:

An input string is Valid if:

Open brackets must be closed by same type of brackets.
Open brackets must be closed in correct order.
Example -
Input: str = "{()}" Output: true 
Input: str = "[]" Output: false
Input: str = "{()" Output: false
*/

package stack;
import java.util.*;
public class ValidParanthesis {

	public static void main(String[] args) {
		ValidParanthesis v=new ValidParanthesis();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		boolean b=v.isValid(s);
		if(b==true) {
			System.out.println("Entered string is valid parantisis");
		}
		else
			System.out.println("Entered string is not valid parantisis");
	}
	public boolean isValid(String s) {
		Stack<Character> stack=new Stack<>();
		char[]str =new char[s.length()];
				str=s.toCharArray();
				for(char c:str) {
					if(c=='('||c=='{'||c=='[') {
						stack.push(c);
					}
					else if(stack.isEmpty()) {
						return false;
					}
					else {
						char top=stack.peek();
						if((c==')'&&top=='(')||(c=='}'&&top=='{')||(c==']'&&top=='[')) {
							stack.pop();
						}
						else
							return false;
					}
					
				}
				return stack.isEmpty();
	}

}



				

