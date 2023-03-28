package chap08_java_api.com.javalab.api.pkg05;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		// StringBuilder
		//내부 버퍼가 있어서 거기서 메모리 관리  문자를 이어붙이면 스트링처럼 기존꺼를 버리는게아니라 한 객체로 이어 붙이고 효율성이 더 좋다
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World "); // append = 추가
		sb.append(" Ha Ha ");
		System.out.println(sb); // prints "Hello World Ha Ha"
		System.out.println();
		
		// String 차이점
		String data = "ABC";
		data += "def"; // data = data + def    이어 붙일때마다 기존꺼는 버림
		System.out.println(data); // ABCdef
	}
}