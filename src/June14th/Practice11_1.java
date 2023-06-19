package June14th;

// 메서드: 자주 사용할 코드를 미리 정의해 둔 것
// 필요할때 call 호출해서 결과 반환 값을 활용
// 메서드를 호출 전달하는 값을 argument 라고 함
// 메서드에서 인자를 저장하는 변수는 parameter 라고 함

public class Practice11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(addfivetoit(8));
		System.out.println(add(2,8));
		System.out.println(sub(2,8));
		System.out.println(mul(2,8));

	}
	
	public static int addfivetoit (int x) {
		return x + 5;
	}
	
	public static int add (int x, int y) {
		return x + y;
	}
	
	public static int sub (int x, int y) {
		return x - y;
	}
	
	public static int mul (int x, int y) {
		return x * y;
	}

}
