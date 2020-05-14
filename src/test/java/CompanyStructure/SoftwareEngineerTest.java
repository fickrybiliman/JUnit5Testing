package CompanyStructure;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// @DisplayName("Custom Displaying Name for Software Engineer Test")
class SoftwareEngineerTest {

    @BeforeAll
    static void setupSoftwareEngineerTest() {
        System.out.println("Setup Software Engineer Testing : ");
    }

    @Test
    // @DisplayName("Software Engineering Code Access")
    void checkInCodeFalseResult() {
        TechnicalLead rifqi = new TechnicalLead("Rifki");
        SoftwareEngineer adit = new SoftwareEngineer("Adith");
        adit.setCodeAccess(false);
        rifqi.addReport(adit);
        boolean aditCodeAccess = adit.getCodeAccess();
        assertFalse(aditCodeAccess, "Adit doesn't have code access => false");
    }

    @Test
    // @DisplayName("Software Engineering Code Access")
    void checkInCodeTrueResult() {
        TechnicalLead rifqi = new TechnicalLead("Rifki");
        SoftwareEngineer adit = new SoftwareEngineer("Adith");
        adit.setCodeAccess(false);
        rifqi.addReport(adit);
        boolean aditCodeAccess = adit.getCodeAccess();
        assertFalse(aditCodeAccess, "Adit doesn't have code access => false");
    }

}