
public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket1 ticket = new Ticket1();
		//�����������ĸ��߳�
		new Thread(ticket,"�߳�һ").start();
		new Thread(ticket,"�̶߳�").start();
		new Thread(ticket,"�߳���").start();
		new Thread(ticket,"�߳���").start();
	}

}
