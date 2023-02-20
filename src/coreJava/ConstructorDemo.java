package coreJava;

public class ConstructorDemo {
	// name of the construcor should be the class name
	// will not return values
	//Default
	public ConstructorDemo() {
		System.out.println("I am the Constructor in this class");
	}
	
	//parameterized Constructor
	public ConstructorDemo(int a, int b) {
		System.out.println("I am the parameterized Constructor");
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo  cd = new ConstructorDemo();
		cd.getData();
		ConstructorDemo  pr = new ConstructorDemo(2, 5);
		
		
	
	}
	
	public void getData() {
		System.out.println("I am the method in this class");
	}

}
