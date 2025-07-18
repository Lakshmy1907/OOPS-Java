/* Author:Lakshmy Byju
 * Date:18-07-25
 */
class book{
	String title;
	String author;
	double price;
	book() {
		title="Unknown";
		author="Not assigned";
		price=0.0;
		}
	public void displaydetails() {
		System.out.println("title=\t"+ title);
	    System.out.println("author=\t"+author);
	    System.out.println("price=\t"+price);
	    
	}
}
public class Bookdetails {
	public static void main (String[] args) {
		book books=new book();
		books.displaydetails();
	}
		
		}
	


