package adapter;

public class Banner {
	private String string;
	public Banner(String target) {
		this.string = target;	
	}
	public void showWithParen() {
		System.out.println("‹­‚¢" + this.string);
	}
	public void showWithAster() {
		System.out.println("****" + this.string);
	}

}
