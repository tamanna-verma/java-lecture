package sirQuestionsAndTest1;
import java.util.Scanner;
public class Program59 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
int n=scan.nextInt();

for(int i=1;i<=n;i++) {int Sum=0;
	for(int j=1;j<=i;j++) {
Sum=Sum+j;
System.out.print(j);
	if(i>1&&j<i) {
		System.out.print("+");
	}
	if(j==i) { 
		System.out.print("="+Sum);
	}
	}

System.out.println();}
	}
}
