package templateMethod;

public class StringDisplay extends AbstractDisplay{
	
	private String str;
	private int width;
	
	public StringDisplay(String str) {
		this.str = str;
		this.width = str.getBytes().length;	
	}
	
	public void print() {
		System.out.println("|" + str + "|");
	}
	
	public void open() {
		printLine();
	}
	
	public void close() {
		printLine();
	}
	
	private void printLine() {
		System.out.print("+");
		for(int i= 0; i < this.width;++i) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
	

}
