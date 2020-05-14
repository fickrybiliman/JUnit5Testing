package CompanyStructure;

public class Accountant extends BusinessEmployee {
    private TechnicalLead teamSupported;

    public Accountant(String name) {
        super(name);
        bonusBudget = 0;
        teamSupported = null;
    }

    // Getter teamSupported
    public TechnicalLead getTeamSupported() {
        return teamSupported;
    }

    // Setter teamSupported
    public void supportTeam(TechnicalLead lead) {
        teamSupported = lead;
        int softwareEngineerCount = lead.getDirectReports().size();
        double softwareEngineerBaseSalary = lead.getDirectReports().get(0).getBaseSalary();
        double totalBudget = softwareEngineerCount * softwareEngineerBaseSalary;
        bonusBudget = totalBudget + (totalBudget * 0.1);
    }

    public boolean approveBonus(double bonus) {
        return bonus <= bonusBudget;
    }

    public String employeeStatus() {
        if (teamSupported != null) {
            return getEmployeeID() + " " + getName() + " with a budget of " + getBonusBudget() + " is supporting " + getTeamSupported().getName();
        } else {
            return getEmployeeID() + " " + getName() + " with a budget of " + getBonusBudget();
        }
    }

}
