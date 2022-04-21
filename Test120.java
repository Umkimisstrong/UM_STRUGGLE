/*=========================
  ■■■클래스 고급■■■
=========================*/

// 인터페이스(Interface)

interface ADemo
{
	public void write();
}

interface BDemo
{
	public void print();
}




//class DemoImpl	extends ADemo, BDemo
//class DemoImpl	implements ADemo, BDemo
//   추상 클래스(메소드 오버라이딩 전)
//abstract class DemoImpl	implements ADemo, BDemo
//		↓
//   구현 클래스(메소드 오버라이딩 후)
class DemoImpl	implements ADemo, BDemo
{
	// JDK 1.5(5.0)에서는 인터페이스 메소드를
	// 오버라이딩 할 때
	// @Override 어노테이션을 사용할 수 없다.
	// JDK 1.6 이후부터 적용 가능한 문법이다.
	// 단, 상속받은 클래스의 메소드를 오버라이딩 할 때는
	// JDK 1.5에서도 @Override 어노테이션 사용이가능하다.
	@Override
	public void write()
	{
		System.out.println("ADemo 인터페이스 메소드 write()...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo 인터페이스 메소드 print()...");
	}
}







// main()메소드를 포함하고 있는 외부의 다른 클래스
public class Test120
{
	public static void main(String[] args)
	{
		//ADemo ob = new ADemo();  // -- 인터페이스라 안됌
		//BDemo ob = new BDemo();  // -- 인터페이스라 안됌

		// ADemo BDemo를 구현한 클래스 DemoImpl 기반의 인스턴스 생성
		
		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		ob1.print();
		/*
		ADemo 인터페이스 메소드 write()...
		BDemo 인터페이스 메소드 print()...
		계속하려면 아무 키나 누르십시오 . . .
		*/
	

		ADemo ob2 = new DemoImpl();		// 업캐스팅
		BDemo ob3 = new DemoImpl();		// 업캐스팅

		//ob2.print();			] 둘다
		//ob3.write();			] 에러

		ob3.print();
		ob2.write();
		/*
		BDemo 인터페이스 메소드 print()...
		ADemo 인터페이스 메소드 write()...
		*/

		((BDemo)ob2).print();
		((ADemo)ob3).write();
		/*
		BDemo 인터페이스 메소드 print()...
		ADemo 인터페이스 메소드 write()...
		*/
		// DemoImpl 클래스가 두 인터페이스를 모두 구현했기 때문에 가능.
		// 만약, DemoImpl 클래스가 이들 중 한 인터페이스만 구현했다면
		// 이 구문은 런타임 에러 발생하는 구문이 된다.

		//다운캐스팅
		((DemoImpl)ob3).write();
		//ADemo 인터페이스 메소드 write()...





	}
}

// 실행 결과

/*
ADemo 인터페이스 메소드 write()...
BDemo 인터페이스 메소드 print()...
BDemo 인터페이스 메소드 print()...
ADemo 인터페이스 메소드 write()...
BDemo 인터페이스 메소드 print()...
ADemo 인터페이스 메소드 write()...
ADemo 인터페이스 메소드 write()...
계속하려면 아무 키나 누르십시오 . . .
*/