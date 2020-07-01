package module2;
import java.util.Scanner;
public class Program11GreatestOf3{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if((a>=b)&&(a>=c)){  
			System.out.println("a is largest");
			return;
		}
		else if((b>=c)&&(b>=a)){ 
			System.out.println("b is largest");
			return;
		}else { 
			System.out.println("c is largest");
		}

	}

}
