package whileloop;
import java.util.Scanner;
public class fahtocelTable {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int S=scan.nextInt();
		int E=scan.nextInt();
		int	W=scan.nextInt();
		int cel;
		 if ((S>=0)&&(S<=80)&&(S<=E)&&(E<=900)&&(W>=0)&&(W<=40)) {
		while(S<=E){ cel=(int)((5.0/9)*(S-32));
			System.out.println(S+"_"+cel);
			S=S+W;
		}
		
		
		 }
	}

}
