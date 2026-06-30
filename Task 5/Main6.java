
interface HttpService {
    void handleHttpRequest();
}
interface DatabaseManager{
    void executeSqlStatement();
}
interface ContainerOps{
    void restartDockerContainer();
}
class WebController implements HttpService{
    public void handleHttpRequest(){
        System.out.println("Routing traffic to endpoint.");

    }
}
public class Main6{
    public static void main(String[] args) {
        HttpService web= new WebController();
        web.handleHttpRequest();
    }
}
