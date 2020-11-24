package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		Student3 studentWang = new Student3();
		studentWang.setStudentName("wang sung taek");
		System.out.println(studentWang.getStudentName()+" card number : "+Student3.getCardNum());
		
		Student3 studentLee = new Student3();
		studentLee.setStudentName("Lee young jin");
		System.out.println(studentLee.getStudentName()+" card number : "+Student3.getCardNum());
	}

}
