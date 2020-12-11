package stream.others;

import java.util.*;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름:");
		String name = scanner.nextLine();
		System.out.println("직업:");
		String jab = scanner.nextLine();
		System.out.println("사번:");
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(jab);
		System.out.println(num);
	}
}
