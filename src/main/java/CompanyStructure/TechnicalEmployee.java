package CompanyStructure;

public class TechnicalEmployee extends Employee {
    protected int codeCheckIns;

    public TechnicalEmployee(String name) {
        super(name, 75000);
    }

    // Getter codeCheckIns
    public int getSuccessfulCheckIns() {
        return this.codeCheckIns;
    }

    public String employeeStatus() {
        return getEmployeeID() + " " + getName() + " has " + getSuccessfulCheckIns() + " successful check ins";
    }
}
