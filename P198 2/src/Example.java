
public class Example{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindow tw = new TicketWindow();
		
		new Thread(tw,"��ʦ1").start();
		new Thread(tw,"��ʦ2").start();
		new Thread(tw,"��ʦ3").start();
	}

}
