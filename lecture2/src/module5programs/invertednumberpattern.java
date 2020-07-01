package module5programs;
	import java.util.Scanner;
public class invertednumberpattern {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
if((n<=50)&&(n>=0)) {
int i =1;
while(i<=n){
	int j=1;
	
	while(j<=n-i+1)
	{System.out.print(n-i+1);
j=j+1;	
	}
	System.out.println();
	
	i=i+1;
	
	
}
}
}
} 