package asssignmentModule6;
import java.util.Scanner;
public class decimaltobinary {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);	
int n=scan.nextInt();
int pv=1;
long ans=0;
while(n>0) {
int rem=n%2;
ans=ans+pv*rem;

n=n/2;
pv=pv*10;
         }System.out.print(ans);
}
}