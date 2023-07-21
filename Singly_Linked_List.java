/*Create Singly Linked List */
package singlyLinkedList;

public class CreateSinglyLinkedList {
	private List head;
	public static class List{
		private int data;
		private List next;
		public List(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static void main(String[] args) {
		CreateSinglyLinkedList c=new CreateSinglyLinkedList();
		c.head=new List(1);
		List second = new List(2);
		List third= new List(3);
		c.head.next=second;
		second.next=third;
		third.next=null;
		c.display();
	}
	public void display() {
		List cur=head;
		while(cur!=null) {
			System.out.print(cur.data+"-->");
			cur=cur.next;
		}
		System.out.println("null");
	}

}


/*Find the length of singly linked List */


package singlyLinkedList;

public class FindLength {
	private List head;
	public static class List{
		private int data;
		private List next;
		public List(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static void main(String[] args) {
		FindLength c=new FindLength();
		c.head=new List(1);
		List second = new List(2);
		List third= new List(3);
		c.head.next=second;
		second.next=third;
		third.next=null;
		c.display();
		int res=c.Length();
		if(res==0)
			System.out.println("Empty List");
		else
			System.out.println("Length of List is:"+res);
	}
	public void display() {
		List cur=head;
		while(cur!=null) {
			System.out.print(cur.data+"-->");
			cur=cur.next;
		}
		System.out.println("null");
	}
	public int Length() {
		List cur=head;
		if(cur==null) {
			return 0;
		}
		int count=1;
		while(cur.next!=null) {
			count++;
			cur=cur.next;
		}
		return count;
	}
}



/*Insert Node at the beginning */

package singlyLinkedList;
import java.util.Scanner;
public class InsertBeginning {
	private List head;
	private static  class List{
		private int data;
		private List next;
		public List(int data) {
			this.data=data;
			this.next=null;
		}
		
	}
	public static void main(String[] args) {
		InsertBeginning in=new InsertBeginning();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of node");
		int n=sc.nextInt();
		System.out.println("Enter the node data");
		for(int i=0;i<n;i++) {
			int l=sc.nextInt();
			in.insertList(l);
		}
		in.display();
		sc.close();
		
		

	}
	public void insertList(int data) {
		List newnode=new List(data);
		newnode.next=head;
		head=newnode;
		
	}
	public void display() {
		List cur=head;
		while(cur!=null) {
			System.out.print(cur.data+"-->");
			cur=cur.next;
		}
		System.out.print("null");
		System.out.println();
	}

}



/*Insert node at the end*/

package singlyLinkedList;
import java.util.Scanner;


public class InsertAtEnd {
	private List head;
	private static  class List{
		private int data;
		private List next;
		public List(int data) {
			this.data=data;
			this.next=null;
		}
		
	}
	public static void main(String[] args) {
		InsertAtEnd in=new InsertAtEnd();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of node");
		int n=sc.nextInt();
		System.out.println("Enter the node data");
		for(int i=0;i<n;i++) {
			int l=sc.nextInt();
			in.insertList(l);
		}
		in.display();
		sc.close();

	}
	public void insertList(int data) {
		List newnode=new List(data);
		List cur=head;
		if(cur==null) {
			head=newnode;
		}
		else {
			while(cur.next!=null) {
				cur=cur.next;
			}
			cur.next=newnode;
		}
		
	}
	public void display() {
		List cur=head;
		while(cur!=null) {
			System.out.print(cur.data+"-->");
			cur=cur.next;
		}
		System.out.print("null");
		System.out.println();
	}

}






