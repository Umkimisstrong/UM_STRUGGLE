/*====================================
	  ■■■ 클래스 고급 ■■■
====================================*/

// 상속(Inheritance)

/*
※ 메소드 오버라이딩(Method Overriding)의 특징
   - ① 메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야 한다.

   - ② 반드시 상속 관계가 있어야 한다.

   - ③ 재정의된 하위 클래스의 메소드 접근제어지시자는
     상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
	 예를 들어, 상위 클래스의 메소드 접근제어지시자가 『protected』인 경우
	 하위 클래스가 이 메소드를 오버라이딩(Overriding)하는 경우
	 하위 클래스 메소드의 접근제어지시자는 『protected』 또는 『public』 이어야 한다.

                                  ┌> 접근자체가 불가
                                ---------
   - ④ 『static』, 『final』, 『private』 메소드는 오버라이딩(Overriding)할 수 없다.
         --------   -------
	탄생시점<┘		  └> 상속시켜줄때 고정시킨다.

   - ⑤ Exception 의 추가가 불가능 하다.
     즉, 상위 메소드가 가지고 있는 기존 예외 사항에
	 새로운 Exception을 추가하는 것은 불가능 하다.
*/

// 부모, 상위 super 클래스
class SuperTest116
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
}


// 자식, 하위 sub 클래스
class SubTest116 extends SuperTest116
{

	/*
	private int a = 5;    ----------- X                          
	--------------------------- ↓↓ ↓↓ ------------------------
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
	*/
	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c);  에러   error: a has private access in SuperTest116

		System.out.println("Sub print() 메소드 : " + b + " : " + c);

		//System.out.println("Sub print() 메소드 : " + b);  = 100
		//System.out.println("Sub print() 메소드 : " + this.b); = 100
		//System.out.println("Sub print() 메소드 : " + super.b); = 10
		//- 변수 b 는 접근 방법에 따라 다른 b 로 접근 및 출력이 이루어진다.
		//  슈퍼 클래스에서 선언된 b, 서브 클래스에서 선언된 b

		// System.out.println("Sub print() 메소드 : " + c); = 20
		// System.out.println("Sub print() 메소드 : " + this.c); = 20
		// System.out.println("Sub print() 메소드 : " + super.c); = 20
		//- 변수 c 는 접근하는데 아무런 제약과 제한이 없다.
		//  슈퍼클래스에서 선언된 c
	}

	@Override
	public void write()
	{
		//System.out.println("Sub write() 메소드 : " + a + " : " + b + " : " + c);
		//-- 슈퍼클래스에서 선언된 변수 a 에는 접근할 수 없다.
		//   private a(접근제어지시자 때문)
		System.out.println("Sub write() 메소드 : " + b + " : " + c);
	}
}


// main () 메소드를 포함하는 외부의 다른 클래스
public class Test116
{
	public static void main(String[] args)
	{

		// 하위 클래스(SubTest116) 인스턴스 생성
		SubTest116 st = new SubTest116();
		st.print();
		// Sub print() 메소드 : 100 : 20

		st.write();
		// Super write() 메소드 : 5 : 10 : 20
		// Sub write() 메소드 : 100 : 20
		
		System.out.println("---------------------------------------------- 구분선");

		System.out.println(st.b);
		// 100
		
		System.out.println(((SuperTest116)st).b);
		// 10

		((SuperTest116)st).write();
		// Sub write() 메소드 : 100 : 20

		// 슈퍼콜(슈퍼부름).... 외부 클래스에서 부모클래스의 변수 호출가능, 부모클래스의 메소드는 호출불가능
		// 메소드 : 슈퍼콜 안됌
		// 변수 : 슈퍼콜 됌
	}
}