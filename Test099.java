/* ===================
   ■■■ 배열 ■■■
====================*/

//배열의 복사

// Test098.java 파일과 비교~!

// ※ 배열 변수의 복사에는 데이터 복사, 주소값 복사, 두 가지 형태가 존재한다.
//	  주소값 복사 → 얕은 복사 → 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법.
//								  (배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사 방법.)

		// 복사는 어디든 해당됌(배열뿐안 아니라 참조하는 모든 것에대한. 클래스든 메소드든)
		// 잘 알아야 한다.
//	  데이터 복사 → 깊은 복사 → 실제 요소로 들어있는 값에 대한 복사로
//								  원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법.

// 데이터 복사
// - int 형 배열에 대한 깊은 의미의 복사를 처리하는
//	 메소드를 정의하는 형태로 실습

public class Test099
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};		// - 배열의 원본
		
		int[] copys1 = nums;					// - 얕은 의미의 배열 복사
												//   (주솟값 복사)

		int[] copys2 = copyArray(nums);			// - 깊은 의미의 배열 복사 수행
												//   (사용자 정의 메소드 호출)
		


		// 복사해주는 메소드
		// 객체 형식으로 반환
		int[] copys3 =	(int[])nums.clone();	// - 깊은 의미의 배열 복사 수행	
												//   (자바 제공 → clone() 메소드 )


		// 원본 배열 요소의 수정 발생~!!
		nums[1] = 2;   // 20 → 2로 수정


		// 결과 확인
		for (int i = 0;i < nums.length ;i++ )
		{
			System.out.printf("%4d", nums[i]);
		}
		System.out.println();

		for (int i =0;i < copys1.length ; i++)
		{
			System.out.printf("%4d", copys1[i]);
		}
		System.out.println();

		for (int i =0; i < copys2.length ;i++ )
		{
			System.out.printf("%4d", copys2[i]);
		}
		System.out.println();

		for (int i =0;i < copys3.length;i++ )
		{
			System.out.printf("%4d", copys3[i]);
		}
		System.out.println();
	





	}

	// 매개변수로 int 배열 타입을 넘겨받아
	// 이를 복사한 후
	// 복사한 배열을 반환하는
	// 기능을 가진 메소드 정의
	public static int[] copyArray(int[] os)		// 배열의 형태를 매개하여 배열의 형태로 반환되는 메소드
	{
		// 매개변수로 넘겨받은 배열(os)
		// 즉, 원본 배열 만큼의 배열방(메모리공간)을 확보한
		// 복사할 배열방 생성
		int [] temp = new int [os.length];

		// 각각의 원본 배열(os) 에 담겨있는 요소들을 복사배열 (temp) 에 담아내기
		for (int i = 0;i < os.length ;i++ )
		{
			temp[i] = os[i];
		}

		// 복사한 배열(temp) 반환
		return temp;

	}



}