/**
 * 영문 (대소문자) 변환
 */

package chap08_java_api.com.javalab.api.pkg05;

public class StringTlLowerUpperCase {

	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.equals(str2)); // false

		String lowerStr1 = str1.toLowerCase(); // toLowerCase() 소문자로  변경해줌
		String lowerStr2 = str2.toLowerCase(); // toLowerCase() 소문자로  변경해줌
		System.out.println(lowerStr1.equals(lowerStr2)); // true
		// equalsIgnoreCase 대소문자 구분 없이 비교
		System.out.println(str1.equalsIgnoreCase(str2)); // true
	}
}