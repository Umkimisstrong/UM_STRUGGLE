/*=========================
  ����Ŭ���� ��ޡ���
=========================*/

// �������̽�(Interface)

// �������̽�
interface Demo
{
	public void write();
	public void print();
}


// �������̽��� �����ϴ� �߻� Ŭ����(write �� ������)
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������...");
	}
}

// �����ϴ� Ŭ������ ��ӹ޴� Ŭ����
class DemoImplSub extends DemoImpl
{
	/*
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������...");
	}
	*/
	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������...");		
	}
}





public class Test121
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo(); // �Ұ� �������̽�

		//DemoImpl ob2 = new DemoImpl();	// �߻�Ŭ����
		// �ν��Ͻ� ���� �Ұ�

		DemoImplSub ob3 = new DemoImplSub();
		ob3.write();
		ob3.print();
	}
}

/*
write() �޼ҵ� ������...
print() �޼ҵ� ������...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/