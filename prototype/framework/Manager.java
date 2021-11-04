package design.prototype.framework;

import java.util.HashMap;

public class Manager {
    private HashMap<String,Product> showCase = new HashMap<String,Product>();
    
    public void register(String name,Product proto){
        showCase.put(name,proto);
    }
    public Product create(String protoName){
        Product p = showCase.get(protoName);
        return p.createClone();
    }
}
