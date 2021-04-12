package exerciseSevenPointOneZero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionTest {
    SalesCommission salesCommission;

    @BeforeEach
    void setUp() {
        salesCommission = new SalesCommission();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void basePayCanBeSetAndGotten(){
        salesCommission.setBasePay(200);
        assertEquals(200, salesCommission.getBasePay());
    }

    @Test
    void grossSalesCanBeSetAndGotten(){
        salesCommission.setGrossSales(5000);
        assertEquals(5000, salesCommission.getGrossSales());

    }

    @Test
    void salaryCanBeCalculated(){
        salesCommission.salaryCalculator(5000);
        assertEquals(650, salesCommission.getCalculatedSalary());
        assertEquals(1, salesCommission.getSalaryRange()[4]);

    }
}