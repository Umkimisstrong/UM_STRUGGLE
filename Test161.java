/* ========================================================================
	    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=========================================================================*/

// Vector v = new Vector();
// - ����ִ� Vector �ڷᱸ�� v ����

// Vector v = new Vector(8);
// - 8���� �ʱ� elements�� ���� Vector �ڷᱸ�� v ����
//   8���� ��� ä������ �Ǹ� �ڵ����� Ȯ��ȴ�.

// Vector v = new Vector(3, 5);
//  - 3���� �ʱ� elements �� ���� Vector �ڷᱸ�� v ����
//    3���� ��� ä������ �Ǹ� �ڵ����� 5�� ����(Ȯ��)�ȴ�.

//  �� ���ʹ� ������ ��ҷμ� ������, �Ǽ���, ���ڿ�.... ����
//     ��Ƴ��� ���� �����ϴ�. (�� ����������.)
//     �� ������ ������  Ȯ�� check~~!!!!



import java.util.Vector;
import java.util.Iterator;

// MyVector Ŭ���� ���� �� Vector Ŭ���� ���
class MyVector extends Vector<Object>
{
	// ������
	// ����Ŭ����(Vector) ������ ȣ��
	MyVector()
	{
		super(1, 1);
		// ù ��° ���� : �־��� �뷮
		// �� ��° ���� : ������
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void addObject(Record rec)
	{
		addElement(rec);
	}

	void write()
	{
		/*
		Iterator<Object> it = this.iterator();
		while (it.hasNext())
		{
		
			System.out.println(it.next());
		}
		*/
		/*
		5
		3.14
		�ȳ��ϼ���
		[C@15db9742
		*/
		/*
		Object o;
		int length = size();

		System.out.println("���� ��� ���� : " + length);
		
		for (int i = 0; i<length ; i++ )
		{
			o = elementAt(i);
			System.out.println(o);
		}
		*/
		/*
		���� ��� ���� : 4
		5
		3.14
		�ȳ��ϼ���
		[C@15db9742
		*/

		Object o;
		int length = size();

		System.out.println("���� ��� ���� : " + length);
		
		for (int i = 0; i<length ; i++ )
		{
			o = elementAt(i);
			
			// ** ��instanceof�� ������ ** 
			// -- ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ��
			if (o instanceof char[])
			{
				//System.out.println("���ڹ迭 : " + o);
				//System.out.println("���ڹ迭 : " + o.toString());
				System.out.println("���ڹ迭 : " + String.copyValueOf((char[])o));	// ���ڹ迭�� ����ȯ
			}
			else if (o instanceof String)
			{
				System.out.println("���ڿ� : " + o.toString());
			}
			else if (o instanceof Integer)
			{
				System.out.println("������ : "+ o);
			}
			else if (o instanceof Float)
			{
				System.out.println("�Ǽ��� : " + o);
			}
			else
				System.out.println("Ÿ�� Ȯ�� �Ұ�~!!");

			System.out.println(o);
		}
	}
}

public class Test161
{
	public static void main(String[] args)
	{
		// Myvector Ŭ���� ��� �ν��Ͻ� ����
		MyVector mv = new MyVector();


		int digit = 5;
		float real = 3.14f;
		String s = new String("�ȳ��ϼ���");
		char [] letters = {'s', 't', 'u', 'd', 'y'};
		
		mv.addInt(digit);			// ���� �ڷᱸ���� ���� ����
		mv.addFloat(real);			// ���� �ڷᱸ���� �Ǽ� ����
		mv.addString(s);			// ���� �ڷᱸ���� ���ڿ� ����
		mv.addCharArray(letters);	// ���� �ڷᱸ���� ���� �迭 ����
		
		mv.write();
		/*
		���� ��� ���� : 4
		������ : 5
		�Ǽ��� : 3.14	
		���ڿ� : �ȳ��ϼ���
		���ڹ迭 : study
		*/

	}
}