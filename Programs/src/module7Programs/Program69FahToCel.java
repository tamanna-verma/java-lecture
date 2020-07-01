package module7Programs;

import java.util.Scanner;

public class Program69FahToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int Start=scan.nextInt();
		int End=scan.nextInt();
		int Gap=scan.nextInt();
		for(int i=Start;i<=End;i=i+Gap) {
			int fah= (int)((5.0/9.0)*(i-32));
			System.out.println(i+" "+fah);
		}
	}

}
