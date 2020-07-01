package VehicleTemp;
import Vehicle.vehicle;
public class Truck extends vehicle

{
	

int maxLoadingCapacity;
vehicle v=new vehicle();
public void print() {
	System.out.println("Truck Capacity:"+maxLoadingCapacity);
	System.out.println("Truck Colour:"+Colour);
	System.out.println("Truck maxSpeed:"+getmaxSpeed());
}


}