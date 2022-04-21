/*===============================
  ■■■ 클래스와 인스턴스■■■
===============================*/

// 클래스와 인스턴스 활용

// 학생별로 국어점수, 영어점수, 수학점수를 입력받아
// 총점, 평균을 계산하는 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.
// 클래스 설계는 다음의 가이드라인에 따라 진행할 수 있도록 한다.

// 프로그램을 구성하는 클래스
// 1. Record 클래스
//    - 속성만 존재하는 클래스로 설계할것~!

// 2. Sungjuk 클래스
//    - 인원 수를 입력받아, 입력받은 인원 수 만큼
//	    이름, 국어점수, 영어점수, 수학점수를 입력받고
//	    총점과 평균을 산출하는 클래스로 설계할 것
//	    ㆍ속성 : 인원수, Record 형태의 배열
//	    ㆍ기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평규 연산, 결과 출력

// 3. Test103 클래스
//    - main() 메소드가 존재하는 외부 클래스로 설계할것!

// 실행 예)
// 인원 수 입력(1~100) : 102
// 인원 수 입력(1~100) : -10
// 인원 수 입력(1~100) : 3

// 1번째 학생의 이름 입력 : 김상기
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// 2번째 학생의 이름 입력 : 임소민
// 국어 점수 : 92
// 영어 점수 : 82
// 수학 점수 : 72

// 3번째 학생의 이름 입력 : 이연주
// 국어 점수 : 92
// 영어 점수 : 82
// 수학 점수 : 72

// 김상기 90 80 70 240  xx.xx  2
// 임소민 92 82 72 xxx  xx.xx  1
// 이연주 82 72 62 xxx  xx.xx  3

// 계속하려면 아무 키나 누르세요...



// ********************************** 이번 과제의 핵심
//   : 클래스에 누구의 무엇을 묘사할 것인지


import java.util.Scanner;


// 속성만 존재하는 클래스
// 학생 1명
class Record
{	
	// 학생 1명을 표현할 수 있는 속성들로 구성~~!!!!!!!!!!!!!!!!!!!!!!

	String name;				//-- 이름
	// int kor, eng, mat;
	int [] score = new int[3];	//-- int kor, eng, mat; 각 과목의 수
	int tot;					//-- 총점
	double avg;					//-- 평균
	int rank;					//-- 석차(등수)
}








class Sungjuk
{
	// 주요 속성 구성
	int inwon;		//-- 인원수
	Record[] rec;	//-- Record 형태의 배열(학생 한명 당 Record 배열 방 한개 활용)
					//   Record를 기반으로 생성된 객체만 담아낼 수 있는 배열
	String [] title = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};

	
	// 주요 메소드 정의(기능 구성)
	// ① 인원 수 입력
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while(inwon>100 || inwon<1);

		rec = new Record[inwon];

		// Record 클래스를 기반으로 생성된 객체들을 담을 수 있는
		// 배열방을 inwon 만큼 생성한 것임
		// 오해 : Record 클래스의 인스턴스를 생성한 것은 아니다.
		
	}
	
	// ② 상세 데이터 입력(총점 및 평균 산출 기능 포함)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		
		for (int i = 0;i<inwon ;i++ ) // i< rec.length 도 가능
		{	
			rec[i] = new Record();
			
			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
			rec[i].name = sc.next();
			

			for (int j =0;j<title.length ;j++ )
			{
				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt();  // score[0] 국어 / score[1] 영어 / score[2] 수학
				rec[i].tot += rec[i].score[j];	// tot = [0국영수] / [0국영수].......
			}

			rec[i].avg = rec[i].tot/3.0;

		}// end outer for
	}
	
	// ③ 결과 출력
	public void print()
	{
		// 석차 산출 메소드 호출
		// ranking();
		for (int i =0;i<inwon ;i++ )      // i<rec.length 도 가능
		{
			ranking();

			System.out.printf("%5s", rec[i].name);
			for (int j = 0;j < title.length ;j++ )
			{
				System.out.printf("%5d", rec[i].score[j]);
			}
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);
			System.out.printf("%5d", rec[i].rank);
			System.out.println();
		}

	}

	// + ④ 석차 산출 메소드 추가
	
	// 석차 산출 메소드는 졸라 중요하다.
	// 모든 애들을 1부터시작해서
	// 항별로 비교하는 반복문을 구현해서
	// 비교할때마다 기준항과 비교항 둘중 하나를 1씩추가시키는 연산을
	// 하면 총 석차가 나온다는 상상을 못하면
	// 절대 못푼다.

	private void ranking()
	{
		int i;
		int j;
		
		// 학생들의 rank 는 1로 통일
		for (i = 0;i<inwon ;i++ )
		{
			rec[i].rank = 1;
		}
			
		// 등수 산출
		for (i = 0;i < rec.length-1 ;i++ )	// -- 웅 → 비교기준  → 0     1     2
		{
			for (j = i+1 ;j<rec.length ;j++ )	// 쑝 → 비교대상 → 123   23    3
			{
				// 비교기준의 평균이 비교대상의 평균보다 크다면
				// 비교대상의 rank 를 1만큼 증가
				if (rec[i].avg > rec[j].avg)
				{
					rec[j].rank++;
				}

				// 비교대상의 평균이 비교기준의 평균보다 크다면
				// 비교기준의 rank를 1만큼 증가
				else if (rec[i].avg < rec[j].avg)
				{
					rec[i].rank++;
				}
			}
		}
		
	}

	


}






public class Test103
{
	public static void main(String[] args)
	{
		Sungjuk sj = new Sungjuk();
		sj.set();
		sj.input();
		sj.print();

		
	}
}

// 실행 결과

/*
인원 수 입력(1~100) : 3
1번째 학생의 이름 입력 : 김
국어 점수 : 100
영어 점수 : 80
수학 점수 : 90
2번째 학생의 이름 입력 : 상
국어 점수 : 90
영어 점수 : 100
수학 점수 : 100
3번째 학생의 이름 입력 : 기
국어 점수 : 100
영어 점수 : 100
수학 점수 : 100
    김  100   80   90  270   90.00    3
    상   90  100  100  290   96.67    2
    기  100  100  100  300  100.00    1
계속하려면 아무 키나 누르십시오 . . .
*/