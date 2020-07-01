package module1;
import java.util.Scanner;

public class Peogram7fahToCel {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
int fah=scan.nextInt();
int cel=(int)((5.0/9)*(fah-32));
System.out.println(cel);
}

}
