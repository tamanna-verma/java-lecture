package module1;
import java.util.Scanner;
public class Program5SiCalculator{
	public static void main(String[]args) {
Scanner scan=new Scanner(System.in);
int p=scan.nextInt();
int r=scan.nextInt();
int t=scan.nextInt();
double Si=(double)(p*r*t)/100.0;
	System.out.println(Si);
	}}