/* Author:Lakshmy Byju
 * Date:18-07-25
 */

class student{
	String name;
	int rollnumber;
	String department;
	student(String name,int rollnumber,String department){
		this.name=name;
		this.rollnumber=rollnumber;
		this.department=department;
		}
	public void studentinfo() {
		System.out.println("name=\t"+name);
		System.out.println("rollnumber=\t"+rollnumber);
		System.out.println("department=\t"+department);
		
	}
}
public class Studentdetail {
	public static void main(String []args) {
		student Student=new student("Lakshmy",51,"CSE");
		Student.studentinfo();
		}
	

}
