package ifelse;
import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n =scan.nextInt();
		int rem=n%2;
		if(rem==0){
			System.out.println("NO.IS EVEN");}
			else {
			System.out.println("NO.IS ODD");
			}
		//learning about return
		if(9%3==0) {
			System.out.println("9 is multiple of 3");
			return;
		}
			System.out.println("9 is not a multiple of 3");
		}
		

	}


