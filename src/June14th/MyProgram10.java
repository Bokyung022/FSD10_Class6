package June14th;

public class MyProgram10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// F(x) = x + y
		
		myFunc();
		
		int age = myage();
		System.out.println(age);
		
		//System.out.println(myage());
		
		String name = myname();
		System.out.println(name);
		

	}
	
	public static void myFunc() {
		System.out.println("Hello I am inside func");
	}

	public static int myage() {
		return 18;
	} 
	public static String myname() {
		return "Pargol";
	} 
}
