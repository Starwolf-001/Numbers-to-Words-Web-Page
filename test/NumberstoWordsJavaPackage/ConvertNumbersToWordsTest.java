/*
 * Document   : ConvertNumbersToWordsTest.java
 * Created on : 13/05/2018, 6:30:20 PM
 * Author     : Michael Cartwright
 * Version    : 1.0
 */
package NumberstoWordsJavaPackage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConvertNumbersToWordsTest {
    
    public ConvertNumbersToWordsTest() {
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
    
    // TODO
    
    /**
     * Test of unitConversion method, of class ConvertNumbersToWords.
     */
    @Test
    public void testUnitConversionInputZero() {
        System.out.println("testUnitConversionInputZero");
        ConvertNumbersToWords instance = new ConvertNumbersToWords();
        instance.convertedOutput = "";
        instance.userInput = "0";
        instance.inputLength = 1;
        instance.pos = 0;
        instance.unitConversion();
        if(instance.convertedOutput.equals("ZERO")) {
            assertTrue(true);
        } else {
            System.out.println(instance.convertedOutput);
            fail("testUnitConversionInputZero has failed and shouldn't have.");
        }
    }

    /**
     * Test of tensConversion method, of class ConvertNumbersToWords.
     */
    @Test
    public void testTensConversionInputTen() {
        System.out.println("testTensConversionInputTen");
        ConvertNumbersToWords instance = new ConvertNumbersToWords();
        instance.tensConversion();
        if(instance.convertedOutput.equals("TEN")) {
            assertTrue(true);
        } else {
            fail("testUnitConversionInputZero has failed and shouldn't have.");
        }
        fail("The test case is a prototype.");
    }

    /**
     * Test of hundredsConversion method, of class ConvertNumbersToWords.
     */
    @Test
    public void testHundredsConversion() {
        System.out.println("hundredsConversion");
        ConvertNumbersToWords instance = new ConvertNumbersToWords();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dollarsConversion method, of class ConvertNumbersToWords.
     */
    @Test
    public void testDollarsConversion() {
        System.out.println("dollarsConversion");
        ConvertNumbersToWords instance = new ConvertNumbersToWords();
        instance.dollarsConversion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of centsConversion method, of class ConvertNumbersToWords.
     */
    @Test
    public void testCentsConversion() {
        System.out.println("centsConversion");
        ConvertNumbersToWords instance = new ConvertNumbersToWords();
        instance.centsConversion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of andConversion method, of class ConvertNumbersToWords.
     */
    @Test
    public void testAndConversion() {
        System.out.println("andConversion");
        ConvertNumbersToWords instance = new ConvertNumbersToWords();
        instance.andConversion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wipeFile method, of class ConvertNumbersToWords.
     */
    @Test
    public void testWipeFile() throws Exception {
        System.out.println("wipeFile");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ConvertNumbersToWords instance = new ConvertNumbersToWords();
        instance.wipeFile(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeToFile method, of class ConvertNumbersToWords.
     */
    @Test
    public void testWriteToFile() throws Exception {
        System.out.println("writeToFile");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ConvertNumbersToWords instance = new ConvertNumbersToWords();
        instance.writeToFile(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processRequest method, of class ConvertNumbersToWords.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ConvertNumbersToWords instance = new ConvertNumbersToWords();
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doGet method, of class ConvertNumbersToWords.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ConvertNumbersToWords instance = new ConvertNumbersToWords();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class ConvertNumbersToWords.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ConvertNumbersToWords instance = new ConvertNumbersToWords();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class ConvertNumbersToWords.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        ConvertNumbersToWords instance = new ConvertNumbersToWords();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }   
}