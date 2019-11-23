import car.*;
import carFactory.*;
import utility.*;
import 多线程模拟网约车.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxiBase st=new TaxiBase();
		TaxiProvider input=new TaxiProvider(st);
		TaxiRenter output=new TaxiRenter(st);
		new Thread(input).start();
		new Thread(output).start();
		
		

	}
	
}
