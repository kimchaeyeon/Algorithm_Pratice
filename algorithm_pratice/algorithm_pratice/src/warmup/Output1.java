package warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class Output1 {
	public static void main(String[] args){
		ArrayList<String> a = new ArrayList<String>(); 
		Scanner kb = new Scanner(System.in);
		while(kb.hasNextLine()){
			a.add(kb.nextLine());
		}
		kb.close();
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}

	}
	
}
