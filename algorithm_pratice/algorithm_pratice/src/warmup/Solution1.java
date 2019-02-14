package warmup;
import java.io.IOException;
import java.util.Scanner;

 
public class Solution1 {


	 

	    /*

	     * Complete the 'winner' function below.

	     *

	     * The function is expected to return a STRING.

	     * The function accepts following parameters:

	     *  1. INTEGER_ARRAY andrea

	     *  2. INTEGER_ARRAY maria

	     *  3. STRING s

	     */

	 

	public class Solution {

		public String winner(int [] andrea, int [] maria, String s) {

			String win=null;

			int n = andrea.length;

			int mScore[] = new int[n];

			int aScore[] = new int[n];

			int cScore_a=0;

			int cScore_m=0;

			if(s.equalsIgnoreCase("even")){

				for(int i=0; i<n; i+=2){

					int j=0;//j

					aScore[j]= andrea[i]-maria[i];

					mScore[j]= maria[i]-andrea[i];

					cScore_a += aScore[j];

					cScore_m += mScore[j];

					j++;

				}

			}

			else if(s.equalsIgnoreCase("odd")){

				for(int i=1; i<n; i+=2){

					int j=0;

					aScore[j]= andrea[i]-maria[i];

					mScore[j]= maria[i]-andrea[i];

					cScore_a += aScore[j];

					cScore_m += mScore[j];

					j++;

				}

			}

			win = compare(cScore_a,cScore_m);

			return win;

		}

		

		private String compare(int cScore_a, int cScore_m) {

			String w = null;

			if(cScore_a > cScore_m){

				w = "Andrea";

			}

			else if(cScore_a < cScore_m){

				w = "Maria";

			}

			else if(cScore_a == cScore_m){

				w = "Tie";

			}

			return w;

		}

		

		public void main(String[] args) throws IOException {

	    	Scanner kb = new Scanner(System.in);

	    	

	        int andreaCount = kb.nextInt();

	    	int andrea[] = new int[andreaCount];

	        for( int i=0; i<andreaCount; i++){

	        	andrea[i] = kb.nextInt();

	        }

	        int mariaCount = kb.nextInt();

	    	int maria[] = new int[mariaCount];

	        for( int i=0; i<mariaCount; i++){

	        	maria[i] = kb.nextInt();

	        }

	        String s = kb.next();

	        kb.close();

	        String result = winner(andrea, maria, s);

	        

	 

	        System.out.println(result);

	    }

	}

}
