package co.eju;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public class DateTest {
	
	private Date date;
	private Calendar now;
	private SimpleDateFormat sd;
	
	
	void dateTest() {
//		sd = new SimpleDateFormat("yyyy-MM-dd : HH:mm:ss"); //날짜 표현 형식 정의
//다른 포맷으로 정의해보자
//		sd = new SimpleDateFormat("yyyy년 MM월 dd일");
		sd = new SimpleDateFormat("현재시간 hh : mm : ss");
	
		
		date = new Date(); //새로운 날짜 객체를 생성
		
		System.out.println(sd.format(date));
		System.out.println(date); //Tue Oct 05 11:35:39 KST 2021 <데이터 포맷형식을 주지 않은 경우
		System.out.println("=============");
	}
	
	void calendarTest() {
		now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONDAY) +1; //0부터 출발하닉간
		System.out.println(month);
	}

}
