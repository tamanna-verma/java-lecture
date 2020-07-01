package module3program;
import java.util.Scanner;
public class power {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int x= scan.nextInt();
int n=scan.nextInt(); 
int power=1;
if((x>=0)&&(x<=8)&&(n>=0)&&(n<=9)){
while(n!=0){

power=power*x;
n=n-1;
}}
System.out.println(power);	}

}
