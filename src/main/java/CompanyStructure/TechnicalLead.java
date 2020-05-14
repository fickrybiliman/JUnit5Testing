package CompanyStructure;

import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    private int headCount;
    private ArrayList<SoftwareEngineer> directReports = new ArrayList<SoftwareEngineer>();
    private Accountant accounting;

    public TechnicalLead(String name) {
        super(name);
        double baseSalary = getBaseSalary() * 1.3;
        headCount = 4;
    }

    // Getter headCount
    public boolean hasHeadCount() {
        return headCount > 0;
    }

    public boolean addReport(SoftwareEngineer se) {
        if (hasHeadCount()) {
            directReports.add(se);
            se.setManager(this);
            headCount--;
            return true;
        } else {
            return false;
        }
    }

    public boolean approveCheckIn(SoftwareEngineer se) {
        return directReports.contains(se) && se.getCodeAccess();
    }

    public boolean requestBonus(Employee e, double bonus) {
        if ( ( (BussinessLead) getAccounting().getManager() ).approveBonus(e, bonus) ) {
            return true;
        } else {
            return false;
        }
    }

    public String getTeamStatus() {
        StringBuilder status = new StringBuilder();

        status.append(getEmployeeID() + " " + getName() + " has " + getSuccessfulCheckIns() + " successful check ins and ");
        if (directReports.size() > 0) {
            status.append("is managing : \n");
            for (SoftwareEngineer se : directReports) {
                status.append("\t" + se.employeeStatus());
                status.append("\n");
            }
        } else {
            status.append("no direct reports yet.");
        }

        return status.toString();
    }

    // Getter ArrayList of Software Engineer Managed By
    public ArrayList<SoftwareEngineer> getDirectReports() {
        return directReports;
    }

    // Getter accountant
    public Accountant getAccounting() {
        return accounting;
    }

    // Setter accountant
    public void setAccounting(Accountant accounting) {
        this.accounting = accounting;
    }
}
