package pattern;
import java.util.Scanner;
public class characterpattern2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int i=1;
	while(i<=n) {
	int	j=1;
char strtch=(char)('A'+i-1);
while(j<=n) {
System.out.print(strtch);
j=j+1;
strtch=(char)(strtch +1);
}
System.out.println();
i=i+1;
	}
	}

}



