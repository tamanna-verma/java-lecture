package ClassesAndObjects;
import java.util.Scanner;
public class ComplexNumbersUse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int real1=scan.nextInt();
		int imaginary1=scan.nextInt();
		int real2=scan.nextInt();
		int imaginary2=scan.nextInt();

		ComplexNumbers c1= new ComplexNumbers( real1, imaginary1);
		ComplexNumbers c2= new ComplexNumbers( real2, imaginary2);
		int choice =scan.nextInt();
		if(choice ==1) {
			//Add
			c1.plus(c2);
			c1.print();
		}else if(choice==2) {
			//Multiply
			c1.multiply(c2);
		c1.	print();
		}
		else {
			return;
		}
	}

}
