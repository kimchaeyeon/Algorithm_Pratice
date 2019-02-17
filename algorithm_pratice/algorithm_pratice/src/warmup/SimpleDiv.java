package warmup;

import java.util.Scanner;

public class SimpleDiv{

	public static void main(String[] args) {
		float a=0,b=0;
		double d;
		Scanner kb = new Scanner(System.in);
		a = kb.nextInt();
		b = kb.nextInt();
		kb.close();
		d =  a / (double) b;
		System.out.println(d);
	}

}