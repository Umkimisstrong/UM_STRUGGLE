/* =================================
   ■■■ 클래스와 인스턴스■■■
=================================*/

// 정보 은닉과(information hiding) 접근제어지시자(access control specifiers, 접근지정자, 접근제한자, ...)

import java.util.Scanner;

class CircleTest2
{
	// 멤버 변수, 인스턴스 변수, 전역 변수
    //int num;

	// ↓

	// 정보 은닉(Information Hiding)
	// 『private』 접근제어지시자의 선언은						→  왜 하필 private 을 선언하는가?? : 왜 하필 메소드로 선언하여 호출하는가??? : 
																    // 규칙을 정해서 컨트롤을 용이하게 한다.
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미
	// int 형 전역변수 → 자동 0으로 초기화 지원

	 private int num;

	 // getter / setter 구성
	
	/*
	 int getNum()
	{
		return num;
	}
	void setNum(int num)
	{
		this.num = num;
	}
	*/
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		num = sc.nextInt();
	}

	double calArea()
	{
		return 	num * num * 3.141592;
	}

	void write(double area)
	{
		System.out.println("반지름 : " + num);
		System.out.println("넓이 : " + area);
	}











}


public class Test100
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();
		
		//ob1.num = 10;
		// ↓
		//ob1.setNum(10);

		
		//System.out.println("원의 반지름 : " + ob1.num);
		// 원의 반지름 : 10
		//System.out.println("원의 반지름 : " + ob1.getNum);
		//ob1.setNum(10);
		//System.out.println("원의 반지름 : " + ob1.getNum());
		





		/*	private 선언하면 : 선언도 안되고 출력도 안되고(전부 접근불가)

		Test100.java:37: error: num has private access in CircleTest2
                ob1.num = 10;		
                   ^
		Test100.java:38: error: num has private access in CircleTest2
                System.out.println("원의 반지름 : " + ob1.num)
		*/ 

		ob1.input();
		double result = ob1.calArea();
		ob1.write(result);

		/*
		반지름 입력 : 1
	    계속하려면 아무 키나 누르십시오 . . .
		*/

		

	} 
}

// 실행 결과

/*
반지름 입력 : 3
반지름 : 3
넓이 : 28.274328
계속하려면 아무 키나 누르십시오 . . .
*/