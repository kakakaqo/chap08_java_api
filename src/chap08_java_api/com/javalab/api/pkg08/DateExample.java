/**
 * 날짜  
 */
package chap08_java_api.com.javalab.api.pkg08;

import java.text.*;
import java.util.*;

public class DateExample {

	public static void main(String[] args) {
		
		// Wed Mar 15 15:58:01 KST 2023 로 나옴
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		
		//2023.03.15 16:00:08
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}