package ifelse;
import java.util.Scanner;

public class LARGESTOF3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if((a>=b)&&(a>=c)){
		System.out.println("a is largest");}
		else{if((b>=a)&&(b>=c)){
			System.out.println("b is largest");
		}else {
			System.out.println("c is largest"); 
		}
	}
		if(a>=b && a>=c) {
			System.out.println(a);}
			else if(b>=a&&b>=c){
				System.out.println(b);
			}else {System.out.println(c);
		}
			
}}
