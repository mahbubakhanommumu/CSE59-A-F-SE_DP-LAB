class UniversityMember{
    void attendLecture(){
        System.out.println("Attending lecture.");
    }
}
interface Researcher{
    void conductLabResearch();
}
class Professor extends UniversityMember implements Researcher{
    public void conductLabResearch(){
        System.out.println("Professor doing research.");
    }
}
class UndergraduateStudent extends UniversityMember{

}
public class Main5{
    public static void main(String[] args){
        UniversityMember u = new UndergraduateStudent();
        u.attendLecture();

        Researcher r= new Professor();
        r.conductLabResearch();
    }
}
