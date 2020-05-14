package CompanyStructure;

public class SoftwareEngineer extends TechnicalEmployee {
    private boolean codeAccess;

    public SoftwareEngineer(String name) {
        super(name);
        codeAccess = false;
        codeCheckIns = 0;
    }

    // Getter codeAccess
    public boolean getCodeAccess() {
        return codeAccess;
    }

    // Setter codeAccess
    public void setCodeAccess(boolean access) {
        this.codeAccess = access;
    }

    public boolean checkInCode() {
        if ( ((TechnicalLead) getManager()).approveCheckIn(this) ) {
            codeCheckIns++;
            return true;
        } else {
            return false;
        }
    }

}
