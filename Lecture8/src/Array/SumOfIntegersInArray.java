package Array;
import java.util.Scanner;
public class SumOfIntegersInArray {
public static int[] takeInput() {
	Scanner scan=new Scanner(System.in);
	int size=scan.nextInt();
	int Arr[]=new int[size];
for(int i=0;i<size;i++){
Arr[i]=scan.nextInt();
}return Arr;
}
public static int Sum (int Arr[]) {
	int sum=0;
	int size=Arr.length;
	for(int i=0;i<size;i++) {
	sum=sum+Arr[i];
	}
	return sum;
}
	public static void main(String[] args) {
	 int ARR[]=takeInput();
	int sum= Sum(ARR);
	System.out.println(sum);
	}

}
