package coreJava;

public class StaticVar {
	String name;
	String address;
	static String city = "Kenya"; // class variables
	
	public StaticVar(String name, String address) {
		this.name = name;
		this.address = address; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar var = new StaticVar("Martin", "Ongata Rongai");
		StaticVar var2= new StaticVar("Onyango", "Kiserian");
		var.getAddress();

	}
	
	public void getAddress() {
		System.out.println(name+" " + address+ " "+ city);
	}

}
