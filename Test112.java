/*=========================================
    ■■■ 정렬 (Sort) 알고리즘 ■■■
========================================*/

// ○ 과제
//    사용자로부터 여러 학생의 성적 데이터를 입력받아
//    점수가 높은 학생부터 낮은 순으로 등수를 부여하여
//    결과를 출력하는 프로그램을 구현한다.
//    단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1, 공백 구분) : 이아린 90
// 이름 점수 입력(2, 공백 구분) : 박현수 87
// 이름 점수 입력(3, 공백 구분) : 이지연 86
// 이름 점수 입력(4, 공백 구분) : 서민지 75
// 이름 점수 입력(5, 공백 구분) : 김민성 70
/*
-----------------
1등 이아린 90
2등 박현수 87
3등 이지연 86
4등 서민지 75
5등 김민성 70
-----------------
계속하려면 아무 키나 누르세요...

*/


import java.util.Scanner;

public class Test112
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		int getScore;
		String k;



			System.out.print("인원 수 입력 : ");
			a = sc.nextInt();

		// 학생 수 만큼의 석차, 이름, 점수 배열 생성
		String [] names = new String[a];
		int [] ranks = new int [a];
		int [] score = new int [a];


		for (int i =1;i<=a ;i++ )
		{
			System.out.printf("이름 점수 입력(%d, 공백 구분) : ", i);
			k = sc.next();
			getScore = sc.nextInt();

			names [i-1] = k;
			score [i-1] = getScore;
		}

		// 김 이 박  최  강
		// 60 80 70 100 90
		// 1  1  1   1   1
		
		// 석차 1로 초기화
		for (int i = 0;i < score.length ;i++ )
		{
			ranks[i]=0;
		}

		int n = 1;

		// 점수 비교 해서 -> 기준점수보다 비교점수가 낮을경우 자리바꿈

		for (int i = 0;i<score.length-1 ;i++ )
		{
			for (int j = 1;j<score.length ;j++ )
			{
				if (score[i] > score [j])
				{

					score[i] = score[i]^score[j];
					score[j] = score[j]^score[i];
					score[i] = score[i]^score[j];
					
					String str;
					str = names[i];
					names[i] = names[j];
					names[j] = str;

				}
			}
		}
		
		for (int i =0;i < score.length ; i++ )
		{
			ranks[i] += n;
			n++;
		}
		
		// 60 70 80 90 100 으로 정렬완료
		// 랭크도 해당 열대로 1부터 ~ 사람명수만큼 석차분배
		System.out.println();

		for (int i = 0 ;i<a; i++ )
		{
			System.out.printf("%d등, %s, %d", ranks[i], names[a-i-1], score[a-i-1]);
			System.out.println();
		}

	}
}

// 실행 결과

/*
인원 수 입력 : 3
이름 점수 입력(1, 공백 구분) : 신라면 100
이름 점수 입력(2, 공백 구분) : 너구리 80
이름 점수 입력(3, 공백 구분) : 짜파게티 120

1등, 짜파게티, 120
2등, 신라면, 100
3등, 너구리, 80
계속하려면 아무 키나 누르십시오 . . .
*/

