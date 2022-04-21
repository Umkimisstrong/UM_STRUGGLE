/* ====================================
    ■■■ 예외(Exception) 처리 ■■■
=====================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test150
{
	private String[] data = new String[3];
	
	public void proc()	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n = 0;

		System.out.print("이름 입력[종료:Ctrl+z] : ");
		while ((str = br.readLine()) != null) 
		{
			data[n++] = str;
			System.out.print("이름 입력[종료:Ctrl+z] : ");
		}

		System.out.println("입력된 내용...");
		for (String s : data )
		{
			if (s!=null)
			{
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args)	throws IOException
	{
		Test150 ob = new Test150();

		ob.proc();
		/*
		이름 입력[종료:Ctrl+z] : aaa
		이름 입력[종료:Ctrl+z] : bbb
		이름 입력[종료:Ctrl+z] : ccc
		이름 입력[종료:Ctrl+z] : cccd
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		        at Test150.proc(Test150.java:22)
		        at Test150.main(Test150.java:39)
		계속하려면 아무 키나 누르십시오 . . .

		*/
	}
}