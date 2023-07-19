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
		//Printing an array Elements
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
/* Updating Array Elements */
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
		System.out.println();
		arr[0]=10;
		arr[1]=9;
		arr[2]=8;
		arr[3]=7;
		arr[4]=6;
		System.out.println();
		System.out.println("Updated Array Elements are");
		for(int i=0;i< arr.length;i++) {
			System.out.print(arr[i]+" ");
	}

}


	
/*Remove even integer from an Array*/


package one_Dimentional_Array;

import java.util.Scanner;

public class Remove_Even_Integer {

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
				sc.close();
				print(arr);
				int[] arr2=remove(arr);
				System.out.println("After Removing Even Integer From An Array:");
				print(arr2);
	}
	public static int[] remove(int arr[]) {
		int count=0;
		for(int i=0;i< arr.length;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		}
		int[] arr1=new int[count];
		//Removing even integer
		int j=0;
		for(int i=0;i< arr.length;i++) {
			if(arr[i]%2!=0) {
			arr1[j]=arr[i];
			j++;
			}
		}
		return arr1;
	}
	public static void print(int arr[]) {
		//Printing array Elements
		System.out.println("Array Elements are");
		for(int i=0;i< arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

/*Reversing an given Array */

package one_Dimentional_Array;
import java.util.Scanner;

public class Reverse {

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
						sc.close();
						print(arr);
						reverse(arr ,0,n-1);
						System.out.println("Reverse Of An Array");
						print(arr);
			}
	public static void reverse(int arr[],int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
			public static void print(int arr[]) {
				//Printing array Elements
				System.out.println("Array Elements are");
				for(int i=0;i< arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
	}
}

/* Find Minimum Element in an Array*/

package one_Dimentional_Array;
import java.util.Scanner;

public class MinElement {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The number array Elements:");
		int n=sc.nextInt();
		System.out.println("Enter the Array Elements:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		printArray(arr);
		MinElement m=new MinElement();
		int res=m.Min(arr);
		System.out.println("Minimum Element in an array is:"+res);
		sc.close();

	}
	public static void printArray(int[] arr) {
		System.out.println("Array Elements Are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public int Min(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}

}

/*Find Second Maximum Value In An Array*/
package one_Dimentional_Array;

import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The number array Elements:");
		int n=sc.nextInt();
		System.out.println("Enter the Array Elements:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		printArray(arr);
		SecondMax m=new SecondMax();
		int res=m.findSec(arr);
		System.out.println("Second Max Value:"+res);
		sc.close();

	}
	public static void printArray(int[] arr) {
		System.out.println("Array Elements Are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public int findSec(int arr[]) {
		int f=arr[0];
		int s=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>f) {
				s=f;
				f=arr[i];
			}else if(arr[i] > s && arr[i]!= f){
				s=arr[i];
			}
		}
		return s;
		
	}

}



/*Move All Zero to End Of An Array */




