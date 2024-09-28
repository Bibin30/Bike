package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("1.5L");
		
	}

	@Override
	public void speed() {
		System.out.println("210cc");
		
	}
	
	public void cost1() {
		System.out.println("2L");
		
	}
	public void speed1() {
		System.out.println("350cc");
		
	}
	
	public void newlaunch() {
		System.out.println("Duke 390cc");

	}
	
	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost1();
		k.speed1();
		
		Bike b=new Ktm();
		b.cost();
		b.speed();
		
		k.newlaunch();
	}
}
