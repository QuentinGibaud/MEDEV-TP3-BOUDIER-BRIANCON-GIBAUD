/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitementimage;

import java.io.IOException;
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
     * @throws java.lang.Exception
     */
    @Test
    public void testSeuillage() throws Exception {
        System.out.println("seuillage");
        String nomImage = "imageTest.pgm";
        int seuil = 200;
        int[][] expResult = {{0, 200, 200}, {200, 200, 108}, {178, 56, 89}};
        Seuillage.seuillage(nomImage, seuil);
        int[][] expObtain = LectureImage.lireImage("imageTest.pgm_seuil.pgm");
        assertArrayEquals(expResult, expObtain);
    }

    /**
     * Test of agrandir method, of class Seuillage.
     * @throws java.io.IOException
     */
    @Test
    public void testAgrandir() throws IOException {
        System.out.println("agrandir");
        String nomImage = "imageTest.pgm";
        int facteurAgrandissant = 2;
        Seuillage.agrandir(nomImage, facteurAgrandissant);
        int[][] expResult = {{0, 0, 234, 234, 203, 203}, {0, 0, 234, 234, 203, 203}, {255, 255, 216, 216, 108, 108}, {255, 255, 216, 216, 108, 108}, {178, 178, 56, 56, 89, 89}, {178, 178, 56, 56, 89, 89}};
        int[][] expObtain = LectureImage.lireImage("imageTest.pgm_agrandie.pgm");
        assertArrayEquals(expResult, expObtain);
    }
    
    /**
     * Test of reduire method, of class Seuillage
     * @throws java.io.IOtest
     */
    @Test
    public void testReduire() throws IOException{
        System.out.println("reduire");
        String nomImage = "imageTest.pgm";
        int facteurReduction = 2;
        Seuillage.reduire(nomImage, facteurReduction);
        int[][] expResult = {{177, 156},{117,89}};
        int[][] expObtain = LectureImage.lireImage("imageTest.pgm_reduite.pgm");
        assertArrayEquals(expResult,expObtain);
        
    }
}
