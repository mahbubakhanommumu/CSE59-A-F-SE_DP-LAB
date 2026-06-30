
class Patient {
    String name;
    String nationalId;

    public Patient(String name, String nationalId) {
        this.name = name;
        this.nationalId = nationalId;
    }
}

class IdValidator {
    public boolean validate(String id) {
        return id.length() == 10 || id.length() == 17;
    }
}
class SmsService{
    public void sendSms(Patient patient){
        IdValidator validator = new IdValidator();
        If (validator.validate(patient.nationalId)){
            System.out.println("Sending SMS to: "+ patient.name+ " Registration Successful.");
            
        }
        else{
            System.out.println("Invalid National ID.");
        }
    }
}

public class Main{
    public static void main(String[] args){
        Patient patient = new Patient("Mumu","129034");
        
        SmsService sms= new SmsService();
        sms.sendSms(patient);
    }
}
