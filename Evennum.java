/* Author = Lakshmy Byju
 * Date=11/07/2025
 * About=Check the number is even
 */
import java.util.Scanner;
public class Evennum {
	public static void main(String[] arg) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=scn.nextInt();
		int i;
		System.out.println("The even num upto n");
		for(i=2;i<limit;i+=2) {
			System.out.println(i);
		}		
	}

}
