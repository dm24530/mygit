package ����ӰƬ;

public class Main {
	public static void main(String[] args) {
		
		Customer customer = new Customer("��һ");
		
		Rental rental1 = new Rental(new Movie("�λش���",1),10);
		Rental rental2 = new Rental(new Movie("��������",2),5);
	    customer.addRental(rental1);
		customer.addRental(rental2);
		System.out.println(customer.statement());
	}
}