package learning;

public class ChildClass  extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass cd = new ChildClass ();
		cd.colour();
		cd.brakes();
		cd.audio();
		
		

	}
	
	public void audio() { //function overriding
		System.out.println("New generation Audio System");
	}
	
	public void engine() {
		System.out.println("New Engine 1600cc");
	}
	public void colour() {
		System.out.println(colour);
	}

}
