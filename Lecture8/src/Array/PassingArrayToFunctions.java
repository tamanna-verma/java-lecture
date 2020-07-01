package Array;
import java.util.Scanner;
public class PassingArrayToFunctions {
public static int[]takeInput(){
	Scanner scan=new Scanner(System.in);
	int size=scan.nextInt();
	int Input[]=new int[size];
	for(int i=0;i<size;i++) {
		Input[i]=scan.nextInt();
		}return Input;
}
public static void Print(int Input[]) {
	int size=Input.length;
	for(int i=0;i<size;i++) {
		System.out.print(Input[i]+" ");
	}

}
	public static void main(String[] args) {
		int arr[]=takeInput();
		Print(arr);
	}

}
