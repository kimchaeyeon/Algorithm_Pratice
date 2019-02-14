import java.util.Scanner;

public class Main {
	static int z=0;
	static int o=0;
	
	public static int fibonacci(int N){	
		if (N == 0) {
			z++;
	        return 0;
	    } else if (N == 1) {
	        o++;
	    	return 1;
	    } else {
	        return fibonacci(N-1) + fibonacci(N-2);
	    }	
	}
	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);
		int T= scan.nextInt();
	
		while(T !=0){
			int N =scan.nextInt();
			fibonacci(N);
			System.out.println( z +" "+o);
			z=0;
			o=0;
			T--;
	
		}	
    }

}
