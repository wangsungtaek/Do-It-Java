package object;

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentId + "," + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
		} else return false;
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student sudentSang = new Student(100, "이상원");
		
		if(studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2의 동일합니다.");
		} else {
			System.out.println("studentLee와 studentLee2의 동일하지 않습니다.");
		}
		if(studentLee == sudentSang) {
			System.out.println("studentLee와 sudentSang의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 sudentSang의 주소는 다릅니다.");
		}
		if(studentLee.equals(sudentSang)) {
			System.out.println("studentLee와 sudentSang의 동일합니다.");
		} else {
			System.out.println("studentLee와 sudentSang의 동일하지 않습니다.");
		}
		System.out.println();
		
		System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
		System.out.println("sudentSang의 hashCode : " + sudentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("sudentSang의 실제 주소값 : " + System.identityHashCode(sudentSang));
	}

}
