/* ===================================================
      ■ ■ ■  자바의 주요(중요) 클래스 ■ ■ ■
====================================================*/

// StringBuffer 클래스  


/*
○ StringBuffer 클래스는
   문자열을 처리하는 클래스로 String 클래스와의 차이점은
   String 클래스는 내부 문자열 데이터의 수정이 불가능 하지만
   StringBuffer 클래스는 문자열을 사용할 때
   내부 문자열을 실행 단계에서 변경할 수 있다.

   즉, StringBuffer 객체는 가변적인 길이를 가지므로
   객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
   실행 시점에 버퍼의 크기를 바꿀 수 있는 기능을 제공한다.

   또한, JDK 1.5 이후부터는


   문자열을 처리하는 StringBuilder 라는 클래스도 제공한다.


   StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만


   가장 큰 차이점은 multi-thread unsafe 라는 점이다.


   즉, Syncronization 이 없기 때문에


   StringBuffer 보다 빠르며 동시성(동기화) 문제가 없다면


   StringBuilder를 사용하는 것이 성능을 향상시킬 수 있다.



	성능 ↔ 기능 반비례
*/

// 참고 : StringBuffer 클래스에는 
// equals()가 오버라이딩 되어있지 않아서..  equals()메소드를 사용하면 Object 클래스의 
// 메소드 equals()로 사용이 되며... 그것은 곧 주솟값을 비교한다는 의미
public class Test140
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2); // 주솟값 비교 : 다르다
		System.out.println(sb1.equals(sb2)); // 주솟값 비교 : 다르다
		/*
		false
		false
		*/

		System.out.println(sb1);
		// korea

		System.out.println(sb2.toString());
		// korea

		System.out.println(sb1.toString().equals(sb2.toString()));
		// true

		System.out.println();


		StringBuffer sb3 = new StringBuffer();
		// -- StringBuffer 기본 생성자 호출 (인스턴스 생성 과정)
		//    기본적으로 생성되는 버퍼의 크기는 『16』

		System.out.println("버퍼 크기 : " + sb3.capacity());
		// 버퍼 크기 : 16

		System.out.println(sb3);
		// 암것도 없음 無
		
		/*
		String name = "홍길동";
		name += "이순신";
		name += "강감찬";
		System.out.println(name);
		홍길동이순신강감찬
		*/

		sb3.append("seoul");		//sb3 += "seoul";
		sb3.append("korea");		//sb3 += "korea";
		sb3.append("우리나라");		//sb3 += "우리나라";
		sb3.append("대한민국");		//sb3 += "대한민국";

		System.out.println(sb3);
		// seoulkorea우리나라대한민국

		System.out.println(sb3.toString());
		// seoulkorea우리나라대한민국

		System.out.println("버퍼 크기 : " + sb3.capacity());
		// 버퍼 크기 : 34
		
		/////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		// JAVA AND ORACLE

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		// java and oracle

		// System.out.println(sb3.toUpperCase());
		// System.out.println(sb3.toLowerCase());

		// StringBuffer 로 toUpperCase / toLowerCase 사용 못함..
		//    클래스    안에         메소드   없음...

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		System.out.println(sb3.toString().toUpperCase());
		/*
		java and oracle
		SEOULKOREA우리나라대한민국
		SEOULKOREA우리나라대한민국
		*/
		
		// seoulkorea우리나라대한민국

		// ○ 대상 문자열 (sb3) 중 seoul 앞에
		//    "한국" 이라는 문자열 추가
		//    → 한국seoulkorea우리나라대한민국

		sb3.insert(0, "한국");
		System.out.println("seoul 앞에 『한국 추가』 : " + sb3.toString());
		//  seoul 앞에 『한국 추가』 : 한국seoulkorea우리나라대한민국

		// ○ 대상 문자열(sb3) 중 korea 문자열 뒤에
		//    "사랑" 이라는 문자열 추가
		//    단, 대상 문자열의 인덱스를 눈으로 직접 확인하지 않고..

		// 테스트 ①
		System.out.println(sb3.toString());
		//한국seoulkorea우리나라대한민국
		

		// 테스트 ②
		//sb3.insert(12, "사랑");
		//System.out.println("korea 뒤에 『사랑』 추가 : " + sb3.toString());

		// 테스트 ③
		System.out.println(sb3.indexOf("korea"));
		// 7

		// 테스트 ④
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "사랑"));
		// 한국seoul사랑korea우리나라대한민국
		//System.out.println(sb3.insert(sb3.indexOf("korea") + 5, "사랑"));
		System.out.println(sb3.insert(sb3.indexOf("korea") + "korea".length(), "사랑"));
		// 한국seoulkorea사랑우리나라대한민국


		// ○ 대상 문자열(sb3) 에서
		//    『우리나라』문자열 삭제
		// sb3.delete(14, 18);
		// System.out.println(sb3);
		// 한국seoulkorea사랑대한민국

		System.out.println(sb3.indexOf("우리나라"));
		sb3.delete((sb3.indexOf("우리나라")), sb3.indexOf("우리나라")+"우리나라".length());
		System.out.println(sb3);
		// 한국seoulkorea사랑대한민국

		// ○ 대상 문자열(sb3) 에서
		//    『korea』이후 문자열 삭제
		// sb3.delete(7, 18);
		//System.out.println(sb3);
		// 한국seoul
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		// 한국seoul

		//////////
		// 버퍼 크기 확인

		System.out.println("버퍼 크기 : " + sb3.capacity());
		// 버퍼 크기 : 34
		// 버퍼크기는 최초와 같다.
		// 문자열 sb3 의 길이 확인
		System.out.println("문자열 길이 : " + sb3.length());
		// 7

		// 버퍼 크기 조절
		// → 현재 문자열을 담아둘 수 있는 버퍼의 크기로....
		sb3.trimToSize();

		// 버퍼 크기 조절 이후 버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity()); 
		// 버퍼 크기 : 7

		
		



	}
}

