public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percent) {
        salary += salary * (percent / 100);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "John Doe", 50000);
        System.out.println("Salary before increase: $" + emp.salary);

        emp.increaseSalary(10);
        System.out.println("Salary after increase: $" + emp.salary);
    }
}
