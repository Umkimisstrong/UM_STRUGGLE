/* ===================================================
      ■ ■ ■  자바의 주요(중요) 클래스 ■ ■ ■
====================================================*/

// ※ Test128.java 와 비교~!!

// import java.lang.*;
public class Test129	// extends Object
{
	/*
	...

	public String toString()
	{
		...;
	}

	...
	*/

	@Override
	public String toString()
	{
		return "재정의한 toString()...";
	}
	public static void main(String[] args)
	{
		Test129 ob = new Test129();

		System.out.println(ob.toString());
		//==> 재정의한 toString()...

		System.out.println(ob);
		//==> 재정의한 toString()...
	}
	
}