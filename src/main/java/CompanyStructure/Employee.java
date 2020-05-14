package CompanyStructure;

public abstract class Employee {
    private String name;
    protected double baseSalary;
    private int employeeID;
    public static int idCounter = 1;
    private Employee manager;
    private double bonus;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeID = idCounter;
        idCounter++;
    }

    // Getter baseSalary
    public double getBaseSalary() {
        return baseSalary;
    }

    // Getter name
    public String getName() {
        return name;
    }

    // Getter employeeID
    public int getEmployeeID() {
        return employeeID;
    }

    // Getter manager
    public Employee getManager() {
        return manager;
    }

    // Setter manager
    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public boolean equals(Employee other) {
        return this.getEmployeeID() == other.getEmployeeID();
    }

    public String toString() {
        return getEmployeeID() + " " + getName(); // Example : "2 Kasey"
    }

    public abstract String employeeStatus();

    // Getter bonus
    public double getBonus() {
        return bonus;
    }

    // Setter bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
