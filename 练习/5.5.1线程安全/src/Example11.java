
public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleThread saleThread = new SaleThread();    //����saleThread����
		//�����������ĸ��߳�
		new Thread(saleThread,"�߳�һ").start();
		new Thread(saleThread,"�̶߳�").start();
		new Thread(saleThread,"�߳���").start();
		new Thread(saleThread,"�߳���").start();
	}

}
