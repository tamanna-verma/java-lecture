
public class CalculatePower {
public static int Power(int x,int y ){
	if(y==0){
        return 1;
    }

	if(y==1) {
		return x;
	}
	return x*Power(x,y-1);
	
}
	public static void main(String[] args) {
		int result=Power(2,5);
		System.out.println("Result is"+ result);

	}

}
