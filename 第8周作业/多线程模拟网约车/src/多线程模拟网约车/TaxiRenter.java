package 多线程模拟网约车;

public class TaxiRenter implements Runnable{
	private TaxiBase st;
	public TaxiRenter(TaxiBase st){
		this.st=st;
	}
	public void run() {
		while(true) {
			st.go();
		}
	}
}
