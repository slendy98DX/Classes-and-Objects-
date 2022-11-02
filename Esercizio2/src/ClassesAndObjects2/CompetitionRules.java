package ClassesAndObjects2;

public class CompetitionRules {
    private CompetitionRules(){}

    public static CompetitionRules getInstance(){
        return competitionRules;
    }
    private static CompetitionRules competitionRules = new CompetitionRules();
    private String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";
    public void printRules(){
        System.out.println("RULES OF THE COMPETITION: \n" + "1) " + competitionRule1 + "\n" + "2) " + competitionRule2 + "\n" + "3) " + competitionRule3);
    }
}
