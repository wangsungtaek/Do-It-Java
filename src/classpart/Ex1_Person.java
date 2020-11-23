package classpart;

public class Ex1_Person {
	int age;
	String name;
	boolean isMarried;
	int numberOfChildren;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
		
	}	
	public boolean isMarried() {
		return isMarried;
	}	
	public int getNumberOfChildren() {
		return numberOfChildren;
	}	
	
	public static void main(String[] args) {
		Ex1_Person person = new Ex1_Person();
		
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChildren = 3;
		
		System.out.println("이 사람의 나이 " + person.getAge());
		System.out.println("이 사람의 이름 " + person.getName());
		System.out.println("이 사람의 결혼 여부 " + person.isMarried());
		System.out.println("이 사람의 자녀 수 " + person.getNumberOfChildren());

	}

}
