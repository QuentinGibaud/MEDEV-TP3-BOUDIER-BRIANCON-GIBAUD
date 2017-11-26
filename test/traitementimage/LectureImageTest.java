/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitementimage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justine
 */
public class LectureImageTest {
    
    public LectureImageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of lireImage method, of class LectureImage.
     */
    @Test
    public void testLireImage() {
        System.out.println("lireImage");
        String nomFichierACharger = "imageTest.pgm";
        int[][] expResult = {{0, 234, 203},{255, 266, 108},{178, 56, 89}};
        int[][] result = LectureImage.lireImage(nomFichierACharger);
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of maxTab method, of class LectureImage.
     */
    @Test
    public void testMaxTab() {
        System.out.println("maxTab");
        int[] tab = null;
        int expResult = 0;
        int result = LectureImage.maxTab(tab);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of histogramme method, of class LectureImage.
     */
    @Test
    public void testHistogramme() throws Exception {
        System.out.println("histogramme");
        String nomFichier = "";
        LectureImage.histogramme(nomFichier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ecritureImage method, of class LectureImage.
     */
    @Test
    public void testEcritureImage() throws Exception {
        System.out.println("ecritureImage");
        int[][] matImage = null;
        String nomImage = "";
        LectureImage.ecritureImage(matImage, nomImage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
