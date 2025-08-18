public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary); // call to Employee constructor
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // call to Employee method
        System.out.println("Department: " + department);
    }
}
