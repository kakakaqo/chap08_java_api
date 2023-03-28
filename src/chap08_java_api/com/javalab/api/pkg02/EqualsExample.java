package chap08_java_api.com.javalab.api.pkg02;

/**
 * Member 클래스의 객체의 값을 비교하는 실행클래스
 */

public class EqualsExample {

	public static void main(String[] args) {

		Member obj1 = new Member("blue");   
		Member obj2 = new Member("blue"); // obj1 과 obj는 같지 않음 new 를 사용하면 무조건 새로운 객체가 생성됨
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
	}
}