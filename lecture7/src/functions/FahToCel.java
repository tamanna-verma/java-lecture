package functions;
import java.util.Scanner;
public class FahToCel {
public static void main(String[]args) {
Scanner scan=new Scanner(System.in);
int start=scan.nextInt();
int end=scan.nextInt();
int gap=scan.nextInt();
for(int i= start;i<=end;i=i+gap) {
	
	int cel=(int)((5.0/9.0)*(i-32));
	System.out.println(i+" "+cel);
}
	}

}
