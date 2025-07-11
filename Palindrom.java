/* Author = Lakshmy Byju
 * Date=11/07/2025
 * About=Check the number is Palindrome
 */
import java.util.Scanner;
public class Palindrom {
	public static void main(String[] arge) {
		Scanner scn = new Scanner(System.in);
				System.out.println("Enter the number");
		int num=scn.nextInt();
		int orgin=num;
		int reverse=0,remainder;
		while(num>0) {
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		if(orgin==reverse) {
			System.out.println("num is palindrome");
		}
		else {
			System.out.println("num is not a palindrome");
		}
	}

}
