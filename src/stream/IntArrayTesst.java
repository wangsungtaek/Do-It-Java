package stream;

import java.util.*;

public class IntArrayTesst {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,8};
		
		Arrays.stream(arr).forEach(s -> System.out.print(s));
		System.out.println();
		int sum = Arrays.stream(arr).sum();
		int size = (int)Arrays.stream(arr).count();
		System.out.println(sum);
		System.out.println(size);
	}
}
