package templateMethod;

public class CharDisplay extends AbstractDisplay{
	
	private char c;
	
	public CharDisplay(char c) {
		this.c = c;
	}
	
	public void print() {
		System.out.print("’†g");
	}
	
	public void open() {
		System.out.print("<<<<<");
	}
	
	public void close() {
		System.out.print(">>>>>");
	}
	
}
