/* Author=Lakshmy Byju
 * Date=11/07/25
 */
import java.util.Scanner;
public class Gradeperfomence {
	public static void main(String[] args)
	Scanner Scn=new Scanner(System.in);
	{
		String grade="C";
		
		String result = switch (grade) {
		case "O"  ->"Outstanding Pereformance";
		case "A+" ->"Excellent Performance";
		case "A"  ->"Very Good Performance";
		case "B+" ->"Good Performance";
		case "B"  ->"Above Avaerge Performance";
		case "C"  ->"Average Performance";
		case "P"  ->"Passed";
		case "F"  ->"Failed";
		default   ->"Invalid Grade";
		};
		System.out.println("Grade:"+grade);
		System.out.println("Result:"+result);
	}

}
