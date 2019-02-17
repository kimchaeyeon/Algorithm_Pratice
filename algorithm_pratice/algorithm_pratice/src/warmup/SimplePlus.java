package warmup;

import java.util.Scanner;

public class SimplePlus {

	public static void main(String[] args) {
		int a=0,b=0;
		Scanner kb = new Scanner(System.in);
		a = kb.nextInt();
		b = kb.nextInt();
		kb.close();
		System.out.println(a + b);
	}

}
