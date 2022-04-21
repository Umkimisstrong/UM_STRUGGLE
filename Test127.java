/* ===================================
    ■ ■ ■  클래스 고급 ■ ■ ■  
=================================== */

// 중첩 클래스 

/*
○ Annonymous 클래스(익명의 클래스 : 무명 클래스)
   
   - awt 나 안드로이드 이벤트 처리에서 일반적으로 사용
   - 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
   - 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는
     번거로움 때문에 익명의 클래스를 생성하여 처리한다.


○ 형식 및 구조
   
   new 상위 클래스의 생성자()
   {
	   접근제어지시자 자료형 메소드()
	   {
		   ...;
	   }
   };	세미콜론!! 확인해라
*/

class Test3	// extends Object
{
	
	/*
	Object 클래스의 멤버들...

	public String toString()    → Object가 갖고있는 원래의 메소드
	{
		...;
	}
	*/
	public Object getString()
	{
		return new Object()
		{
			@Override
			public String toString()
			{
				return "익명의 클래스...";
			}
		};
	}
}
public class Test127
{
	public static void main(String[] args)
	{
		Test3 ob = new Test3();

		System.out.println(ob.toString());
		// ==>Test3@15db9742

		System.out.println(ob.getString());
		// 익명의 클래스...

	}
}