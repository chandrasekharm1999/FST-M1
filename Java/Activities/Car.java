
public class Car {
	//characteristics
	String colour;
	String transmission;
	int make;
	int tyre;
	int speed;
	
	
	//constructor
	Car(String colour, String transmission, int make, int tyre, int speed){
		this.colour = colour;
		this.transmission = transmission;
		this.make = make;
		this.speed = speed;
		
	}
	
// methods
	public void accelerate() {
		this.speed++;
	}
	
	public void brake() {
		this.speed = 0;
	}
}
