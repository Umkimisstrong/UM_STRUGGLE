/* ===================================================
      ■ ■ ■  자바의 주요(중요) 클래스 ■ ■ ■
====================================================*/

// String 클래스  

public class Test139
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		System.out.println(s.substring(6, 9));
		// seoul korea
		// kor	

		// 『String.substring(s, e)』
		//  String 문자열을 대상으로
		//  s번째에서 e-1번째 까지 추출
		//  단 인덱스는 0부터 시작

		System.out.println(s.substring(7));
		// orea
		// ※ 『String.substring(s)』
		//     String 문자열을 대상으로
		//     s 번째에서... 끝까지 추출
		//     (즉, 문자열이 가진 길이만큼....)

		// ○ 문자열의 데이터(값)비교
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
		/*
		true
		false 대소문자 구분
		*/

		System.out.println(s.equalsIgnoreCase("Seoul Korea"));
		// true 대소문자 구분안함
		
		// ○ 찾고자 하는 대상 문자열 s 에
		//    『kor』문자열이 존재할까?
		//    존재한다면 ... 그 위치는 어떻게 될까?
		// seoul korea
		// 0123456
		System.out.println(s.indexOf("kor"));
		// 6   (번째이다)

		System.out.println(s.indexOf("ea"));
		// 9 (번째이다)
		System.out.println(s.indexOf("e"));
		// 1 (번째이다)

		System.out.println(s.indexOf("tt"));
		// -1    (음수 : 찾고자 하는 문자열이 대상 문자열에 존재하지 않음.)

		// ○ 대상 문자열(s)이 『rea』로 끝나는지의 여부 확인
		//    (true / false);
		System.out.println(s.endsWith("rea"));
		System.out.println(s.endsWith("oul"));
		// true
		// false

		// ○ 찾고자 하는 대상 문자열(s)에
		//    『e』 문자열이 존재할까?
		//    존재한다면 그 위치는 어떻게 될까?
		//    (단, 뒤에서 부터 검사)

		// seoul korea
		System.out.println(s.indexOf("e"));
		// 1
		System.out.println(s.indexOf("o"));
		// 2
		System.out.println(s.lastIndexOf("e"));    // last 수식어 붙여주기
		// 9
		System.out.println(s.lastIndexOf("o"));
		// 7
		
		// ○ 대상 문자열(s) 중
		//    『6』번째 인덱스 위치의 문자는?
		
		// charAt(x) seoul korea

		System.out.println(s.charAt(6));
		// k

		//System.out.println(s.charAt(22));
		// (런타임 에러)Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 22

		// ○ 대상 문자열(s) 과 비교 문자열 『 seoul corea 』 즁 
		//    어떤 문자열이 더 큰가? → 문자열에 대한 크기 비교
		//    ==> 두 문자열이 같다면 → 0
		//    ==> 두 문자열이 다르다면 → 차이를 확인(사전식 배열)

		System.out.println(s.compareTo("seoul korea"));
		// 0

		System.out.println(s.compareTo("seoul corea"));
		// 8 
		// =-=> c ~ k  의 차이  a b c ( d e f g j i j )k → 8
		
		// ○ 대상 문자열(s) 중
		//    해당 문자열을 찾아서 원하는 형태로 수정

		s = "우리나라 대한민국 대한독립 만세";
		s = s.replaceAll("대한", "자주");
		System.out.println("처리 결과 : " +s);
		// 처리 결과 : 우리나라 자주민국 자주독립 만세

		// ○ 공백 제거
	    s = "                 사                   라                    "; 
		System.out.println("|||" + s + "|||");
		// |||                 사                   라                 |||

		System.out.println("|||" + s.trim() + "|||");	// Oracle 에서는 Ltrim과 Rtrim이 있다.
		// |||사                   라|||
		//  JAVA 에서는 문자열 양 옆 공백을 제거

		System.out.println("|||" + s.replaceAll(" ", "") + "|||");
		//                                      --------
		// 공백이 있는 문자열을 없는 문자열로 대체해라.....

		// "30"
		int temp = Integer.parseInt("30");
		System.out.printf("%d\n", temp);

		s = Integer.toString(30);
		System.out.printf("%s\n", s);

		// 30
		
		int n = 2345678;
		System.out.printf("%d", n);	// : 출력스트림에 태워서
		System.out.format("%d", n); // : 해당 모양새로 출력해라 
		//23456782345678계속하려면 아무 키나 누르십시오 . . .

		s = String.format("%d", n);	// String.format() 이나 System.out.print()구문이나 기능은같다.
		System.out.println();
		System.out.println(s);
		// 2345678

		s=String.format("%,d", n);
		System.out.println(s);
		// 2,345,678
		
		//String str = "기본,열정,배려";
		//String[] strArr = str.split(",");

		String [] strArr = "기본,열정,배려".split(",");
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		// 기본 열정 배려


	}
}