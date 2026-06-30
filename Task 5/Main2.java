
interface MessageSender{
    void send(String message);
}
class EmailSender implements MessageSender {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
class SMSSender implements MessageSender{
    public void send(String message){
        System.out.println("SMS: "+message);
    }
}
class NotificationService{
    private MessageSender sender;
    
    public NotificationService(MessageSender sender){
        this.sender = sender;
    }
    public void notifyuser(String message){
        sender.send(message);
    }
}
public class Main{
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        NotificationService service1 = new NotificationService(email);
        service1.notifyuser("Welcome!");
        
        MessageSender sms = new SMSSender();
        NotificationService service2 = new NotificationService(sms);
        service2.notifyuser("Hello!");
    }
}
