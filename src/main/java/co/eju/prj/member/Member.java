package co.eju.prj.member;

public class Member {
	
	private String name;
	private String address;
	private int age;
	
	public Member(String name, String address, int age) {
		this.name = name;
		this.address  = address;
		this.age = age;
		
	}
	//출력구문 오버라이딩하기
	public String toString() {
		System.out.print("이름 : " + name + " ");
		System.out.print("주소 : " + address + " ");
		System.out.println("나이 : " + age);
		return null;
	}

}
