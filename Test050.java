/*==============================================
  ■ ■ ■ 실행 흐름의 컨트롤(제어문) ■ ■ ■
==============================================*/

// 반복문(while문) 실습

// 1부터 100 까지의 정수의 합을 구하되...
// 10의 배수가 될 때마다... 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 1 ~ 10까지의 합 : xx
// 1 ~ 20까지의 합 : xx
//			:
// 1 ~ 100까지의 합 : xx
// 계속하려면 아무 키나 누르세요.....

public class Test050
{
	public static void main(String[] args)
	{
		int a=1;
		int sum=0;


		while(a<=100)
		{
			sum += a;
			// System.out.println("a : " + a + ", sum : " + sum);
			if(a%10==0)
			{
				 //System.out.println("a : " + a + ", sum : " + sum);// 출력

				 System.out.printf("1 ~ %d 까지의 합 : %d%n",a, sum);
			}
			a++;

		}

	
	}
}


// 실행 결과

/*
1 ~ 10 까지의 합 : 55
1 ~ 20 까지의 합 : 210
1 ~ 30 까지의 합 : 465
1 ~ 40 까지의 합 : 820
1 ~ 50 까지의 합 : 1275
1 ~ 60 까지의 합 : 1830
1 ~ 70 까지의 합 : 2485
1 ~ 80 까지의 합 : 3240
1 ~ 90 까지의 합 : 4095
1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .
*/