package module2;
import java.util.Scanner;
public class Program16FahToCelTable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int startFah=scan.nextInt();
		int stepsize=scan.nextInt();
		int endFah=scan.nextInt();
		while(startFah<=endFah) {

			int cel=(int)((5.0/9)*(startFah-32));
			
			System.out.println(startFah+" "+cel);
			
			
			startFah=startFah+stepsize;
			
			
		}
		
	}

}
