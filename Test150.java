/* ====================================
    ���� ����(Exception) ó�� ����
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

		System.out.print("�̸� �Է�[����:Ctrl+z] : ");
		while ((str = br.readLine()) != null) 
		{
			data[n++] = str;
			System.out.print("�̸� �Է�[����:Ctrl+z] : ");
		}

		System.out.println("�Էµ� ����...");
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
		�̸� �Է�[����:Ctrl+z] : aaa
		�̸� �Է�[����:Ctrl+z] : bbb
		�̸� �Է�[����:Ctrl+z] : ccc
		�̸� �Է�[����:Ctrl+z] : cccd
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		        at Test150.proc(Test150.java:22)
		        at Test150.main(Test150.java:39)
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

		*/
	}
}