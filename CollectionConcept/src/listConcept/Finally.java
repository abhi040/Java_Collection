package listConcept;


public class Finally {

	public static void main(String[] args) {
		//test1();
		division();

	}
	
	public static void test1() {
		try {
			System.out.println("*****inside test1 method******");
			throw new RuntimeException("Test");
		}
		catch (Exception e) {
		System.out.println("****inside cathc block****");	
		}
		finally {
			System.out.println("****inside finally block****");
		}
	}
	
	public static void division() {
		int i =10;
		try {
			System.out.println("inside try block");
			int k=i/0;
		} 
		catch (NullPointerException e) {
			System.out.println("inside catch block");
		}
		
		finally {
			System.out.println("inside finally block");
		}
	}

}
