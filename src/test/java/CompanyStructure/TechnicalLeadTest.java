package CompanyStructure;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TechnicalLeadTest {
    @BeforeAll
    static void setupTechnicalLeadTest() {
        System.out.println("Setup Technical Lead Testing : ");
    }

    @Test
    void requestBonusFalseResult() {
        TechnicalLead rifqi = new TechnicalLead("Rifki");
        SoftwareEngineer adit = new SoftwareEngineer("Adith");
        rifqi.addReport(adit);
        BussinessLead riza = new BussinessLead("Riza");
        Accountant pia = new Accountant("Pia");
        riza.addReport(pia, rifqi);
        boolean rizaRequestBonusForAdit = riza.requestBonus(adit, 20000000);
        assertFalse(rizaRequestBonusForAdit);
    }

    @Test
    void requestBonusTrueResult() {
        TechnicalLead rifqi = new TechnicalLead("Rifki");
        SoftwareEngineer ganang = new SoftwareEngineer("Ganang");
        rifqi.addReport(ganang);
        BussinessLead riza = new BussinessLead("Riza");
        Accountant pia = new Accountant("Pia");
        riza.addReport(pia, rifqi);
        boolean rizaRequestBonusForGanang = riza.requestBonus(ganang, 1000);
        assertTrue(rizaRequestBonusForGanang);
    }
}