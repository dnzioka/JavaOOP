package learning;

public class ExceptionDemo {
	static int a = 7;
	static int b = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionDemo.GetData();

	}

	public static void GetData() {
		try {
			int k = a / b;

		} catch (ArithmeticException et) {
			System.out.println("Math Error");
		} catch (IndexOutOfBoundsException ebs) {
			System.out.println("Inde out of bound");
		} catch (Exception e) { // generall erros
			System.out.println("This cannot be done");

		}

		finally {
			System.out.println("Delete cookies");

			// this block is executed even if there are errors

		}

	}

}
