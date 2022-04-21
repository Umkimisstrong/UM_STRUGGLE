/*=========================
  ■■■클래스 고급■■■
=========================*/

// 인터페이스(Interface)

// ○ 실습 문제
// 성적 처리 프로그램을 구현
// 단, 인터페이스를 활용

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2280946 홍은혜
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85

// 2번째 학생의 학번 이름 입력(공백 구분) : 2290847 최문정
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

// 2280946 홍은혜    90  100  85   총점      평균
//                   수   수  우
// 2290857 최문정    85   70  65   총점      평균
//                   우   미  양

// 계속하려면 아무 키나 누르세요..
// 속성만 존재하는 클래스 → 자료형 활용

import java.util.Scanner;

class Record
{
	String hak, name;	// 학번 이름
	int kor, eng, mat;  // 국어, 영어, 수학
	int tot, avg;       // 총점, 평균

}


// 인터페이스
interface Sungjuk
{
	public void set();	 // -- 인원 세팅
	public void input(); // -- 데이터 입력
	public void print(); // -- 결과 출력
}


// 문제해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class  SungjukImpl	implements Sungjuk
{
	private int inwon;
	Scanner sc;
	private Record[] rec;  // 레코드 타입의 배열 생성



	private String panjung(int score)	// 수 우 미 양 가
	{
		String k;
		if (score >= 90)
		{
			k = "수";
		}
		else if (score >= 80)
		{
			k = "우";
		}
		else if (score >= 70 )
		{
			k = "미";
		}
		else if (score >=60 )
		{
			k = "양";
		}
		else if (score < 60)
		{
			k = "가";
		}
		else
			k = "가";

		return k ;

	}

	public void set()
	{ 
		sc = new Scanner(System.in);
		System.out.print("인원 수 입력(1~10) : ");
		inwon = sc.nextInt();
		rec = new Record[inwon];   // 레코드 속성을 지닌 배열 생성 (인원수만큼)
	}

	public void input()
	{

		sc = new Scanner(System.in);
		for (int i = 0; i<inwon ;i++ )
		{
			rec[i] = new Record();
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", (i+1));
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("국어, 영어, 수학 점수 입력(공백 구분) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();
			
			rec[i].tot += rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = (rec[i].tot)/3;
		}
	}
	public void print()
	{
		int n = 0;
		System.out.println();

		for (int i = 0;i < inwon ;i++ )
		{
			System.out.printf("%7s %5s %3d %3d %3d    %3d %3d\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i]. avg);
			System.out.print("                  ");
			System.out.printf("%s %2s %2s\n", panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));
		}
	}
}


public class Test123
{
	public static void main(String[] args)
	{
		Sungjuk ob;
		// 문제해결 과정에서 작성해야 할 ob 구성
		ob = new SungjukImpl(); 

		ob.set();
		ob.input();
		ob.print();
	}
}