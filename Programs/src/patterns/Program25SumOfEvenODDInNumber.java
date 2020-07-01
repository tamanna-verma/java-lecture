package patterns;
import java.util.Scanner;
public class Program25SumOfEvenODDInNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int EvenDigitSum=0;
		int OddDigitSum=0;
		while(n>0)
		{	int num=n%10;
			if (num%2==0) {
		EvenDigitSum=	EvenDigitSum+num;
			
		}
		else if(num%2!=0) {
			
			OddDigitSum=OddDigitSum+num;
		}
		
n=n/10;
		}System.out.println(EvenDigitSum);
		System.out.println(OddDigitSum);
	}

}
