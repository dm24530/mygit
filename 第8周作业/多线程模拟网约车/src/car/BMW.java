package car;

public class BMW implements Car{
	final double money=10.0d;
	public double getRatio() {
		System.out.println(money);
		return 0;
	}
	public String toString() {
		System.out.println("BMW");
		return "BMW";
	}
}
