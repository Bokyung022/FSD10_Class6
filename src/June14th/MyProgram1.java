package June14th;

public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   /*
		int i;
		for(i = 0 ; i <= 10 ; i++) {
			System.out.println("Count now is : " + i);
		}
		*/
		
		int i;
		for(i = 1 ; i <= 100 ; i = i * 4) {
			System.out.println("1st loop - i now is : " + i);
		}
		System.out.println();
		
		for(i = 1000 ; i > 100 ; i = i-200) {
			System.out.println("2nd loop - i now is : " + i);
		}
		System.out.println();
		
		for(i = 100 ; i > 80 ; i--) {
			System.out.println("3rd loop - i now is : " + i);
		}
	}

}
