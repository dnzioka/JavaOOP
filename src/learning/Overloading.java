package learning;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//methods will have same name only differentiated by the arguments
		Overloading over = new Overloading();
		over.getData(2);
		over.getData("Dominic");
		over.getData(5, 7);
	}
	
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(int a, int b) {
		System.out.println(b);
		System.out.println(a);
	}

}
