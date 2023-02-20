package learning;

public class StaticMethods {
	public static int a = 5;
	public static int b = 4;
	public static int hesabu;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// access method without creating the object of the class
		methodOnly full = new methodOnly();
		full.getUserData();

		String name = getData();
		System.out.println(name);

		getData2();
		StaticMethods m = new StaticMethods();
		int Teacher = m.Maths();
		System.out.println(m.Maths());
		System.out.println(Teacher);

	}

	// methods should be outside the main block
	public static String getData() {
		System.out.println("My name is:");
		return "Rahul";
	}

	public static String getData2() {
		System.out.println("Java learning");
		return "By Shetty";
	}

	public int Maths() {

		hesabu = a + b;

		return hesabu;
	}

}
