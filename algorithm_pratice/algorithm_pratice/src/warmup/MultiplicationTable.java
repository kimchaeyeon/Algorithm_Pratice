package warmup;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		kb.close();
		for(int i=1; i<10; i++){
			System.out.println( n + " * " + i + " = " + n*i);
		}
	}

}
