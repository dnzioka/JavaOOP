package coreJava;

public class ThisKeyword {
	int a = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword td = new ThisKeyword ();
		td.getData();

	}
	
	public void getData() {
		int a = 3;
		System.out.println(a);
		System.out.println(this.a); // this -> refers to current object > refers to global variable
		int b = a + this.a;
		System.out.println(b);
	}

}
