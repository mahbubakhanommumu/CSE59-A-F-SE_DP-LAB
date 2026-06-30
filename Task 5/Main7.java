
interface Network{
    void send(String msg);
}

class Bluetooth implements Network {
    public void send(String msg) {
        System.out.println("Bluetooth: " + msg);
    }
}class WiFi implements Network{
    public void send(String msg){
        System.out.println("WiFi: "+ msg);
    }
}
class AlertSystem{
    Network net;

    AlertSystem(Network net){
        this.net=net;
    }
    void alert(String msg){
        net.send(msg);
    }
}
public class Main7{
    public static void main(String[] args){
        AlertSystem a1= new AlertSystem(new Bluetooth());
        a1.alert("Earthquake!");

        AlertSystem a2= new AlertSystem(new WiFi());
        a2.alert("Flood!");
    }
}
