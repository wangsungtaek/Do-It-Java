package stream;

import java.util.*;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String t, String u) {
		if(t.getBytes().length >= u.getBytes().length) {
			return t;
		}
		return u;
	}
}

public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~","hello","Good moning","반갑습니다!^^"};
	
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2) -> {
							if(s1.getBytes().length >= s2.getBytes().length)
							 return s1;
							else return s2;
							}));
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}
}