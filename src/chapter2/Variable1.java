package chapter2;

public class Variable1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		if(operator == '+') {
			System.out.println(num1+num2);
		}
		else if(operator == '-') {
			System.out.println(num1-num2);
		}
		else if(operator == '*') {
			System.out.println(num1*num2);
		}
		else if(operator == '/') {
			System.out.println(num1/num2);
		}
		
		switch(operator) {
			case '+' : System.out.println(num1+num2);
			break;
			case '-' : System.out.println(num1-num2);
			break;
			case '*' : System.out.println(num1*num2);
			break;
			case '/' : System.out.println(num1/num2);
			break;
		}
		System.out.println();
		int dan;
		int times;
		int i;
		int i2;
		
		int space=3;
		int star=1;
		int line; 
	
		
		for(line=1; line <= 7; line++) {
			for(i = 0; i<space; i++) {
				System.out.print(' ');
			}
			for(i2 = 0; i2<star; i2++) {
				System.out.print('*');
			}
			for(i = 0; i<space; i++) {
				System.out.print(' ');
			}
			if(line <= 3) {
				star += 2;
				space -= 1;
			}
			else {
				star -= 2;
				space += 1;
			}
			
			System.out.println();
		}
	
		
/*		
		for(dan=2; dan<=9; dan++) {
			if(dan%2!=0) continue;
			for(times=1; times<=9; times++) {
				System.out.println(dan + "*" + times + "=" + dan*times);
			}
			System.out.println();
		}
*/
/*
		for(dan=2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				if(times > dan) break;
				System.out.println(dan + "*" + times + "=" + dan*times);
			}
			System.out.println();
		}
 */
	}
}