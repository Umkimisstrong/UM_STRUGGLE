/* ===================================================
      ■ ■ ■  자바의 주요(중요) 클래스 ■ ■ ■
====================================================*/

// Wrapper 클래스  

public class Test136
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);
		/*
		3
		256
		*/

		print(b2);
		print(i2);

		// Byte 클래스의 byteValue()메소드 호출
		
		byte b3 = b2.byteValue(); // 언박싱

		// Integer 클래스의 intValue() 메소드 호출
		int i3 = i2.intValue();	// 언박싱

		int i4 = b2.byteValue(); // byte밸류이기때문에 int값에 담김
		//byte i4 = i2.intValue(); // int밸류이기때문에 자동형변환 규칙위반
		byte b4 = i2.byteValue();

		System.out.println(b3);
		System.out.println(i3);

		System.out.println(b4); // 0 → byte를 출력했을때 256을 출력하니
		                        //      0으로 출력되었음.
		System.out.println(i4);

	}
	/*
	static void print()
	{
		
	}

	static void print(Integer i)
	{
		
	}
	*/

	/*
	static void print(Object obj)	→ Object 가 모든걸 포괄하기때문에
	{								   가능은 하나, 바람직하지 않다.
	}								   왜..? → 데이터의 안정성 때문에
	*/								// 자바스크립트 쓰면 공감할 것이다.


	// java.lang.Number 클래스(추상클래스)는
	// 모든 숫자형 Wrapper 클래스들의 부모클래스
	// (슈퍼클래스, 상위클래스)이다.
	// b2, i2자료형이 Number에 넘어오면서
	// 업 캐스팅이 일어나게 된다.
	// Auto - Boxing

	static void print(Number n)		// ← 3
	{
		System.out.println(n);
		System.out.println(n.intValue());


	}
}