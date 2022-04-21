/* ========================================================================
	    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=========================================================================*/

// Test165 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)

    [�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 1
			
	1��° ��� �Է� : ������
	1��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? : y

	2��° ��� �Է� : ���̻�
	2��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? : N

    [�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
	    ������
		���̻�
	���� ��ü ��� �Ϸ�~!!!

    [�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : ���̻�

	[�˻� ��� ���]
	�׸��� �����մϴ�.

    [�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : �Ӽҹ�

	[�˻� ��� ���]
	�׸��� �������� �ʽ��ϴ�.

    [�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ȫ����

	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.

    [�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ������

	[���� ��� ���]
	������ �׸��� �����Ǿ����ϴ�.

    [�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ��μ�

	[���� ��� ���]
	������ ����� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ���̻�

	[���� ��� ���] : ���̻�
	������ ���� �Է� : ������

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		������
	���� ��ü ��� �Ϸ�~!!!

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 6

	���α׷� ����
	����Ϸ��� �ƹ� Ű��...

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
	private static final Vector<Object> vt; // �ڷ� ����
	private static BufferedReader br;		// �Է� ��
	private static Integer sel;				// ���� ��
	private static String con;				// Y / N

	// static �ʱ�ȭ ��
	static
	{
		vt = new Vector<Object>();

		// BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ.
		sel = 1;
		con = "Y";
	}


	// �޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		System.out.println("==================================");
		System.out.printf("\t[�޴�����]\n \t1. ��� �߰�\n \t2. ��� ���\n \t3. ��� �˻�\n \t4. ��� ����\n \t5. ��� ����\n \t6. ����\n");
		System.out.println("==================================");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException, NumberFormatException
	{
		System.out.print("\t>> �޴� ����(1~6) : ");
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
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
			System.out.println("\n\t�ȹٷδ�������!");
	}

	// �ڷᱸ���� ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
			Object k = "";
			do
			{
				System.out.println();
				System.out.printf("\t%d��° ��� �Է� : ", (vt.size()+1));
				k = br.readLine();
				vt.add(k);
				System.out.printf("\n\t%d��° ��� �Է� ����~!!!", vt.size());
				System.out.print("\n\t����Է� ���(Y/N)? : ");
				con = br.readLine();
			}
			while (con.equalsIgnoreCase("Y"));
			System.out.println();
	}

	// �ڷᱸ�� ��ü ��� ��� �޼ҵ�
	public static void dispElement()
	{
		System.out.println("\t[���� ��ü ���]\n");
		for (Object obj : vt)
			System.out.println("\t" + obj);
		System.out.println("\n\t���� ��ü ��� �Ϸ�~!!");
	}

	// �ڷᱸ�� �� ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		Object k = "";
		System.out.println();
		System.out.print("\t�˻��� ��� �Է� : ");
		k = br.readLine();
		System.out.println("\t[�˻� ��� ���]\n");
		if (vt.indexOf(k)>=0)
			System.out.println("\t�˻� �׸��� �����մϴ�.\n");
		else
			System.out.println("\t�˻� �׸��� �������� �ʽ��ϴ�.\n");
	}

	// �ڷᱸ�� �� ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		Object k = "";
		System.out.println();
		System.out.print("\t������ �׸� �Է� : ");
		k = br.readLine();
		System.out.println("\t[���� ��� ���]\n");
		if (vt.indexOf(k)>=0)
		{
			vt.removeElementAt(vt.indexOf(k));
			System.out.printf("\n\t%s �׸��� ���������� �����Ǿ����ϴ�.\n", k);
		}
		else 
			System.out.println("\t������ �׸��� �������� �ʾ� ������ �� �����ϴ�.\n");
	}

	// �ڷᱸ�� �� ��� ���� �޼ҵ�
	public static void chaElement() throws IOException
	{
		Object k = "";
		Object s;
		System.out.println();
		System.out.print("\t������ �׸� �Է� : ");
		k = br.readLine();
		if (vt.indexOf(k)>=0)
		{
			System.out.println("\t[���� ��� ���] : " + k);
			System.out.print("\t������ ��� �Է� : ");
			s = br.readLine();
			vt.setElementAt(s, vt.indexOf(k));
			if (vt.indexOf(s)>=0)
				System.out.println("\t������ �Ϸ�Ǿ����ϴ�.\n");
		}
		else 
		{
			System.out.println("\t[���� ��� ���]\n");
			System.out.println("\t������ �׸��� �������� �ʾ� ������ �� �����ϴ�.\n");		
		}
	}

	public static void exit()
	{
		System.out.println("\n\t���α׷� ����!!!\n");
		System.exit(-1);
	}
	

	// main() �޼ҵ� �� �ϼ�;
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