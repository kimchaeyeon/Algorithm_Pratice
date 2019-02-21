package warmup;

import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) {
		int a=0,b=0,c=0;
		Scanner kb = new Scanner(System.in);
		a = kb.nextInt();
		b = kb.nextInt();
		c = kb.nextInt();
		kb.close();
		System.out.println((a+b)%c);
		System.out.println((a%c + b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c * b%c)%c);
	}

}
