package Coupled;

public class Car {
	
	private Tire tire;
	
	public Car() {
	
		tire = new Tire();
	}
	
	
	public void goAhead(){
		tire.useTire();
	}

}
