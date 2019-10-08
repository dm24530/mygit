package factory;
import tv.*;
import factory.*;
public class HaierTVFactory implements TVFactory{
	public TV produceTV(){
		return new HaierTV();
	}
}