class Student{
    String name;
	int rollnumber;
	static int student_count;
	
	Student(String name,int rollnumber){
		this.name=name;
		this.rollnumber=rollnumber;
		student_count++;
	}
	
	public static void displaystudentcount() {
	System.out.println(student_count);
	}
}

public class Staticstudent{
	public static void main(String[]args) {
			Student s1=new Student("Lakshmy",51);
			Student s2=new Student("Sivapriya",66);
			Student s3=new Student("Diya",33);
		    Student.displaystudentcount();
	}
}
