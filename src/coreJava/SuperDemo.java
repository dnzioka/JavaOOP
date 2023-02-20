package coreJava;

public class SuperDemo extends ParentDemo {
	String name = "Rahul lecturer";
	
	//constructor
	public SuperDemo() {
		super(); // this should always be at first line
		System.out.println("Child Class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// super keyword refers to parent class variable

		SuperDemo d = new SuperDemo();
		d.getName();
		d.getData();

	}

	public void getName() {
		System.out.println(super.name);
		System.out.println(name);

	}
	public void getData () {
		super.getData();
		System.out.println("I am in Child Class");
	}
}
