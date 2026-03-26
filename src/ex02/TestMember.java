package ex02;

import java.util.Objects;

class Member {
	
	// Field
	int    id;
	String name;
	
	// Constructor
	// 기본 생성자
	public Member() {
		
	}
	
	//인자 있는 생성자
	public Member(int id, String name) {
		this.id   = id;
		this.name = name; 
	}
	

	// Method
	void disp() {
		System.out.println(id + " " + name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	// Object의 equals() 를 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
	// method
	// @Override - annotation -> 컴파일러에게 알려주는 기능
	
	/* 
	// 내가 새로 만든 equals() <- Object를 재정한 것이 아니다
	// @Override를 사용하면 오류 발생
	boolean equals(Member m3) {
		boolean result = false;
		
		if(this.id == m3.id) {
			if(this.name.equals(m3.name)) {
				result = true;
			}
		} 
		
		return result;
	}
	*/
}

public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id     = 1;
		m1.name   = "단종";
		m1.disp();
		System.out.println(m1);            // ex02.Member@18b4aac2
		System.out.println(m1.toString()); // ex02.Member@18b4aac2
		
		Member m2 = new Member(2, "엄홍도");
		m2.disp();
		System.out.println(m2);            // ex02.Member@764c12b6
		System.out.println(m2.toString()); // ex02.Member@764c12b6
		
		System.out.println(m1 == m2);      // false
		
		Member m3 = new Member(1, "단종");
		System.out.println(m3);            // ex02.Member@c387f44
		// 객체를 비교하여 주소로 비교 ==
		System.out.println(m1 == m3);      // false
		
		// 객체를 비교하여 주소가 아니라 내용을 비교 : equals
		// m1.equals(m3) 는 주소비교이다 -> 내용비교를 위해 기능을 수정해야 한다
		System.out.println(m1.equals(m3));
		
		
		
		
		
		
	}

}
