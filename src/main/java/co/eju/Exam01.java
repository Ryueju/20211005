package co.eju;

public class Exam01 {
	
	//string클래스 테스트 해보자
	private String str = "20001004"; //yyyymmdd
	private String nstr = "1234";
	private String mstr = "3456";
	private String cstr = " akcae fg.jsp.old";
	
	void stringTest() {
		
		System.out.println(str.toString()); //돌려주는데 int값임 //sysout 으로 출력해보자
		System.out.println(nstr.toString());
		System.out.println(nstr+mstr);
		
		int n = Integer.valueOf(nstr);
		int m = Integer.valueOf(mstr);
		
		System.out.println(n + m);
		
		if(str.equals(cstr)) System.out.println(cstr); 
		//비교 : str과 cstr이 같으면 cstr을 출력해주세요
		// str == cstr 로 표현해도 괜찮음.!
		
	String mm = str.substring(4, 6); //4번째부터 //str.substring(두번째 거 선택하기)
	String dd = str.substring(6); //6번째부터 끝까지 가져왕
	System.out.println("귀하의 생일은" + mm + "월" + dd + "일 입니다.");
	
//1.	System.out.println(cstr.substring(0, str.length() - ".jsp".length()));
//2. int number = str.indexOf(".")l
	//String str1 = str.substring(0, number);
	//System.out.println(str1);
	
	int l = cstr.indexOf(".");
	
	//메모리에 저장할때 char = 'a';
	//		       str = "a"
	
	System.out.println(cstr.substring(0,1));
	System.out.println(cstr.replace("k", "B")); //aBcae fg.jsp.old
	System.out.println(cstr.concat("xyz")); //akcae fg.jsp.oldxyz
	System.out.println(cstr.toUpperCase()); //AKCAE FG.JSP.OLD
	System.out.println(cstr.getBytes()); //[B@5aaa6d82 결과가..이렇게나옴
	System.out.println(cstr.trim());// 앞쪽 공백을제거
	
	char c = 'a';
	String cs = String.valueOf(c); //char type to String type
	
	String s = "a";
	
		//	if(s == c) System.out.println(c); //비교할 수 없음 c를 string으로 변환하자
	
	if(s == cs) System.out.println(c);
	}

}
