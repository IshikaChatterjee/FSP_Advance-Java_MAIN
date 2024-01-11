package com.composite;

public class CompositeTest {

	public static void main(String[] args) {
		
		Component hd = new Leaf(5000, "harddrive");
		Component mouse = new Leaf(500, "mouse");
		Component monitor = new Leaf(15000, "monitor");
		Component ram = new Leaf(4000, "ram");
		Component cpu = new Leaf(12000, "cpu");
		
		Composite ph = new Composite("Peripheral");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MotherBoard");
		Composite computer = new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		
		computer.showPrice();


	}

}
