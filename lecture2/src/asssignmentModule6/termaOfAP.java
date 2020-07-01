package asssignmentModule6;
import java.util.Scanner;
public class termaOfAP {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x= scan.nextInt();
		int count =1;
		for(int n=1;n<=1000&& count<=x;n++) 
		{
			int Series_number=(3*n)+2;

			if(Series_number%4!=0) {
				System.out.print(Series_number+" ");
				count++;

			}
		}
	}
}



/// /congo yha shi h bas ,vha kyu glt btara h sai chl rha h  wah bhi
//nope