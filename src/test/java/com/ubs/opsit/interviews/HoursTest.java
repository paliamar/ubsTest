package com.ubs.opsit.interviews;


import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author amarpali
 */
public class HoursTest {
    
    public HoursTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertTime method, of class Hours.
     */
    @Test
    public void testConvertTime() {
        Hours instance = new Hours();
        String expResult = "RROO"+"\n"+ "ROOO";
        String result = instance.convertTime("11");
        assertEquals(expResult, result);
    }

    /**
     * Test of getHoursFirstRow method, of class Hours.
     */
    @Test
    public void testGetHoursFirstRow() {
        Hours instance = new Hours();
        String result = instance.getHoursFirstRow(12);
        assertEquals("RROO", result);
    }

    /**
     * Test of getHoursBottomRow method, of class Hours.
     */
    @Test
    public void testGetHoursBottomRow() {
        Hours instance = new Hours();
        String result = instance.getHoursBottomRow(6);
        assertEquals("ROOO", result);
    }
    
}
