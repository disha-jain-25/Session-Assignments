//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Disha", 75000, "HR");
        Developer d = new Developer("Anil", 85000, "Java");

        System.out.println("Manager Details:");
        m.displayInfo();

        System.out.println("\nDeveloper Details:");
        d.displayInfo();
    }
}