package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("lee gee won");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + "학번" + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("Son soo kung");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + "학번" + studentSon.studentID);
	}

}