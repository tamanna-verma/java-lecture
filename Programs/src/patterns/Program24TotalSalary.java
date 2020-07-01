package patterns;
import java.util.Scanner;
public class Program24TotalSalary {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int Basic=scan.nextInt();
	char grade=scan.next().charAt(0);
	double hra=(20.0/100.0)*Basic;
	double da=(50.0/100.0)*Basic;
	double pf=(11.0/100.0)*Basic;
	int allow;
	if (grade==65)
	{  allow=1700;}
	else if(grade==66) {
		 allow=1500;
	}else {
		allow=1300;
	}
	int TotalSalary=(int)(Basic+hra+da+allow-pf);
	System.out.println(TotalSalary);
	
	}

}
