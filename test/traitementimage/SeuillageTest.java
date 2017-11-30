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
 * @author Quentin GIBAUD
 */
public class SeuillageTest {
    
    public SeuillageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of seuillage method, of class Seuillage.
     */
    @Test
    public void testSeuillage() throws Exception {
        System.out.println("seuillage");
        String nomImage = "imageTest.pgm";
        int seuil = 200;
        int[][] expResult = {{0, 200, 200},{200, 200, 108},{178, 56, 89}};
        Seuillage.seuillage(nomImage, seuil);
        int[][] expObtain = LectureImage.lireImage("imageTest.pgm_seuil.pgm");
        assertArrayEquals(expResult, expObtain);
    }

    /**
     * Test of agrandir method, of class Seuillage.
     */
    @Test
    public void testAgrandir() {
        System.out.println("agrandir");
        String nomImage = "";
        int facteurAgrandissant = 0;
        Seuillage.agrandir(nomImage, facteurAgrandissant);
        fail("The test case is a prototype.");
    }
    
}
