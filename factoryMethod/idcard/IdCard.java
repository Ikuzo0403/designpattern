package factoryMethod.idcard;

import factoryMethod.freamework.*;

public class IdCard extends Product{
	private String owner;
	IdCard(String owner){
		this.owner = owner;
		System.out.println(this.owner + "�J�[�h�쐬");
	}
	public void use() {
		System.out.println(this.owner + "�J�[�h���g��");
	}
	public String getOwner() {
		return this.owner;
	}
}
