/* ========================================================================
	    ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=========================================================================*/

// 벡터 자료구조 객체 선언 및 생성 시
// 사용자 정의 클래스 활용
// → 자료형


import java.util.Vector;

// 사용자 정의 클래스 설계 → 자료형 활용
class MyData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String name;	// 이름
	private int age;		// 나이

	//getXxx() → getter
	//setXxx() → setter

	// getter // setter 구성
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// 생성자(매개변수 2개인 생성자) → 사용자 정의 생성자
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// 사용자 정의 생성자가 구성될 경우
	// default 생서자가 자동으로 삽입되지 않기 때문에
	// default 생성자 형태의 생성자를 사용자 정의 생성자로
	// 추가 구성하게 되는것이 일반적인 클래스 설계 과정
	// (단, 반드시 설계해야 할 필요는 없음)

	// 생성자 (매개변수 없는 생성자) → 사용자 정의 생성자
	public MyData()
	{
		name = "";
		age = 0;
	}

}

public class Test164
{
	public static void main(String[] args)
	{
		// 벡터 자료구조 생성
		Vector<MyData> v = new Vector<MyData>(); 
	
		/*
		MyData st1 = new MyData();
		st1.setName("홍은혜");
		st1.setAge(13);
		v.add(st1);
		
		MyData st2 = new MyData();
		st2.setName("김정용");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("이윤태");
		st3.setAge(87);
		v.add(st3);
		*/

		/*
		MyData st1 = new MyData("홍은혜", 13);
		v.add(st1);
		MyData st2 = new MyData("김정용", 7);
		v.add(st2);
		MyData st3 = new MyData("이윤태" 87);
		v.add(st3);
		*/
		
		v.add(new MyData("홍은혜", 13));
		v.add(new MyData("김정용", 7));
		v.add(new MyData("이윤태", 87));


		// 벡터 자료구조 v에 담긴 내용(요소) 전체 출력하기
		// 실행 예)
		// 이름 : 홍은혜, 나이 : 13
		// 이름 : 김정용, 나이 : 7
		// 이름 : 이윤태, 나이 : 87

	
		// 방법 1
		for ( MyData obj : v )
			System.out.printf("이름 : %s, 나이 : %d\n", obj.getName(), obj.getAge());
		System.out.println();	

		/*
		이름 : 홍은혜, 나이 : 13
		이름 : 김정용, 나이 : 7
		이름 : 이윤태, 나이 : 87
		*/
		
		// 방법 2
		for (int i = 0 ; i <v.size() ; i++ )
			System.out.printf("이름 : %s. 나이 : %d세\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
		System.out.println();
		/*
		이름 : 홍은혜. 나이 : 13세
		이름 : 김정용. 나이 : 7세
		이름 : 이윤태. 나이 : 87세
		계속하려면 아무 키나 누르십시오 . .
		*/

		// 방법3
		for (Object temp : v)
		{
			System.out.printf("이름 : %s, 나이 : %d세\n", ((MyData)temp).getName(), ((MyData)temp).getAge()); // (MyData)temp -> 다운캐스팅
		}


	}
}