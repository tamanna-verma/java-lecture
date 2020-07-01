package pattern;
import java.util.Scanner;

public class pattern6 {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i=1;
while(i<=n){
	int j=1;
	while(j<=n) {
	char ch=(char)('A'+j-1);
	System.out.print(ch);
	j=j+1;

	}System.out.println();
	i=i+1;
}
	}

}
