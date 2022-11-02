package ClassesAndObjects2;

public class Team {
    String teamName;
    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();
    public void printTeamDetails(){
        System.out.println("Team name: " + teamName);
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();
    }
}
