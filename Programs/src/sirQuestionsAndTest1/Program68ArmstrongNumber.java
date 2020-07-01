package sirQuestionsAndTest1;
import java.util.Scanner;
public class Program68ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();int count=0;
		int sum=0;int storeN=n;
		while(storeN>0) {
			count++;
			storeN=storeN/10;	
		}
		while(n>0) {int rem=n%10;
		sum=(int)(sum+Math.pow(rem, count));
		n=n/10;
		}
		if(sum==n) {
System.out.print("true");
}else {
	System.out.print("false");
}
	}

}
