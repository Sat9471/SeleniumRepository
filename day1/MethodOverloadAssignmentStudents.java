package week3.day1;

public class MethodOverloadAssignmentStudents {

	//Methods: getStudentInfo() by passing id argument alone
	public void getStudentInfo(int id) {
System.out.println("Student ID: "+ id);
	}
	
	//Methods: getStudentInfo() method by passing id argument alone
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID is "+id+" and name of the Student is "+name);
	}
	
	 //Methods: getStudentInfo() method by passing arguments for id & name
//    public void getStudentInfo(String email, long phoneNumber) {
//	}
    
  //create object(instance) for the above class method by passing arguments for email & phoneNumber
    public static void main(String[] args) {
		
	MethodOverloadAssignmentStudents mols=new MethodOverloadAssignmentStudents();
    mols.getStudentInfo(17);
    mols.getStudentInfo(17, "Tom");
//    mols.getStudentInfo("abc123@outlook.com", 98765432109);
    
}
}    
