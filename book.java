package project2;

 class book {
	 String title;
	 String author;
	  final int bookID ;
	  static int bookcounter=1000;
	  final static String LIBRARY_NAME=" CENTRAL LIBRARY";
       book(){
    	   title="No title";
    	   author="Unknown";
    	   bookID=bookcounter;
    	   bookcounter++;
       }
 }
       public void Displayinfo() {
    	   System.out.println("Book Title:"+title);
    	   System.out.println("Book Author:"+author);
    	   
       }
       public void Displayinfo(boolean showLibrary) {
    	   if(showLibrary) {
    		   Displayinfo();
    		   System.out.println("Library Name:"+LIBRARY_NAME);
    		   
    	   }
    	   
       }
      public static void DisplayTotalbooks() {
    	  System.out.println("Total Books:"+(bookcounter));
      }
 
	  public class Main{
	public static void main(String[] args) {
		book Book= new book();
		Book.Displayinfo(true);
		book.DisplayTotalbooks();
	}
	  }	
	
	


