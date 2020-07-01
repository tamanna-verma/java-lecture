package Array;
import java.util.Scanner;
public class GreatestOfNnumbers {
	public static int[] takeInput() {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int input[]=new int[size];
		for(int i=0;i<size;i++) {
			input[i]=scan.nextInt();
		}return input;
	}
	public static int FindMax (int input[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++) {
			if(input[i]>max) {
				max=input[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]	=takeInput();
		int max=FindMax(arr);
		System.out.println(max);
	}

}
