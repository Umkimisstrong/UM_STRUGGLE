/* ==================================
    ■■■ 클래스와 인스턴스 ■■■
================================= */

// 생성자(Constructor)

class NumberTest2
{
	int num;
	

	// 사용자 정의 생성자가 정의되어 있으므로 default 생성자가 자동으로 생성안됨
	/*
	NumberTest2()
	{
	}
	*/ 
	NumberTest2(int n)
	{
		num = n;
		System.out.println("생성자 호출 시 매개변수 전달 : " + n);

	}

	int getNum()
	{
		return num;
	}
}
public class Test077
{
	public static void main(String[] args)
	{
		// NumberTest2 인스턴스 생성
		// NumberTest2 ob1 = new NumberTest2();
		//--==>> 에러발생(컴파일에러)
		//-- NumberTest2 클래스에는
		//	 사용자 정의 생성자가 존재하고 있는 상황이기 때문에
		//	 『default 생성자』 가 자동으로 삽입되지 않으며
		//	 사용자가 정의한 생성자는 매개변수를 갖는 형태이기때문에 int n
		//	 위와 같이 매개변수 없는 생성자 호출 시 문제가 생기는 것이다.


		NumberTest2 ob1 = new NumberTest2(10);
		// --==>> 생성자 호출 시 매개변수 전달 : 10

		System.out.println("메소드반환 값 : " + ob1.getNum());
		// --==>> 메소드반환 값 : 10


		NumberTest2 ob2 = new NumberTest2(3454);
		System.out.println("메소드반환 값 : " + ob2.getNum());
		// --==>>
		/*
		생성자 호출 시 매개변수 전달 : 3454
		메소드반환 값 : 3454
		*/
		}
}