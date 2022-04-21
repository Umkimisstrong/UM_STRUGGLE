/*	==============================
      ■■■ 배열 ■■■
==============================	*/

// 배열의 선언과 초기화
// 배열의 기본적 활용

// 『char』자료형의 배열을 만들어
// 그 배열의 각 방에 알파벳 대문자를 채우고
// 채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다.
// 단, 채우는 구문과 출력하는 구문은 따로 분리하여 처리한다.

// 실행 예)
// A B C D E ... Z
// 계속하려면 아무 키나 누르세요...
public class Test083
{
	public static void main(String[] args)
	{
		
	
	// 영문 알파벳 대문자 배열 구성




	// 배열 요소 전체 출력


	/*

	방법 ①
	char[] arr1;
	arr1 = new char[26];

	arr[0] = 'A'
	   :
	arr[25] = 'Z'
	*/

	
	//방법 ②
	char[] arr2 = {'A', 'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	//방법 ③
	char[] arr3 = new char[26];
	for (int i =0 ;i<arr3.length ;i++ )
	{
		arr3[i] = (char)(i+65); 
	}
	






	/*
	int[] arr;
	arr = new int[26];

	arr[0] = 65;
	arr[1] = 66;
	arr[2] = 67;
	arr[3] = 68;
	arr[4] = 69;
	arr[5] = 70;
	arr[6] = 71;
	arr[7] = 72;
	arr[8] = 73;
	arr[9] = 74;
	arr[10] = 75;
	arr[11] = 76;
	arr[12] = 77;
	arr[13] = 78;
	arr[14] = 79;
	arr[15] = 80;
	arr[16] = 81;
	arr[17] = 82;
	arr[18] = 83;
	arr[19] = 84;
	arr[20] = 85;
	arr[21] = 86;
	arr[22] = 87;
	arr[23] = 88;
	arr[24] = 89;
	arr[25] = 90;
	*/

	
	for (int i = 0;i<arr3.length ;i++ )
	{
		System.out.printf("%2c", arr3[i]);
	}
	System.out.println();

	}
}

// 실행 결과 

/*
 A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
계속하려면 아무 키나 누르십시오 . . .
*/