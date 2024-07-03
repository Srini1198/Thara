package org.bike;

public class Ktm implements Bike {
	
	private void bikeName() {
		System.out.println("Bike name is R15v3");

	}

	@Override
	public void cost() {
		System.out.println("Bike cost is 2 lakhs");
		
	}

	@Override
	public void speed() {
		System.out.println("Top speed is 157 kilo meter per hour");
		
	}

	@Override
	public void engine(int cc) {
		System.out.println("engine cc is "+ cc);
		
	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.bikeName();
		k.cost();
		k.speed();
		k.engine(155);
	}
	

}
