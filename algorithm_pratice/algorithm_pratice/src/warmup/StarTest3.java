package warmup;

import java.util.Scanner;

public class StarTest3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			kb.close();
			for(int i=n; i>=1; i--){
				for(int j=0; j<i; j++){
					System.out.print("*");
				}
				System.out.println("");
			}
	}

}
