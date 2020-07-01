package module6programs;
import java.util.Scanner;
public class checkingNumberSequence {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		boolean is_decreasing=true;
		
		int prev=scan.nextInt();
		if(n==0)
		{

			System.out.println(true);
			return;
		}
		int count=1;
		while(count<n)
		{
			int current=scan.nextInt();

			if(prev>current) {
				is_decreasing=true;
			}

			if(prev==current){
				System.out.println(false);
				return;
			}
			if(prev<current) {
				is_decreasing=false;
				
				if(prev==current) {

					System.out.println(false);
				return;}

				if(is_decreasing) {if(prev>current)
				{System.out.println(false);
				return;}}

				count=count+1;
				prev=current;

			}
			System.out.print(true);

		}

	}}