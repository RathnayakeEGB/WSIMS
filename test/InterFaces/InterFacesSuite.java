/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterFaces;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author JANU
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({InterFaces.WaterPumpedTest.class, InterFaces.CustomersTest.class, InterFaces.EmployeeTest.class, InterFaces.PaymentTest.class, InterFaces.CustomerGroupLevelPriceTest.class, InterFaces.CustomerGroupTest.class, InterFaces.InvoiceTest.class, InterFaces.CustomerGroupPriceMetrixTest.class, InterFaces.CustomerPaymentTest.class, InterFaces.EmployeeGroupTest.class, InterFaces.HomeFromTest.class, InterFaces.EmployeeAttendenceTest.class, InterFaces.ServiceTest.class, InterFaces.MothCustomerWaterUsageTest.class})
public class InterFacesSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
