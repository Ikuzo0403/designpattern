package factoryMethod; 
import factoryMethod.freamework.*; 
import factoryMethod.idcard.*;

public class Main {
	public static void main(String args[]) {
		Factory factory = new IdCardFactory();
		Product card1 = factory.create("TEST‚³‚ñ");
		card1.use();
	}
}
