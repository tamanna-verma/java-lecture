package module3program;
import java.util.Scanner;
public class Salary {
public static void main(String args[]) {
Scanner scan=new Scanner(System.in);	
	int basic=scan.nextInt();
	String str=scan.next();
	char grade=str.charAt(0);
	double hra=(20.0/100.0)*basic;
	double da=(50.0/100.0)*basic;
	double pf=(11.0/100.0)*basic;
	int allow;
	if(grade==65) {allow=1700;}
	else if(grade==66) {allow=1500;}
	else{allow=1300;}
	double salary;
	salary=(double)(basic+hra+da+allow-pf);
	System.out.println(Math.round(salary));

}
}
