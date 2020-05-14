package CompanyStructure;

import java.util.ArrayList;

public class BussinessLead extends BusinessEmployee {
    private int headCount;
    private ArrayList<Accountant> directReports = new ArrayList<Accountant>();

    public BussinessLead(String name) {
        super(name);
        baseSalary = getBaseSalary() * 2;
        headCount = 10;
    }

    public boolean hasHeadCount() {
        return headCount > 0;
    }

    public boolean addReport(Accountant acc, TechnicalLead supportTeam) {
        if (hasHeadCount()) {
            directReports.add(acc);
            acc.setManager(this);
            bonusBudget += acc.getBaseSalary() * 1.1;
            supportTeam.setAccounting(acc);
            acc.supportTeam(supportTeam);
            return true;
        } else {
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus) {
        if (bonus <= bonusBudget) {
            bonusBudget -= bonus;
            e.setBonus(bonus);
            return true;
        } else {
            return false;
        }
    }

    public boolean approveBonus(Employee e, double bonus) {
        for (Accountant acc : directReports) {
            for (SoftwareEngineer se: acc.getTeamSupported().getDirectReports()) {
                if (se.getEmployeeID() == e.getEmployeeID() && bonus < acc.getBonusBudget()) {
                    acc.bonusBudget -= bonus;
                    e.setBonus(bonus);
                    return true;
                }
            }
        }
        return false;
    }

    public String getTeamStatus() {
        StringBuilder status = new StringBuilder();

        status.append(getEmployeeID() + " " + getName());
        if (directReports.size() > 0) {
            status.append(" is managing : \n");
            for (Accountant acc : directReports) {
                status.append("\t" + acc.getEmployeeID() + " " + acc.getName() + " with budget " + acc.getBonusBudget());
                status.append(", is supporting for Technical Lead : \n");
                status.append("\t" + "\t" + acc.getTeamSupported() + "\n");
                /*
                for (SoftwareEngineer se: acc.getTeamSupported().getDirectReports()) {
                    status.append("\t" + "\t" + "\t" +se.getEmployeeID() + " " + se.getName() +"\n");
                }
                 */
            }
        } else {
            status.append("no direct reports yet.");
        }

        return status.toString();
    }
}
