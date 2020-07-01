package module6programs;
import java.util.Scanner;
public class Forloop {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int sum=0;
for(int i=1;i<=n;i=i+1) {
sum=sum+i;
}
System.out.println(sum);




int m=scan.nextInt();
int sumnew=0;
for(int x=1;(x<=m)&&(sumnew<=100);x++)
{
sumnew=sumnew+x;
}
System.out.println(sumnew);




int c=scan.nextInt();
int newsum=0;
for(int u=1,v=2;(u<=c)&&(v<=c);u=u+1,v=v+1)
{
newsum=newsum+u+v;
}System.out.println(newsum);
}

}
