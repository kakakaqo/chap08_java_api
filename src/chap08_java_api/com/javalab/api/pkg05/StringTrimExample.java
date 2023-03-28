/**
 * 문자열 공백 자르기
 */

package chap08_java_api.com.javalab.api.pkg05;

public class StringTrimExample {

	public static void main(String[] args) {
		// 공백도 값임
		String tel1 = "  02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		
		String tel = tel1.trim() + "|" + tel2.trim() + "|" + tel3.trim(); // trim() 공백 제거
		System.out.println(tel);
	}
}