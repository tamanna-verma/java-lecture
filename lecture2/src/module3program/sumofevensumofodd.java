package module3program;
import java.util.Scanner;

public class sumofevensumofodd {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
 int evensum=0;
 int oddsum=0;

 while(n!=0) {
int rem= n%10;

if(rem%2==0) {
evensum=evensum+rem;

}
else { oddsum=oddsum+rem;
}
n=n/10;
}
  System.out.print(evensum);
  System.out.print(" ");
  System.out.print(oddsum);
	}

}
