 class User {
    
    private String username;
    private String email;
    
    public User(String username, String email)
    {
        this.username = username;
        this.email= email;
        
    }
    
    public String getUsername()
    {
        return username;
    }
    public String getEmail()
    {
        return email;
    }
}

class EmailValidator{
    public static boolean isValid(String email)
    {
        if(email !=null && email.contains("@"))
        {
            return true;
        }
        System.out.println("Invalid email format.");
        return false;
    }
}

 class UserRepository {
    public static void save(User user)
    {
        System.out.println("Connecting to database...");
        System.out.println("Saving user " + user.getUsername() + " to the user table.");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        User user = new User("Mumu_m", "mumu@example.com");
        
        if(EmailValidator.isValid(user.getEmail()))
        {
            UserRepository.save(user);
        }
    }
}
