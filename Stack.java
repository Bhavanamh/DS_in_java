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





				

