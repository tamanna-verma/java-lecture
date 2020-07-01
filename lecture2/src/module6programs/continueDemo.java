package module6programs;
import java.util.Scanner;
public class continueDemo {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i=1;
while(i<=n) {
	if(i==5) {
		break;	}
	
System.out.println(i);
i=i+1;
}


int x=10;
while(i<=10) {
if(i==6) {
	i++;
continue;
}
System.out.println(i);
i++;
}


int c=10;
for(int d=1;d<=10;d++) {
	if(d==6) {
		continue;
	}
System.out.println(d);
}




}

}
