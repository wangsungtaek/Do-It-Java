package staticex;

public class Student3 {

	private static int cardNum;
	public String studentName;
	public int grade;
	public String address;
	
	public Student3() {
		cardNum += 100;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

	public static int getCardNum() {
		return cardNum;
	}
	public static void setCardNum(int cardNum) {
		Student3.cardNum = cardNum;
	}
}
