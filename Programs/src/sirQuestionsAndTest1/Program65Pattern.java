package sirQuestionsAndTest1;
import java.util.Scanner;
public class Program65Pattern
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
for(int i=1;i<=n+1;i++)
{
	int value=1;
	int val=i-2;
	for(int j=1;j<=i*2-1;j++)
	{if(j==1||j==i*2-1)
	{
	System.out.print("*");
}
		if(j>1&&j<=i)
		{System.out.print(value);
		value++;
		
		}
		if(j>i&&j<i*2-1)
		{
			System.out.print(val);
			val--;
		}
		
	}System.out.println();
} 
for(int i=n;i>0;i--) {int val=1;
int value=i-2;
for(int j=1;j<=2*i-1;j++) {
	
	if(j==1||j==2*i-1) {
		System.out.print("*");
	}else if(j>1&&j<=i) {
		System.out.print(val);
		val++;
	}
	else if(j>i&&j<2*i-1) {
		
		System.out.print(value);
		value--;
	}
	

}	System.out.println();
	}
	}
}
