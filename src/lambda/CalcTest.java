package lambda;

public class CalcTest {
	public static void main(String[] args) {
		Calc c = (a,b) -> (a+b);
		System.out.println(c.add(10, 20));
	}
}
