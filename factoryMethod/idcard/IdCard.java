package factoryMethod.idcard;

import factoryMethod.freamework.*;

public class IdCard extends Product{
	private String owner;
	IdCard(String owner){
		this.owner = owner;
		System.out.println(this.owner + "カード作成");
	}
	public void use() {
		System.out.println(this.owner + "カードを使う");
	}
	public String getOwner() {
		return this.owner;
	}
}
