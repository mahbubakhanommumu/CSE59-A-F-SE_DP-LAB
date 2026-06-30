interface SmartDevice{
    void print();
    void scan();
    void fax();
}
class BasicPrinter0 implements SmartDevice{
    public void print(){
        System.out.println("Printing...");
    }
    public void scan() {
        
    }
    public void fax(){
        
    }
}

interface Printable {
    void print();
}
interface Scannable {
    void scan();
}
interface Faxable{
    void fax();
}
class BasicPrinter implements Printable{
    public void print(){
        System.out.println("Printing...");
    }
}
class AdvancedPrinter implements Printable, Scannable, Faxable {
    public void print(){
                System.out.println("Printing...");

        
    }
    public void scan(){
        System.out.println("Scanning...");
    }
    public void fax(){
        System.out.println("Sending fax...");
    }
}
public class Main{
    public static void main(String[] args){
        BasicPrinter basic = new BasicPrinter();
        basic.print();
        
        AdvancedPrinter advanced = new AdvancedPrinter();
        advanced.print();
        advanced.scan();
        advanced.fax();
    }
}
