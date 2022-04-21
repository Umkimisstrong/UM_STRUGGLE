/* ====================================
    ■■■ 예외(Exception) 처리 ■■■
=====================================*/
// Test153.java 파일과 비교


class Demo
{
	private int value;

	public void setValue(int value)
	{
		if (value <= 0)
		{
			return;		// 메소드 종료의 return
		}
		this.value = value;
	}


	public int getValue()
	{
		return value;
	}

}



public class Test152
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}