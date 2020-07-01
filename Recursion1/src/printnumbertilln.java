
public class printnumbertilln {
	public static void print(int n) {
	 if(n>0){
	        print(n - 1);
	        System.out.print(n+" ");
	 }}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=10;
		 print(n);
	}

}
