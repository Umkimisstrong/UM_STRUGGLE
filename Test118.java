/*=========================
  ■■■클래스 고급■■■
=========================*/

// 상속 관계에 있는 클래스들 간의 캐스팅
// 업 캐스팅, 다운 캐스팅

// super class, 부모 클래스, 상위 클래스
class SuperTest118
{
	public int a =10, b = 20;
	public void write()
	{
		System.out.println("슈퍼 클래스 write() 메소드...");
	}

	public int hap()
	{
		return a + b;
	}
}

// sub class, 자식 클래스, 하위 클래스
class SubTest118 extends SuperTest118
{
	public int b = 100, c=200;
	
	@Override
	public int hap()
	{
		return a + b + c;
	}

	public void print()
	{
		System.out.println("서브 클래스 print() 메소드...");
	}
}

// main()메소드를 포함하는 외부의 다른 클래스
public class Test118
{
	public static void main(String[] args)
	{
		
		SubTest118 st118 = new SubTest118();	// sub 기반 인스턴스 생성

		System.out.println("st118.b : " + st118.b);  // st118.b : 100

		SuperTest118 ob2 = st118;	// SuperTest118 ob2 = (SuperTest118)st118;
									// 부모객체 타입으로 하위객체를 캐스팅하는것을 업 캐스팅

		System.out.println("ob2.b : " + ob2.b);	// ob2.b : 20

		System.out.println("합      : " + ob2.hap());	// 합 : 310  ( 오버라이드 되면 그거로 재정의 된다. )
																	// 자식의 입장에서 생각하기.
														// hap()은 업캐스팅된 SuperTest118에서 재정의한다.
														// 원래의 기능으로 못돌아가.
		ob2.write();	//슈퍼 클래스 write() 메소드...

		// ob2.print();	// 에러 발생 : cannot find symbol

		((SubTest118)ob2).print();	// 서브 클래스 print() 메소드... 
							        // 자식객체 타입으로 부모객체를 캐스팅하는 것을 다운 캐스팅

		// ※ 추가 관찰 ----------------------------------------------------
		//    다운 캐스팅 가능 여부

		SuperTest118 ob3 = new SuperTest118();

		SubTest118 ob4;

		// System.out.println(ob3.c);  → 컴파일 에러, 상위 객체는 하위 객체의 멤버에 접근하는 것이 불가능

		// ob4 = ob3; → 컴파일 에러, 상위 객체는 하위 객체에 담을 수(참조할 수) 없다.
		
		// ob4 = (SubTest118)ob3; → 런타임 에러, 작성된 구문의 문법적인 구조만 봤을 때 다운캐스팅이
							 	 //  이루어지는 상황이나 ...... 정상적인 캐스팅이 이루어지지 않는다.
								 //  메모리할당여부 때문.!		

		
	}
}

/*


○ 업 캐스팅, 다운 캐스팅이 정상적으로 이루어 지는 경우 -----------------------------------------------
	1. 하위 객체 생성;		// 제일 중요...................... 뭐든 될려면 자식 객체가 생성 되어있어야함.
	2. 상위 = 하위;			// 업 캐스팅. 정상.
	3. 하위 = 상위;			// 에러 발생.
	4. 하위 = (하위)상위;	// 다운 캐스팅. 정상.

○ 다운 캐스팅이 정상적으로 이루어지지 않는 경우
	1. 상위 객체 생성;		// 얘도 중요... 
	2. 하위 = 상위;			// 에러 발생.
	3. 하위 = (하위)상위;	// 다운캐스팅. 런타임 에러 발생.


	∴ 업 캐스팅은 항상 가능. 다운 캐스팅은 경우에 따라 가능.


*/