/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitementimage;

import java.io.IOException;

/**
 *
 * @author Quentin GIBAUD, Yann BRIANCON, Justine BOUDIER
 */
public class Seuillage {

    //
    /**
     * Fonction de seuillage.
     * Prend une image et un niveau max et renvoie l'image avec les niveaux de gris seuillées.
     * @param nomImage Nom de l'image à lire
     * @param seuil Valeur maximal souhaitée en niveau de gris [0:255]
     * @throws IOException 
     */
    public static void seuillage(String nomImage, int seuil) throws IOException {
        int[][] matImage = LectureImage.lireImage(nomImage);
        for (int i = 0; i < matImage.length; i++) {
            for (int j = 0; j<matImage[0].length;j++) {
                if (matImage[i][j]>seuil){
                    matImage[i][j] = seuil;
                }
            }
        }
        LectureImage.ecritureImage(matImage, nomImage + "_seuil");
    }
    
    /**
     * Fonction d'agrandissement de l'image
     * @param nomImage Nom de l'image à lire
     * @param facteurAgrandissant Rapport entre l'image d'origine et celle agrandie
     * @throws java.io.IOException
     */
    public static void agrandir(String nomImage, int facteurAgrandissant) throws IOException{
        int[][] matImage = LectureImage.lireImage(nomImage);
        int height = matImage.length;
        int width = matImage[0].length;
        
        int[][] matNewImage;
        matNewImage = new int[facteurAgrandissant*height][facteurAgrandissant*width];
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j<width;j++) {
                int value = matImage[i][j];
                for(int k1=0; k1<facteurAgrandissant; k1++){
                    for(int k2=0; k2<facteurAgrandissant; k2++){
                        matNewImage[(i*facteurAgrandissant)+k1][(j*facteurAgrandissant)+k2] = value;
                    }
                }
            }
        }
        
        LectureImage.ecritureImage(matNewImage, nomImage + "_agrandie");
    }
}
