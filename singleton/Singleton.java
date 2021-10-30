package singleton;

public class Singleton {
	
	//　Singletonが呼ばれた地点でインスタンス化される
	private static Singleton singleton =new Singleton();
	
	private Singleton() {
		System.out.println("Singletonが呼ばれた地点でインスタンス化される");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
