package design.prototype;
import design.prototype.framework.Manager;
import design.prototype.framework.Product;
import design.prototype.message.MessageBox;
import design.prototype.message.UnderLine;

public class Main {

    public static void main (String[] args){

        Manager manager = new Manager();
        UnderLine underLine = new UnderLine('～');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');
        manager.register("strong message", underLine);
        manager.register("warning box", messageBox1);
        manager.register("slash box", messageBox2);
        Product p1 = manager.create("strong message");
        p1.use("hello, world");

    }
}
