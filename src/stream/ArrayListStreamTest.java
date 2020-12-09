package stream;

import java.util.*;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Lee ");
		sList.add("Kim ");
		sList.add("Wang ");
		
		Stream<String> stream = sList.stream();
		stream.sorted().forEach(e -> System.out.print(e));
		System.out.println();
		sList.stream().forEach(e -> System.out.print(e));
		System.out.println();
		sList.stream().filter(s -> s.length() <= 4).forEach(s -> System.out.print(s));
		
		
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person("고길동",30));
		persons.add(new Person("송진우",40));
		persons.add(new Person("이영진",29));
		
		persons.stream().map(s -> s.name).forEach(s -> System.out.print(s));
		System.out.println();
		
		persons.stream().sorted().forEach(s -> System.out.print(s));
		System.out.println();
		
		int[] arr = {1,2,3};
		
		int s = Arrays.stream(arr).reduce(10,(a,b)->a+b);
		System.out.println(s);
	}
}

class Person implements Comparable {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Person) {
			Person p = (Person)o;
		return this.age - p.age;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
}