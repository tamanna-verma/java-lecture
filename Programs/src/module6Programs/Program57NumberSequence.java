package module6Programs;
import java.util.Scanner;
public class Program57NumberSequence {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int prev=scan.nextInt();
		Boolean isDecreasing=true;
		int count=1;
		while(count<n) {
			int current=scan.nextInt();
			if(prev==current) {
				System.out.println(false);
				return;
			}
			if(isDecreasing) {
				if(prev<current) {
					isDecreasing=false;
				} 
			}
			else {if(prev>current)
			{System.out.println(false);
			return;
			}
			}
			
			count++;
			prev=current;
			

	}
	System.out.println(true);
}

}
