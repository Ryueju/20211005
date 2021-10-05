package co.eju;

import java.sql.Date;

public class SqlDateTest {
	
	private Date date; //java.sql.Date 객체는 년-월-일 만 처리한다.
	
	void sqlDate() {
	//	date = new Date(2021,10,05);
	//	date = "2021-10-05";
		date = Date.valueOf("2021-10-05"); //스트링 객체를 > date객체화 시키는 것
		System.out.println(date.toString());
		
	}

}
