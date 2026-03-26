package ex01;

/*
num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/
class Score {
//입력:번호,이름,국어,영어,수학
//     num, name, kor, eng, mat 
//출력:번호 이름 국어 영어 수학 총점 평균  등급
//     num, name, kor, eng, mat, tot, avg, grade	
	
	// Field
	// 입력 num, name, kor, eng, mat 
	int      num;
	String   name;
	int      kor;
	int      eng;
	int      mat;
	
	// 출력  num, name, kor, eng, mat, tot, avg, grade	
	int      tot;
	double   avg;
	char     grade;
	
	// Constructpr
	// sts 에서 오른쪽마우스 -> source -> Generate Constructor using Field
	// 단축키 : alt + shift + s
	public Score(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		// 계산
		getTot();  
		getAverage();
		getGrade();
	}
	
	private void getTot() {
		this.tot  = this.kor + this.eng + this.mat;		
	}
	
	private void getAverage() {
		this.avg  =  (this.kor + this.eng + this.mat) / 3.0;
	}
	
	private void getGrade() {
		this.grade = 'A';		
	}	

	static void title() {
		String  title = "번호 이름 국어 영어 수학 총점 평균  등급";
		System.out.println( title );		
	}
	
	// Method
	void disp() {
		String  fmt   = "%d   %s   %d   %d   %d   %d   %.2f  %c\n";
		System.out.printf(fmt, num, name, kor, eng, mat, tot, avg, grade);
	}	
}


public class TestScore {

	public static void main(String[] args) {
		
		// Score  sc1  = new Score();   // error : The constructor Score() is undefined
		   // 기본생성자가 없고 다른 생성자만 존재할때  new Score(); 에러
		Score.title();
		
		Score  sc1 = new Score(1,"사나",70,80,90);		 
		sc1.disp();
		
		Score  sc2 = new Score(2,"모모",0,70,100);
		sc2.disp();

	}

}