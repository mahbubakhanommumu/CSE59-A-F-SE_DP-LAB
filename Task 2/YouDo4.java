class Sensor {
    String name = "Temperature Sensor";
    int batteryLevel = 50;
    
    void charge() {
        batteryLevel =100;
        System.out.println("Sensor fully charged");
    }
}

public class Main {
    public static void main(String[] args){
        Sensor s = new Sensor();
        
        s.charge();
        System.out.println("Battery Level: " + s.batteryLevel);
    }
}
