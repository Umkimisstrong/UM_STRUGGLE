/* ==================================
    ■■■ 클래스와 인스턴스 ■■■
================================= */

// 생성자(Constructor) 관찰


public class Test079
{
	int val1;				// int 정수하나
	double val2;			// double 실수하나

	char k;
	Test079()				// 클래스 내부에서 생성자 만들기 1
	{
		val1=0;
		val2=0;

		System.out.println("매개변수 없는 생성자...");

	}
	Test079(int x)		// 클래스 내부에서 생성자 만들기 2(인트형)
	{
		val1=x;
		val2=0;
		System.out.println("int 형 데이터를 매개변수로 받는 생성자...");
	}

	Test079(double y) 	// 클래스 내부에서 생성자 만들기3(더블형)
	{
		val1=0;
		val2=y;
		System.out.println("double 형 데이터를  매개변수로 받는 생성자...");
	}

	Test079(int x, double y) 	// 클래스 내부에서 생성자 만들기4(인트, 더블 형)
	{
		val1 = x;
		val2 = y;
		System.out.println("int형 변수와 double 형 변수를 매개변수로 받는 생성자...");
	}



	public static void main(String[] args)
	{

		Test079 ob1 = new Test079();
		// 매개변수 없는 생성자...
		
		Test079 ob2 = new Test079(4);
		// int 형 데이터를 매개변수로 받는 생성자...

		Test079 ob3 = new Test079(4.0);
		// double 형 데이터를  매개변수로 받는 생성자...

		Test079 ob4 = new Test079(4, 4.0);
		// int형 변수와 double 형 변수를 매개변수로 받는 생성자...

		System.out.println(ob1.val1 + ", " + ob1. val2);
		// 0, 0.0
		System.out.println(ob2.val1 + ", " + ob2. val2);
		// 4, 0.0
		System.out.println(ob3.val1 + ", " + ob3. val2);
		// 0, 4.0
		System.out.println(ob4.val1 + ", " + ob4. val2);
		// 4, 4.0






	}
}

//

/*
매개변수 없는 생성자...
int 형 데이터를 매개변수로 받는 생성자...
double 형 데이터를  매개변수로 받는 생성자...
int형 변수와 double 형 변수를 매개변수로 받는 생성자...
0, 0.0
4, 0.0
0, 4.0
4, 4.0
계속하려면 아무 키나 누르십시오 . . .
*/