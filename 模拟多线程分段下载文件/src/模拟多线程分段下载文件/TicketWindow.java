package 模拟多线程分段下载文件;

public class TicketWindow implements Runnable{

	 int tickets = 100;
		public void run(){
			while(true) {
			if(tickets > 0) {
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name + "正在接送第" + tickets + "位乘客");
				tickets--;
			}
			else
				break;
		}
		}
}
