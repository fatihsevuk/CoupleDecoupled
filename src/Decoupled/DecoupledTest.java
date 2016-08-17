package Decoupled;

public class DecoupledTest {
	public static void main(String[] args) {
		
		Vehicle car=new Car();
		
		Wheel lassaTire=new Lassa();
		
		car.setWheel(lassaTire);
		
		car.goAhead();
		
		Wheel goodYearTire=new GoodYear();
		
		car.setWheel(goodYearTire);
		
		car.goAhead();
		
		
		
		
	}
}
