package CompanyStructure;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class) // JUnit 4 Syntax
// @ExtendWith()
@SelectClasses({AccountantTest.class, SoftwareEngineerTest.class, TechnicalLeadTest.class})
// @SelectPackages("CompanyStructure") // Select by packages

public class AllTest {
}
