public class TestProgrammers {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();

        programmer1.name = "Marco";
        programmer1.age = 24;
        programmer1.wearsGlasses = true;
        programmer1.drinkCoffee();
        programmer1.printDetails();

        programmer2.name = "Emanuele";
        programmer2.age = 22;
        programmer2.wearsGlasses = true;
        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}
