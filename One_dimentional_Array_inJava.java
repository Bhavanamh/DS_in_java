/* Array:Array is an collection of data elements of specified type */
/* Creating One Dimentional Array in Java */
package one_Dimentional_Array;

public class Creating_An_Array {

	public static void main(String[] args) {
		//array declaration and initialization
		int[] arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		//Printing array Elements
		System.out.println("Array Elements are");
		for(int i=0;i< arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}

/* initializing  array by User input */

package one_Dimentional_Array;
import java.util.Scanner;
public class Creating_An_Array {

	public static void main(String[] args) {
		//array declaration and initialization
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Array Elements");
		int n= sc.nextInt();
		int[] arr= new int[n];
		
		System.out.println("Enter Array Elements");
		for(int i=0;i< arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//Printing array Elements
		System.out.println("Array Elements are");
		for(int i=0;i< arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}

