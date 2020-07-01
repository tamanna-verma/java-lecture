package pattern;
import java.util.Scanner;
public class pattern5 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i=1;

while(i<=n)
{int space=1;
while(space<=n-i) {
	System.out.print(" ");
	space=space+1;}
	int j=1;
	int val=i;
	while(j<=i) {
System.out.print(val);
j=j+1;
val=val+1;
	}System.out.println(" ");
	i=i+1;
}

	}

}
