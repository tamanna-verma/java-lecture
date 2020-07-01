package module6Programs;
import java.util.Scanner;
public class Program55DecimalToBinary {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n =scan.nextInt();
int Sum=0;
int Product;
int rem;
int x=0;
while(n>0) {

rem=n%2;
Product=(int)(rem*(Math.pow(10, x)));
Sum=Sum+Product;
	x++;
	n=n/2;
}System.out.println(Sum);
	}

}
