package 多线程模拟网约车;

public class TaxiProvider implements Runnable{

	private TaxiBase st;
	//private int num;
	public TaxiProvider (TaxiBase st){
		this.st=st;
	}
	public void run() {
		while(true) {
			st.come();
		}
	}
}
