package week3.day1;

public class Student extends Department {

//	 Class     :Student
//   Methods   :studentName(),studentDept(),studentId()
	
	public void studentName() {
		// TODO Auto-generated method stub
System.out.println("Name of the student");
	}
	
	public void studentDept() {
		System.out.println("Department of the student");
	}

	public void studentId() {
		System.out.println("Student ID");
	}
	
//	Description:
//	create above 3 class and call all your class methods into the Student using multilevel inheritance.

	public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		
	}
}
