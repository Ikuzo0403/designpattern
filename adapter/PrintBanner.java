package adapter;

public class PrintBanner extends Banner implements Print{
	
	public PrintBanner(String str){
		super(str);
	}

	//　各メソッドはインターフェイスに定義している。
	
	// 継承元のメソッドを呼ぶ
	public void printWeek() {
		showWithParen();
	}
	
	// 継承元のメソッドを呼ぶ	
	public void printStrong() {
		showWithAster();
	}
}
