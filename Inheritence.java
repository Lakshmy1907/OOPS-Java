/* Author:Lakshmy Byju
 * Date:8-08-2025
 */
class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displaydetails() {
		System.out.println("title=\t"+ title);
		System.out.println("author=\t"+author);
		System.out.println("price=\t"+price);
		}
}
class EBook extends Book{
	double filesize;
	EBook(String title,String author,double price,double filesize){
		super(title,author,price);
		this.filesize=filesize;
	}
	public void displaydetails() {
		super.displaydetails();
		System.out.println("filesize=\t"+filesize);
	}
}
class PrintedBook extends Book{
	int numberofpages;
	PrintedBook(String title,String author,double price,int numberofpages){
	super(title,author,price);
	this.numberofpages=numberofpages;
	}
	public void displaydetails() {
		super.displaydetails();
		System.out.println("numberofpages=\t"+numberofpages);
	}
}
public class Inheritence {
	public static void main(String[]args) {
		EBook ebook=new EBook("It Starts with us","Colleen Hoover",600.24,100.00);
		ebook.displaydetails();
		System.out.println();
		PrintedBook book=new PrintedBook("It Ends with us","Colleen Hoover",600.24,100);
		book.displaydetails();
		
	}
}
