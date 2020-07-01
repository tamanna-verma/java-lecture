package module6programs;
import java.util.Scanner;
public class breakcontinue {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int divisor=2;
boolean divided=false;
while(divisor<n) {
if (n%divisor==0) {	
	
 divided=true;
}
divisor=divisor + 1;
}  
     if (divided) {
    	 
	System.out.println("not prime");
     }else {System.out.println("prime");
    }
     
     
     
     
     
   divided=false;
 for (divisor=2;divisor<n;divisor++) {
   if(n%divisor==0)  
   {divided=true; break;
 }   }
     if(divided) {
 System.out.println("not prime");}
     else { System.out.println("prime");
     }}
	

}
