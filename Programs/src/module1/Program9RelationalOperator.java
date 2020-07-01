package module1;
import java.util.Scanner;
public class Program9RelationalOperator {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		int j=scan.nextInt();
		Boolean isEqual=(i==j);
		Boolean isGreater=(i>j);
		Boolean isSmaller=(i<j);
		Boolean isGreaterOrEqual=(i>=j);
		Boolean isSmallerOrEqual=(i<=j);
		System.out.println("i is equal to j"+ isEqual);
		System.out.println("i is greater than j"+isGreater);
		System.out.println("i is smaller than j"+isSmaller);
		System.out.println("i is greater than or equal to j"+isGreaterOrEqual);
		System.out.println("i is smaller than or equal to j"+isSmallerOrEqual);
	}

}
