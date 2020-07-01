package whileloop;
import java.util.Scanner;
public class patterns {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//i=row,j=box
		int n=scan.nextInt();
		int i=1;
		while(i<=n) { 
		int	j=1; 
		while (j<=i)
		{System.out.print(j);
		j=j+1;
		}
		System.out.println();
		
				i=i+1;
		}
		
	}

}
