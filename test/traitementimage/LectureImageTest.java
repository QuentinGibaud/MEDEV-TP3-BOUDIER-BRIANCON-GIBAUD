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
        int[][] expResult = {{0, 234, 203},{255, 216, 108},{178, 56, 89}};
        int[][] result = LectureImage.lireImage(nomFichierACharger);
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of maxTab method, of class LectureImage.
     */
    @Test
    public void testMaxTab() {
        System.out.println("maxTab");
        int[] tab = {2,7,9,1};
        int expResult = 9;
        int result = LectureImage.maxTab(tab);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of histogramme method, of class LectureImage.
     */
    @Test
    public void testHistogramme() throws Exception {
        System.out.println("histogramme");
        String nomFichier = "imageTest.pgm";
        LectureImage.histogramme(nomFichier);
        int [][] histo = LectureImage.lireImage("histogramme.pgm");
        int [][] expResult = LectureImage.lireImage("histogrammeImageTest.pgm");
        assertArrayEquals(expResult, histo);
    }

    /**
     * Test of ecritureImage method, of class LectureImage.
     */
    @Test
    public void testEcritureImage() throws Exception {
        System.out.println("ecritureImage");
        int[][] matImage = {{0, 234, 203},{255, 216, 108},{178, 56, 89}};
        String nomImage = "ecritureTest";
        LectureImage.ecritureImage(matImage, nomImage);
        assertArrayEquals(LectureImage.lireImage("ecritureTest.pgm"),LectureImage.lireImage("imageTest.pgm"));
    }
    
}
