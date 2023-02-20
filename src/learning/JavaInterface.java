package learning;

public class JavaInterface implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new JavaInterface();
		a.redStop();
		a.greenGo();
		a.amberWait();
		
		//JavaInterface at = new JavaInterface();
		policeHand();
		
		

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Go haraka");
	}
	
	public static void policeHand() {
		System.out.println("Raise hand to stop");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("stop haraka");
		
	}

	@Override
	public void amberWait() {
		// TODO Auto-generated method stub
		System.out.println("Wait kidogo");
		
	}

}
