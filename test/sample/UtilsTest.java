/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Quentin GIBAUD
 */
public class UtilsTest {

    public UtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void testConcatWords() {
        System.out.println("concatWords");
        String[] words = {"bonjour", "au", "revoir"};
        String expResult = "bonjouraurevoir";
        String result = Utils.concatWords(words);
        assertEquals(expResult, result);

    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test(timeout = 1000)
    public void testComputeFactorial() {
        System.out.println("computeFactorial");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + "!");
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
        assertEquals("1", Utils.computeFactorial(1));
        assertEquals("6", Utils.computeFactorial(3));
        assertEquals("24", Utils.computeFactorial(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkExpectedException() {
        System.out.println("checkExpectedException");
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }
}
