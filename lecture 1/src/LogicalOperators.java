import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
boolean isAlargest=(a>=b)&&(a>=c);
boolean isBlargest=(b>=a)&&(b>=c);
boolean isClargest=(c>=a)&&(c>=b);
System.out.println("A IS LARGEST"+isAlargest);
System.out.println("B IS LARGEST"+isBlargest);
System.out.println("C IS LARGEST"+isClargest);


	}

}
