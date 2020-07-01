package functions;
import java.util.Scanner;
public class nCr {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int r=scan.nextInt();
		int product1=1;
		int product2=1;
		int product3=1;
		for(int i=1;i<=n;i++) {
			product1=product1*i;
		}
        for(int i=1;i<=r;i++) {
        	product2=product2*i;
        }
        for(int i=1;i<=n-r;i++) {
        	product3=product3*i;
        }
        
        int ans=product1/(product2*product3);
        System.out.println(ans);
	}

}
