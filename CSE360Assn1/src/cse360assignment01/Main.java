package cse360assignment01;

public class Main {

	public static void main(String[] args) {
		AddingMachine machine = new AddingMachine();
		machine.add(7);
		machine.subtract(2);
		System.out.println(machine.getTotal());
		machine.add(18);
		System.out.println(machine.toString());
		machine.clear();
		System.out.println(machine.toString());

	}

}
