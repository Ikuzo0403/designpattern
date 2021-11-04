package design.prototype.message;

import design.prototype.framework.Product;

public class UnderLine implements Product{
    private char ulchar;
    public UnderLine(char ulchar){
        this.ulchar = ulchar;
    }
    public void use(String s){
        int length = s.getBytes().length;
        System.out.println("\"" +  s  + "\"");
        for(int i=0; i < length + 4; ++i){
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    public Product createClone(){
        Product p = null;
        try{
            p = (Product)clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}