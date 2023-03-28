package chap08_java_api.com.javalab.api.pkg05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String data1 = "홍길동&이수홍,박연수;채리나";
		// 여러개의 구분자로 분리(자름), "구분자는 |로 분리
		String[] arr = data1.split("&|,|;"); 
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		// StringTokenizer 클래스로 문자열 분리(자름)
		// 객체안에 잘린 내용이 들어감 
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		// 더이상 가져올 값이 없으면 예외 발생하기 때문에 hasMoreTokens로 확인
		while(st.hasMoreTokens()) { // Tokens = 잘려진 값 
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
}