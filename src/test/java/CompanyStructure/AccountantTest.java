package CompanyStructure;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountantTest {

    @BeforeAll
    static void setupAccountantTest() {
        System.out.println("Setup Accountant Testing : ");
    }

    @Test
    void approveBonusFalseResult() {
        Accountant pia = new Accountant("Pia");
        TechnicalLead rifqi = new TechnicalLead("Rifki");
        SoftwareEngineer adit = new SoftwareEngineer("Adith");
        rifqi.addReport(adit);
        pia.supportTeam(rifqi);
        boolean piaApproveBonus = pia.approveBonus(20000000);
        assertFalse(piaApproveBonus);
    }

    @Test
    void approveBonusTrueResult() {
        Accountant pia = new Accountant("Pia");
        TechnicalLead rifqi = new TechnicalLead("Rifki");
        SoftwareEngineer ganang = new SoftwareEngineer("Ganang");
        rifqi.addReport(ganang);
        pia.supportTeam(rifqi);
        boolean piaApproveBonus = pia.approveBonus(1000);
        assertTrue(piaApproveBonus);
    }
}