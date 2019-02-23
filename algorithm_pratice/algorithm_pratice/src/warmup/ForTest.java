package warmup;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		kb.close();
		for( int i=1; i<=n; i++){
			System.out.println(i);
		}

	}

}
