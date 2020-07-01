package sirQuestionsAndTest1;
import java.util.Scanner;
public class Program60MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=10;i++) {
int product=n*i;
System.out.println(product);
		}

	}

}
