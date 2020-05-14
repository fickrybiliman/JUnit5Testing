package CompanyStructure;

public class BusinessEmployee extends Employee{
    double bonusBudget;

    public BusinessEmployee(String name) {
        super(name, 50000);
    }

    // Getter bonusBudget
    public double getBonusBudget() {
        return bonusBudget;
    }

    public String employeeStatus() {
        return getEmployeeID() + " " + getName() + " with a budget of " + getBonusBudget();
    };
}
