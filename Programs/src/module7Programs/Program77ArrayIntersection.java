package module7Programs;
import java.util.Scanner;
public class Program77ArrayIntersection {
	public static int[]Input(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++) {
			Array[i]=scan.nextInt();
		}return Array;
	}
	public static void Intersection(int Array1[],int Array2[]){
		int n=Array1.length;
		int m=Array2.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(Array1[i]==Array2[j]) {
					System.out.print(Array1[i]);
					Array2[j]=Integer.MIN_VALUE;
				}
			}
			
			
		}
	}
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int Noq=scan.nextInt();
	for(int i=0;i<Noq;i++) {
		int Arr1[]=Input();
		int Arr2[]=Input();
		Intersection(Arr1,Arr2);
		
		
	}

	}

}
