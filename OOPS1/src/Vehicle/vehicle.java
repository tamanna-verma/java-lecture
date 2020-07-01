package Vehicle;

public class vehicle {
	
protected String Colour;
private	int maxSpeed;
public int getmaxSpeed(){
	return maxSpeed;
}
	public void print() {
		System.out.println("Vehicle colour:"+Colour);
		System.out.println("Vehicle maxSpeed:"+ maxSpeed);
	}
}
