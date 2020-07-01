package Array;
import java.util.Scanner;
public class LinearSearch {
public static int[]takeInput (){
	Scanner scan=new Scanner(System.in);
	int size=scan.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=scan.nextInt();
	}
return arr;
}
public static int isNumberPresent(int arr[],int x) {
	int size=arr.length;
	for(int i=0;i<size;i++) {
	if(x==arr[i]) {
		System.out.println(i);
	}
	}return-1;
	
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int SearchingArr[]=takeInput();
	int x=scan.nextInt();
	int index=isNumberPresent(SearchingArr,x); 
	}

}
