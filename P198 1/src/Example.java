
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindow tw1 = new TicketWindow();
		TicketWindow tw2 = new TicketWindow();
		new Thread(tw1,"�߳�1").start();
		new Thread(tw2,"�߳�2").start();
	}

}

