package asssignmentModule6;
import java.util.Scanner;
public class SumOrProduct {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int c=scan.nextInt();
if((n>=1)&&(n<=12)) {
	if(c==1) {
	int i=1;
	int Sum=0;
	while(i<=n) {
	Sum=Sum+i;
	i=i+1;
	
	}System.out.println(Sum);
	}
	else if(c==2) {
	int Product=1;
	for(int j=1;j<=n;j++) {
		Product=Product*j;
		}
	System.out.println(Product);
	}
	else {
	
	System.out.println("-1");
	}
	}
}
}
