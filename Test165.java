/* ========================================================================
	    ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=========================================================================*/

// Test165 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

    [메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 1
			
	1번째 요소 입력 : 박현수
	1번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N)? : y

	2번째 요소 입력 : 오이삭
	2번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N)? : N

    [메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
	    박현수
		오이삭
	벡터 전체 출력 완료~!!!

    [메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 오이삭

	[검색 결과 출력]
	항목이 존재합니다.

    [메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 임소민

	[검색 결과 출력]
	항목이 존재하지 않습니다.

    [메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 홍은혜

	[삭제 결과 출력]
	항목이 존재하지 않아 삭제할 수 없습니다.

    [메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 박현수

	[삭제 결과 출력]
	박현수 항목이 삭제되었습니다.

    [메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력 : 김민성

	[변경 결과 출력]
	변경할 대상이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력 : 오이삭

	[변경 결과 출력] : 오이삭
	수정할 내용 입력 : 정은정

	[변경 결과 출력]
	변경이 완료되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
		정은정
	벡터 전체 출력 완료~!!!

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 6

	프로그램 종료
	계속하려면 아무 키나...

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Vector;

class Menus
{
	public static final int E_ADD = 1;
	public static final int E_DISP = 2;
	public static final int E_FIND = 3;
	public static final int E_DEL = 4;
	public static final int E_CHA = 5;
	public static final int E_EXIT = 6;
}

public class Test165
{
	private static final Vector<Object> vt; // 자료 적재
	private static BufferedReader br;		// 입력 값
	private static Integer sel;				// 선택 값
	private static String con;				// Y / N

	// static 초기화 블럭
	static
	{
		vt = new Vector<Object>();

		// BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화.
		sel = 1;
		con = "Y";
	}


	// 메뉴 출력 메소드
	public static void menuDisp()
	{
		System.out.println("==================================");
		System.out.printf("\t[메뉴선택]\n \t1. 요소 추가\n \t2. 요소 출력\n \t3. 요소 검색\n \t4. 요소 삭제\n \t5. 요소 변경\n \t6. 종료\n");
		System.out.println("==================================");
	}

	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{
		System.out.print("\t>> 메뉴 선택(1~6) : ");
	}

	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		sel = Integer.parseInt(br.readLine());
		System.out.println("==================================");
		if (sel == Menus.E_EXIT)
			exit();
		else if (sel == Menus.E_ADD)
		{
			addElement();
			System.out.println();
		}
		else if (sel == Menus.E_DISP)
		{
			dispElement();
			System.out.println();
		}
		else if (sel == Menus.E_FIND)
		{
			findElement();
			System.out.println();
		}
		else if (sel == Menus.E_DEL)
		{
			delElement();
			System.out.println();
		}
		else if (sel == Menus.E_CHA)
		{
			chaElement();
			System.out.println();
		}
		else
			System.out.println("\n\t똑바로누르세요!");
	}

	// 자료구조에 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
			Object k = "";
			do
			{
				System.out.println();
				System.out.printf("\t%d번째 요소 입력 : ", (vt.size()+1));
				k = br.readLine();
				vt.add(k);
				System.out.printf("\n\t%d번째 요소 입력 성공~!!!", vt.size());
				System.out.print("\n\t요소입력 계속(Y/N)? : ");
				con = br.readLine();
			}
			while (con.equalsIgnoreCase("Y"));
			System.out.println();
	}

	// 자료구조 전체 요소 출력 메소드
	public static void dispElement()
	{
		System.out.println("\t[벡터 전체 출력]\n");
		for (Object obj : vt)
			System.out.println("\t" + obj);
		System.out.println("\n\t벡터 전체 출력 완료~!!");
	}

	// 자료구조 내 요소 검색 메소드
	public static void findElement() throws IOException
	{
		Object k = "";
		System.out.println();
		System.out.print("\t검색할 요소 입력 : ");
		k = br.readLine();
		System.out.println("\t[검색 결과 출력]\n");
		if (vt.indexOf(k)>=0)
			System.out.println("\t검색 항목이 존재합니다.\n");
		else
			System.out.println("\t검색 항목이 존재하지 않습니다.\n");
	}

	// 자료구조 내 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		Object k = "";
		System.out.println();
		System.out.print("\t삭제할 항목 입력 : ");
		k = br.readLine();
		System.out.println("\t[삭제 결과 출력]\n");
		if (vt.indexOf(k)>=0)
		{
			vt.removeElementAt(vt.indexOf(k));
			System.out.printf("\n\t%s 항목이 성공적으로 삭제되었습니다.\n", k);
		}
		else 
			System.out.println("\t삭제할 항목이 존재하지 않아 삭제할 수 없습니다.\n");
	}

	// 자료구조 내 요소 변경 메소드
	public static void chaElement() throws IOException
	{
		Object k = "";
		Object s;
		System.out.println();
		System.out.print("\t변경할 항목 입력 : ");
		k = br.readLine();
		if (vt.indexOf(k)>=0)
		{
			System.out.println("\t[변경 결과 출력] : " + k);
			System.out.print("\t변경할 요소 입력 : ");
			s = br.readLine();
			vt.setElementAt(s, vt.indexOf(k));
			if (vt.indexOf(s)>=0)
				System.out.println("\t변경이 완료되었습니다.\n");
		}
		else 
		{
			System.out.println("\t[변경 결과 출력]\n");
			System.out.println("\t변경할 항목이 존재하지 않아 삭제할 수 없습니다.\n");		
		}
	}

	public static void exit()
	{
		System.out.println("\n\t프로그램 종료!!!\n");
		System.exit(-1);
	}
	

	// main() 메소드 → 완성;
	public static void main(String[] args)	throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);

	}
}