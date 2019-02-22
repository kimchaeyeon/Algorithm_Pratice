package warmup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0,n=0,nn=0,a=0,b=0;
		Scanner kb = new Scanner(System.in);
		N = kb.nextInt();
		kb.close();
		if(N<5){
			if(N == 3){
				System.out.println("1");
			}
			else{
				System.out.println("-1");
				}
		}
		else {
			if(N%5 == 0){
				System.out.println(N/5);
			}
			else {
				a = N/5;
				b = N/3;
				n = N - a*5;
				nn = N - b*3;
				if(n%3 == 0){
					System.out.println(a+ n/3);
				}
				else{
					//3으로 나누어지거나
					if(nn%5 == 0){
						System.out.println(b+ nn/3);
					}
					else if(N%3 == 0){
						System.out.println(N/3);
					}
					else{
						System.out.println("-1");
					}
					//3으로 나눈거랑 5로 나눈게 나누어 떨어지거나
					//아니거나
				}
				
			}
		}
		

	}

}
