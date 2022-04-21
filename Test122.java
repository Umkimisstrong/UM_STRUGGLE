/*=========================
  ����Ŭ���� ��ޡ���
=========================*/

// �������̽�(Interface)

/*
�ۡ�extends�� vs ��implements��

   Ŭ���� extends Ŭ����
   Ŭ���� extends �߻�Ŭ����

   �������̽� extends �������̽�
   �������̽� extends �������̽�, �������̽�

   �߻�Ŭ���� implements �������̽�
   �߻�Ŭ���� implements �������̽�, �������̽�

   Ŭ���� implements �������̽�
   Ŭ���� implements �������̽�, �������̽�

�� �������̽��� Ŭ�����ʹ� �޸� ���� ����� �����ϸ�,
   �������̽� ��ü�� ��ӵȴ�.

�� �������̽��� ��� ������ �����ʹ�
   �������������ڸ� ������� �ʾƵ� �⺻ ���(primitive constant)��
   static final�� �����ڷ� �����ȴ�.
   Ŭ�������� �������̽��� �߰��Ͽ� ����� ���
   �������̽� �ȿ��� ���ǵ� ��� �޼ҵ带 �������־�� �ϸ�
   �������̽��� �����ϴ� Ŭ������
   �������̽��� ���� �������̽��� �����ϴ� �߻� �޼ҵ带 ������
   ��� �޼ҵ带 �������� ���� ���
   �߻�(abstract) Ŭ�����μ����ؾ� �Ѵ�

�� ����
   - �������̽��� �޼ҵ带 ���� �ϰ� ���Ǵ� ����
	 �������̽��� implements �� ��� �ݵ�� ���� Ŭ������
	 �������̽��� ��� �޼ҵ带 �������̵�(Overriding)�ؾ� �Ѵ�.
   - �������̽��� �ڵ������� ������ ���� ó���Ѵ�.
	 ����� ���� : public static final
	 ���޼ҵ�    : public abstract
   - ���� ����� �޸� , �� ���еǸ�
	 �������� �������̽��� ��� �� �� �ִ�.
   - �������̽����� ����� ���� ��extends�� Ű���带 ���

�� �������̽��� ����
   - �������̽��� Ŭ���� ���� ������ ������ �������� ������ ��
     �޼ҵ带 ���� �ϰ� ���� �Ұ�
	 Ŭ���������� ���� ���� ���� �� �ִ�.
	 �������̽����� ������ ���ó�� ���� �ٲ� �� ����.
	 ���� �ÿ� �̸� ���� �Ҵ��� ���ƾ� ��.


�� �������̽��� ����
   �������̽��� Ŭ������ ���� ���ø��̱� ������,
   ��밡���� �������̽��� �Ǳ� ���ؼ���
   �ڹ� ���α׷����� �������̽��� ������ ��߉�.
   �̷��� ����� ��implements�� �������.

�� Ŭ������ ���ÿ� �ΰ� �̻��� �������̽��� implements �� �� �ִ�.	
 
*/

interface ADemo
{
	public void write();
}

interface BDemo
{
	public void print();
}

// �� �������̽�(ADemo, BDemo) �� ��ӹ��� �������̽�
interface CDemo extends ADemo, BDemo
{
	//public void write();
	//public void print();
	public void test();
	
}

// Ŭ����
// class DemoImpl

// �� �������̽�(A, BDemo)�� ��ӹ��� �������̽��� ������ �߻�Ŭ����(�������̵���)
//abstract class DemoImpl implements CDemo
//       ��	(�������̵� ��)
class DemoImpl implements CDemo		
{
	@Override
	public void test()
	{
		System.out.println("test()...");
	}
	
	@Override
	public void write()
	{
		System.out.println("write()...");
	}
	
	@Override
	public void print()
	{
		System.out.println("print()...");
	}
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test122
{
	public static void main(String[] args)
	{
		// �� �������̽��� ��� ���� �������̽��� ������ �߻� Ŭ���� �� ����
		// �ν��Ͻ� ����
		DemoImpl ob = new DemoImpl();

		ob.test();
		ob.write();
		ob.print();

	}
}

/*
test()...
write()...
print()...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/