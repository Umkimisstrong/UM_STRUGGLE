/*=========================
  ■■■클래스 고급■■■
=========================*/

// 인터페이스(Interface)

/*

○ 인터페이스(Interface)란

   완전히 미완성된  채로 남겨져
   인터페이스 안에 존재하는 그 어떤 메소드도
   몸체(정의부)가 없기 때문에 사실상 실행 부분이 존재하지 않는다.
   클래스를 위한 템플릿으로써의 기능을 수행하는 추상 클래스의 한 종류이다.

○ 인터페이스는 클래스와 달리 다중 상속이 가능하며
   인터페이스 자체도 상속된다.
   기존의 C++ 언어 등에서 지원되는 다중 상속이
   사용 과정에서 많은 문제점을 노출시켰기 때문에
   자바에서는 다중 상속의 개념을 인터페이스 라는 개념으로 변형하여
   인터페이스를 통해 다중 상속을 구현하는 방법을 지원한다.

○ 인터페이스는 상수와 추상 메소드만 가질 수 있으며
   인터페이스 안의 메소드들은 접근제어지시자를 명시하지 않아도
   『public』으로 설정되어 클래스에서 구현(implements)함으로써
   바로 접근이 이루어질 수 있다.  (일반적으로 클래스는 default 이나, 인터페이스는 public 으로 설정된다.)

○ 특징
    - 추상 클래스의 일종으로 선언만 있고 정의가 없다. (객체 생성 불가)

	- final 변수는 가질 수 있다.(상수의 개념)

	- 인터페이스는 『public static final』상수만 만들 수 있다.

	- 인터페이스를 구현하기 위해서는 『extends』대신에
	  『implements』를 이용한다.

    - 하나 이상의 인터페이스를 implements 할 수 있다.   extends A / implements A, B, C ...

	- 인터페이스를 implements 한 클래스는
	  인터페이스의 모든 메소드를 Overriding 해야 한다.

	- 인터페이스가 다른인터페이스를 상속받을 수 있으며
	  이 때, 『extends』키워드를 사용한다.
	  또한 클래스와 달리 인터페이스는 다중 상속이 가능하다.     interface 인터페이스 extends A, B, C ...

*/

// 인터페이스
interface Demo
{
	public static final double PI = 3.141592;

	// 인터페이스의 멤버변수는
	// 『static final』을 별도로 명시하지 않아도
	// 자동으로 『static final』인 상태!
	public int a = 10;

	// 인터페이스의 메소드는 선언만.......가능    
	// 자동으로 『abstract』인 상태
	// public abstract void print(); 로 여겨지는 것이다.
	public void print();
	/*
	{
		System.out.println("PI : " + PI);			// 정의구문 없어야함
	}
	*/
}

// 클래스
// class DemoImpl	extends Demo (Ⅹ)
// class DemoImpl	implements Demo(위상은 추상클래스) 
//         :
//         :
// 추상 클래스 - 인터페이스를 구현하는 추상 클래스
// abstract class DemoImpl	implements Demo
//         :
// 클래스 - 인터페이스를 구현하는 클래스
class DemoImpl	implements Demo
{
	@Override
	public void print()
	{
		System.out.println("인터페이스 메소드 재정의");
	}


	public void write()
	{
		System.out.println("클래스에 정의된 메소드");
	}
}




// main() 메소드를 포함하고 있는 외부 클래스
public class Test119
{
	public static void main(String[] args)
	{
		//Demo ob = new Demo();	 불가
		//DemoImpl ob = new DemoImpl();
		// -- print() 메소드 재정의 후 가능!
		
		//DemoImpl obTemp = new DemoImpl();
		//Demo ob = (Demo)obTemp;
		//Demo ob = obTemp;

		Demo ob = new DemoImpl();
		ob.print();
		// 인터페이스 메소드 재정의
		//ob.write(); 컴파일 에러 error: cannot find symbol

		// ○ 다운캐스팅
		((DemoImpl)ob).write();
		// 클래스에 정의된 메소드
		System.out.println(Demo.PI);
		// 3.141592 (static --- 클래스변수이기때문에 가능)
		System.out.println(Demo.a);
		// 10 (static 안보이지만 자동으로 static 반영, ---- 클래스변수이기때문에 가능)
		
		// Demo.a = 30;
		// 컴파일 에러 -- cannot assign a value to final variable a(final 되서 못바꿔요~~)





	}
}