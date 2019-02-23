package warmup;

import java.util.Scanner;

public class SugarDellivery {

	public static void main(String[] args) {
		int a=0,b=0;
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		kb.close();
		while( N%5!=0 && N>0){
				N -= 3;
				a++;
		}
		if(N<0){
			System.out.println("-1");
		}
		else{
			b = N/5;
			System.out.println(a + b);
		}

	}

}
