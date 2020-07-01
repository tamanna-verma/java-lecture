package sirQuestionsAndTest1;
import java.util.Scanner;
public class Program61Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int multiply=1;
		int value=1;
		for(int i=1;i<=n;i++) {
			int j=1;
			while(j<=multiply)
			{if(value>9) {value=1;}
				System.out.print(value);
				value++;
				j++;
			}
			multiply=multiply*2;
			System.out.println(); }

	}

}
