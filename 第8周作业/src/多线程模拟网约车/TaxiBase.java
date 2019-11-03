package ���߳�ģ����Լ��;
import carFactory.*;
import utility.XMLUtility;
import car.*;

public class TaxiBase {
	private Car[] car = new Car[10];
	//private Car[] cells=new Car [10];
	private int inPos,outPos;
	private int count=0;
	
	public TaxiBase() {
		CarFactory carFactory = (CarFactory) XMLUtility.getBean();
		for(int i=0; i<10; i++) {
			car[i] = carFactory.produceCar();
		}
	}
	public synchronized void come() {
		try {
			while(count ==car.length) {
				this.wait();
			}
			System.out.println("����"+inPos+","+car[inPos].toString()+"���");
			inPos++;
			
			if(inPos == car.length)
				inPos = 0;
			
			count++;
			Thread.sleep(1000);
			this.notify();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//public void put() {
		//System.out.println("����"+inPos+","+car[inPos].toString()+"���");
	//}
	
	public void go() {
		try {
			while (count==0) {
				this.wait();
			}
			System.out.println("����"+outPos+","+car[outPos].toString()+"���,�Ʒѷ���"+car[outPos].getRatio());
			if(outPos==car.length)
				outPos=0;
			count--;
			Thread.sleep(1000);
			this.notify();
		}catch(Exception e) {
			e.printStackTrace();
		}
	//	System.out.println("����"+outPos+","+car[outPos].toString()+"���⡣�Ʒѷ���"+car[outPos].getRatio());
	}
}
