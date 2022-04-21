/* ==================================
    ■■■ 클래스와 인스턴스 ■■■
================================= */

// 생성자(Constructor)와 초기화 블럭(Initialized Block)

// 현업 종사자들도 잘 모르는 거

public class Test080
{
	/*
	int n;
	int m;

	n=100;			// 초기화가 아니라 연산이어서
	m=200;			// 컴파일시 오류가 생긴다.        ...... 메소드 안에서만 연산가능
	*/
	
	/*
	int n = 100;	 // 연산이 아니라 초기화여서
	int m = 200;     // 컴파일시 오류가 생기지 않는다. 
	*/


	int n;
	int m;
	


	{		// 초기화 블럭(Initialized Block) {} 은 실행시 가장 먼저 실행된다.
			// 그러나 생성자들끼리는 순서가있어서. 나중에 실행된 것이 최종적으로 덮는다.
		n=20;			
		m=40;
		System.out.println("초기화 블럭 실행...!!!!!");
	}

	// 생성자    → 초기화 블럭이 코드를 어떤식으로 수행하던
					// 최종적으로 멤버들의 초기화 값을 결정하게 되는 개념!!!!!!

	Test080()
	{
		n=100;
		m=200;	
		System.out.println("생성자 실행...");
	}
	

	Test080(int n, int m)
	{
		this.n=n;
		this.m=m;
		System.out.println("매개변수 있는 생성자 실행...");

	}	
	// 멤버 출력 메소드 정의
	void write()
	{
		System.out.println("n :" + n + ", m :" + m);
	}







	public static void main(String[] args)
	{
		Test080 ts = new Test080();
		ts.write();

		Test080 ts2 = new Test080(1234, 5678);
		ts2.write();
	}
}

// 실행 결과

/*

초기화 블럭 실행...!!!!!
생성자 실행...
n:100, m :200
초기화 블럭 실행...!!!!!
매개변수 있는 생성자 실행...
n:1234, m :5678
계속하려면 아무 키나 누르십시오 . . .

*/