/* ========================================================================
	    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=========================================================================*/

// Set �� HashSet, TreeSet
// - ���� ����.
// - �ߺ��� ������� �ʴ� ����(�⺻)

/*
�� TreeSet<E> Ŭ����
   
   java.util.TreeSet<E>Ŭ������
   Set �������̽��� ����� SortedSet�������̽��� ������ Ŭ������
   �����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ �ȴ�.
*/

// VO	�� Value Object(�����͸� �ݳ��ϰ����ϴ°��)
// DTO	�� Data Transfer Object
// DAO	�� Data Access Object

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;

class GradeVO
{
	private String hak;
	private String name;
	private int kor, eng, mat;

	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak=hak;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	

	// ������(����� ����, �Ű� ����)
	// �Ű��� �����ϴ� �����ڸ� ����� ���Ƿ� �����߱� ������
	// default �����ڰ� �ڵ����� ���Ե��� ���� ���� ���
	// �߰��� ������ ������
	GradeVO()
	{
	}

	// getter / setter ����
	public String getHak()
	{
		return hak;
	}

	public void setHak(String hak)
	{
		this.hak = hak;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getKor()
	{
		return kor;
	}

	public void setKor(int kor)
	{
		this.kor = kor;
	}

	public int getEng()
	{
		return eng;
	}

	public void setEng(int eng)
	{
		this.eng = eng;
	}

	public int getMat()
	{
		return mat;
	}

	public void setMat(int mat)
	{
		this.mat = mat;
	}

	// �߰� �޼ҵ� ���� (���� ����)
	public int getTot()
	{
		return kor + eng + mat;
	}
}

class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2)	throws NumberFormatException
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// �й����� ��������
		// return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		// return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		// return 2201123 - 2201124;
		// return -1

		// �й����� ��������
		// return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());

		// �������� ��������
		// return s1.getTot() - s2.getTot();

		// �������� ��������
		// return s2.getTot() - s1.getTot();

		// �̸����� ��������
		//return s1.getName().compareTo(s2.getName());
		
		// �̸����� ��������
		return s2.getName().compareTo(s1.getName());
	}
}



public class Test171	
{
	public static void main(String[] args)	
	{
		TreeSet<String> set = new TreeSet<String>();
		
		// TreeSet �ڷᱸ�� set �� ��� �߰� �� add();
		set.add("������ũ");
		set.add("�Ͽ��ǿ����̴¼�");
		set.add("����ť");
		set.add("���̽��丮");
		set.add("�˶��");
		set.add("����");
		set.add("�ɽ�");
		set.add("�����̴���");
		set.add("��庥��Ÿ��");
		set.add("¯���¸�����");
		set.add("���ϸ���");
		set.add("���ǽ�");

		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println("\n");

		// �����̴��� ������ũ �ɽ� �˶�� ��庥��Ÿ�� ���ǽ� ¯���¸����� ���� ���̽��丮 ���ϸ��� �Ͽ��ǿ����̴¼� ����ť

		for (String s : set)
			System.out.print(s + " ");
		System.out.println();
		// �����̴��� ������ũ �ɽ� �˶�� ��庥��Ÿ�� ���ǽ� ¯���¸����� ���� ���̽��丮 ���ϸ��� �Ͽ��ǿ����̴¼� ����ť

		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
	
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());


		set2.add(new GradeVO("2201123", "��μ�", 90, 80, 70));
		set2.add(new GradeVO("2201124", "������", 91, 81, 71));
		set2.add(new GradeVO("2201125", "������", 98, 79, 77));
		set2.add(new GradeVO("2201141", "������", 96, 86, 76));
		set2.add(new GradeVO("2201135", "����", 99, 82, 72));
		
		/*
		Iterator<GradeVO> it2 = set2.iterator();

		while (it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		*/
		// Exception in thread "main" java.lang.ClassCastException:
		// GradeVO cannot be cast to java.lang.Comparable
		// ��Ÿ�� ���� �߻�!
		
		// Compare Ŭ���� ���� ����
		// GradeVO@15db9742 GradeVO@6d06d69c GradeVO@7852e922 GradeVO@4e25154f GradeVO@70dea4e
		
		Iterator<GradeVO> it2 = set2.iterator();

		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %4d\n", vo.getHak(), vo.getName()
				                                         , vo.getKor(), vo.getEng(), vo.getMat(), vo.getTot());
		}
		System.out.println();

		// �й����� ��������
		/*
		2201123     ��μ�   90   80   70  240
		2201124     ������   91   81   71  243
		2201125     ������   98   79   77  254
		2201135     ����   99   82   72  253
		2201141     ������   96   86   76  258
		*/
		

		// �й����� ��������
		/*
		2201141     ������   96   86   76  258
		2201135     ����   99   82   72  253
		2201125     ������   98   79   77  254
		2201124     ������   91   81   71  243
		2201123     ��μ�   90   80   70  240
		*/
		

		// �������� ��������  
		/*
		2201123     ��μ�   90   80   70  240
		2201124     ������   91   81   71  243
		2201135     ����   99   82   72  253
		2201125     ������   98   79   77  254
		2201141     ������   96   86   76  258	
		*/


		// �������� ��������
		/* 
		2201141     ������   96   86   76  258
		2201125     ������   98   79   77  254
		2201135     ����   99   82   72  253
		2201124     ������   91   81   71  243
		2201123     ��μ�   90   80   70  240
		*/

		// �̸����� ��������
		/*
		2201123     ��μ�   90   80   70  240
		2201135     ����   99   82   72  253
		2201124     ������   91   81   71  243
		2201125     ������   98   79   77  254
		2201141     ������   96   86   76  258
		*/

		// �̸����� ��������
		/*
		2201141     ������   96   86   76  258
		2201125     ������   98   79   77  254
		2201124     ������   91   81   71  243
		2201135     ����   99   82   72  253
		2201123     ��μ�   90   80   70  240
		*/
	}
}