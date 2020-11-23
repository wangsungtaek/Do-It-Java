package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "Kim";
		personKim.weight = 85.5f;
		personKim.height = 180.0f;
		
		Person personLee = new Person("Lee", 175, 75);
	}

}
