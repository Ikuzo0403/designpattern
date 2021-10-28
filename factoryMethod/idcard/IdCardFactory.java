package factoryMethod.idcard;
import factoryMethod.freamework.*;
import java.util.*;

public class IdCardFactory extends Factory{
	private List owners = new ArrayList();
	
	protected Product createProduct(String owner) {
		return new IdCard(owner);
	}
	
	protected void registerProduct(Product product) {
		this.owners.add(((IdCard)product).getOwner());
	}
	
	public List getOwners() {
		return this.owners;
	}
	
	
}
