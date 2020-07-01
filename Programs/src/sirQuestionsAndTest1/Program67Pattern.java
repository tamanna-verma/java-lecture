package sirQuestionsAndTest1;
import java.util.Scanner;
public class Program67Pattern {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=((n*2)+1);j++)
	{if(i==j) {
		System.out.print("*");
	}else if(j==(n+1+n-i+1)) {
		System.out.print("*");
	
	}
	else if(j==n+1)
		{
			System.out.print("*");
		}else
		{
		System.out.print("0");
		}
	}
		System.out.println();}
		
	}

	}


