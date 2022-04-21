/* ===============================
   ■■■클래스와 인스턴스 ■■■
============================== */

// 클래스와 인스턴스 활용

// 1 ~ 3 사이의 난수를 발생시켜서
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

// ※ 기준 데이터 → 1 : 가위, 2 : 바위, 3 : 보

// 실행 예)
// 1:가위    2:바위     3:보    중 입력(1~3) : 4
// 1:가위    2:바위     3:보    중 입력(1~3) : -2
// 1:가위    2:바위     3:보    중 입력(1~3) : 2

// - 유  저 : 바위
// - 컴퓨터 : 보

// >> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!!
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.util.Random;

class RpsGame
{

	private int user;
	private int com;
	
	String [] game = {"가위", "바위", "보"};

	private void computer()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;
	
	}//end of void computer

	public void input()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:가위   2:바위   3:보   중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user>3 || user<1);


	}//end of void input

	public void gaming()
	{
		computer();
		System.out.printf("- 유저 : %s%n", game[user-1]);
		System.out.printf("- 컴퓨터 : %s%n", game[com-1]);

	}// end of void gaming

	public void output()
	{
		
		if (user == com)
		{	
			System.out.println();
			System.out.println(">> 결과 : 무승부");
		}
		else if ((user==1 && com == 2) || (user==2 && com == 3) || (user==3 && com == 1))
		{
			System.out.println();
			System.out.println(">> 결과 : 컴 승");
		}
		else if ((user==1 && com == 3)|| (user==2 && com ==2) || (user==3 && com==2))
		{
			System.out.println();
			System.out.println(">> 결과 : 유저 승");
		}
	}//end of void output

}  // end of class RpsGame



public class Test104
{
	public static void main(String[] args)
	{
		
		RpsGame rg = new RpsGame();
		rg.input();
		rg.gaming();
		rg.output();
	}
	
}// end of class Test104

// 실행 결과

/*
1:가위   2:바위   3:보   중 입력(1~3) : 1

 - 유저 : 가위
 - 컴퓨터 : 가위

>> 승부 최종 결과 : 무승부
계속하려면 아무 키나 누르십시오 . . .
*/

/*
1:가위   2:바위   3:보   중 입력(1~3) : 2

 - 유저 : 바위
 - 컴퓨터 : 가위

>> 승부 최종 결과 : 유저 승
계속하려면 아무 키나 누르십시오 . . .
*/

/*
1:가위   2:바위   3:보   중 입력(1~3) : 3

 - 유저 : 보
 - 컴퓨터 : 가위

>> 승부 최종 결과 : 컴퓨터 승
계속하려면 아무 키나 누르십시오 . . .
*/