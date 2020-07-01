package module4program;
import java.util.Scanner;
public class interestingalpabets {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	if((n>=0)&&(n<=26)) {
	int i=1;
	
	while(i<=n) {
	int j=1;
	char strtval=(char)('A'+n-i);
	while(j<=i)
	{		System.out.print(strtval);
		strtval=(char)(strtval+1);
		j=j+1; 
	}
System.out.println();
i=i+1;}
	}

}
}