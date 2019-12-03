package 租赁影片;
import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	//定义name为字符串型
		private String _name;
		//Vector类可以实现可增长的对象数组
		private Vector _rentals = new Vector();
		
		public Customer (String name) {
			_name = name;
		};
		public void addRental (Rental arg) {
			_rentals.addElement(arg);
		}
		public String getName() {
			return _name;
		};

public String statement() {
	
	double totalAmount = 0;
	int frequentRenterPoints = 0;
	
	Enumeration rentals = _rentals.elements();
	String result = "Rentals Record for" + getName() + "\n";
	//获取元素
	while (rentals.hasMoreElements()) {
		
		double thisAmount = 0;
		Rental each = (Rental) rentals.nextElement();
		
		thisAmount = amountFor(each);
		
		
		//常客积分计算
		//add frequent renter points
		frequentRenterPoints ++;
		//add bonus for a two day new release rental
		if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && 
				each.getDaysRented() > 1) frequentRenterPoints ++;

		//show figures for this rental
		result += "\t" + each.getMovie().getTitle() + "\t" +
		String.valueOf(thisAmount) + "\n";
		totalAmount += thisAmount;
	}
	// add footer lines
	result += "Amount owed is :" + String.valueOf(totalAmount) + "\n";
	result += "You earned " + String.valueOf(frequentRenterPoints) + 
			" frequent renter points";
	return result;
    }
private double amountFor(Rental aRental) {
	       double result = 0;

		   switch (aRental.getMovie().getPriceCode()) {
				case Movie.REGULAR:
					result += 2;
					if(aRental.getDaysRented() > 2)
						result += (aRental.getDaysRented() - 2) * 1.5;
					break;
				case Movie.NEW_RELEASE:
					result += aRental.getDaysRented() * 3;
					break;
				case Movie.CHILDRENS:
					result += 1.5;
					if(aRental.getDaysRented() > 3)
						result += (aRental.getDaysRented() - 3) * 1.5;
					break;
	      }
			return result;
}
}