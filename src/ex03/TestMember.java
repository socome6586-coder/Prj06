package ex03;

class Member {
	// Field
	// access modifier(public, private, protected, package)를 안 붙이면 package level 이다
	// package level 변수 : 같은 폴더에서 변수 공유
	int id;
	String name;
	String email;
	
	// Constructor
	public Member() {}
	
	public Member(String msg) {
		System.out.println(msg + "객체 생성");
	}
	public Member(int id, String name, String email) {
		this("msg");     //기본 생성자 Member()를 호출하였다 this : 나 자신
		//super();  
		// super : 부모클래스 -> parent
		// super() : 부모 클래스의 기본 생성자를 호출
		this.id = id;
		this.name = name;
		this.email = email;
	}


	// override methods
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
	
}

public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id     = 1;
		m1.name   = "박찬호";
		m1.email  = "parkch@lotte.com";
		System.out.println(m1);
		
		Member m2 = new Member(2, "강호동", "kanghd@busan.com");
		System.out.println(m2);
		
	}

}
