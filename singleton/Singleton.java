package singleton;

public class Singleton {
	
	//�@Singleton���Ă΂ꂽ�n�_�ŃC���X�^���X�������
	private static Singleton singleton =new Singleton();
	
	private Singleton() {
		System.out.println("Singleton���Ă΂ꂽ�n�_�ŃC���X�^���X�������");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
