package warmup;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		kb.close();
		for( int i=n; i>0; i--){
			System.out.println(i);
		}

	}

}