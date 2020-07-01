import java.util.Scanner;
public class SumOfArray {
	
	public static int Sum(int Input[]) {	
if(Input.length==1) {
	return Input[0];
}
int newInput[]=new int[Input.length-1];
for(int i=1;i<Input.length;i++) {
	newInput[i-1]=Input[i];
}

		return Input[0]+Sum(newInput);	
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
int n=scan.nextInt();
int Array[]=new int[n];
for(int i=0;i<n;i++) {
	//Scanner scan=new Scanner(System.in);
	Array[i]=scan.nextInt();	
}
//int ARR[]=input(x);
int result=Sum(Array);
System.out.println(result);

	}

}
