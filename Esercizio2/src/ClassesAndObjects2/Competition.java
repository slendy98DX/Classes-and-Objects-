package ClassesAndObjects2;

public class Competition {
    public static void main(String[] args) {

        CompetitionRules competitionRules = CompetitionRules.getInstance();
        competitionRules.printRules();

        System.out.println("----------------------------------------------------------");

        Team teamA = new Team();
        Team teamB = new Team();

        System.out.println("FIRST TEAM: ");

        teamA.teamName = "Milan";

        teamA.p1.name = "Marco";
        teamA.p1.programmingLanguage = "JS";
        teamA.p1.yearsOfExperience = 0;

        teamA.p2.name = "Emanuele";
        teamA.p2.programmingLanguage = "Java";
        teamA.p2.yearsOfExperience = 4;

        teamA.printTeamDetails();

        System.out.println("----------------------------------------------------------");

        System.out.println("SECOND TEAM: ");

        teamB.teamName = "Inter";

        teamB.p1.name = "Pasquale";
        teamB.p1.programmingLanguage = "HTML";
        teamB.p1.yearsOfExperience = 5;

        teamB.p2.name = "Giovanni";
        teamB.p2.programmingLanguage = "Kotlin";
        teamB.p2.yearsOfExperience = 3;

        teamB.printTeamDetails();

    }
}
