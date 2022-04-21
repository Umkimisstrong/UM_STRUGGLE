/* ===================================================
    ■■■ 메소드 중복정의(Method Overloading) ■■■
====================================================*/
/*
○ 메소드 오버로딩의 개요
   메소드 오버로딩(Overloading)이란
   메소드가 처리하는 기능은 같고
   메소드 괄호 속에 오는 인수(인자, 매개변수, 파라미터)의 갯수가 다르거나
   자료형(Date Type)이 다른 경우
   메소드의 이름을 동일한 이름을 부여하여 메소드를 정의할 수 있도록
   문법적으로 허용하게 되는데
   이를 메소드 오버로딩(Method Overloading)이라고 한다.

*/

public class Test105
{
	public static void main(String[] args)
	{


		drawLine();
		// ====================
		drawLine('-'); 
		// --------------------
		drawLine('<');
		// <<<<<<<<<<<<<<<<<<<<
		drawLine('+', 30);
		// ++++++++++++++++++++++++++++++d
		drawLine('/', 50);
		// //////////////////////////////////////////////////

			// println()	println("")	println('')...
			// printf("%n%d")	printf("%f")	printf("%c") ...
	}

	

	// 선을 그리는 메소드 정의--------------------------------

	public static void drawLine()
	{
		System.out.println("====================");
	}
	
	// 선을 그리는 메소드 정의2--------------------------------  같은이름(매개변수)
	public static void drawLine(char c)
	{
		for (int i =0;i < 20 ;i++ )
		{
			System.out.print(c);
		}
		System.out.println();
	}
	

	// 선의 형태와 길이를 바꾸어 그리는 메소드 정의
	public static void drawLine(char c, int n)
	{
		for (int i =0; i<n ;i++ )
		{
			System.out.print(c);
		}
		System.out.println();
	}
	


}
