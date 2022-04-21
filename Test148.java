/* =======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
======================================== */

// Random 클래스

/*
○ java.util.Random 클래스는
   
   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도
   난수를 제공하는 메소드지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는
   추가적인 연산을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는
   전용 클래스인 Random 클래스를 별도로 제공하고 있다.

   -- 기술면접에서 많이나오는게 오버로딩 오버라이딩
   -- 코딩테스트 : 로또 번호 생성기(단골)

*/

// 로또 번호 생성기(난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를
// 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 3 5 12 24 31 41
// 1 2  8 49  2  9
// 5 6 4 23 5  7
// 10 22 33 42 9 3
// 59 32 22 11 2 1

// 계속하려면 아무 키나 누르세요...

import java.util.Random;	
import java.util.Arrays;	// java util의 Arrays 클래스 참조

class Lotto
{
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6칸
    private int[] num;

	Lotto ()
	{
		num = new int[6];
	}
	
	// getter
	public int[] getNum()
	{

		return num;
	}

	public void start()
	{	
		Random rd = new Random();
		int n;
		int cnt = 0;
		
		jump:
		while(cnt<6)	// 0 1 2 3 4 5 
		{
			n = rd.nextInt(45)+1;	// 1 ~ 45	   가정 : 10 / 10(나오면 jump로돌아가서 10아닌수 나올때까지 강제반복)

			for (int i = 0;i < cnt ;i++ )
			{
				if (num[i]==n)
				{
					continue jump;
				}
			}
			num[cnt++] = n;		// num[0] num[1] num[2] num[3] num[4] num[5] 
		}
		sorting();
	}
	
	// 정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);
	}
}





public class Test148
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();

		for (int i =1 ;i<=5 ;i++ )
		{
			
			// 로또게임 수행
			lotto.start();

			for (int n : lotto.getNum() )
			{
				System.out.printf("%4d", n);
			}
			System.out.println();
		}
	}
}