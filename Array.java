/*  Author:Lakshmy Byju
 *  Date:19-08-25
 */
import java.util.Scanner;

import javax.net.ssl.SNIHostName;
public class Array {
	public static void main (String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n =scn.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			array[i]=scn.nextInt();
	}
	System.out.println("the given array is");
	for(int num:array) {
		System.out.println(num+"\t");
	}
	System.out.println();
	int largest=array[0];
	for(int i=0;i<n;i++) {
		if(array[i]>largest) {
			largest=array[i];
		}
	}
	System.out.println("the largest element in the array i"+largest);
	}
	
	}

