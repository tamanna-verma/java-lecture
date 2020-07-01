package sirQuestionsAndTest1;
import java.util.Scanner;
public class Program66Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				int value=n-j+1;
				if(j==n-i+1) {
					System.out.print("*");
					}else {
			System.out.print(value);
			
					}
			
			}System.out.println();
		}

	}

}
