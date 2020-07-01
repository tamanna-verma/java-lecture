package sirQuestionsAndTest1;
import java.util.Scanner;
public class Program64OddSquare {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{int value=i*2-1;
		for(int j=1;j<=n;j++) 
		{
			System.out.print(value);
			value=value+2;
			if(value>n*2-1) {value=1;}
		}System.out.println();
		}
	}

}
