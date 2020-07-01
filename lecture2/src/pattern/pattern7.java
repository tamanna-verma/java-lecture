package pattern;
import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i=1;
while(i<=n){
	int j=1;
	char startingchar=(char)('A'+i-1);
	while(j<=n) {
		
		System.out.print(startingchar);
	startingchar=(char)(startingchar + 1);
		j=j+1;
		}

System.out.println();
i=i+1;
}
}

}