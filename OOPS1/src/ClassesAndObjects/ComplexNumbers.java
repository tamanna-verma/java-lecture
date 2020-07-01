package ClassesAndObjects;


public class ComplexNumbers {
	private int real;
	private int imaginary;
	public ComplexNumbers(int real,int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	public int getreal() {
		return real;
	}	
	public void setreal(int r) {
		this.real=r;
	}
	public int getimaginary() {
		return imaginary;
	}
	public void setimaginary(int i) {
		this.imaginary=i;
	}
	public void print()
	{
		System.out.print(real+"+"+imaginary+"i");
	}
	public  void plus(ComplexNumbers c2)
	{
		this.real=c2.real+this.real;
		this.imaginary=c2.imaginary+this.imaginary;

	}
	public void multiply(ComplexNumbers c2)
	{int x=this.real;
	int y=this.imaginary;
	
		this.real=(x*c2.real-y*c2.imaginary);
		this.imaginary=((x*(c2.imaginary))+y*(c2.real));
			}
	}