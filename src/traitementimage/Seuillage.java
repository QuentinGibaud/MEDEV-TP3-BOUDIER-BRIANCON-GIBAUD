/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitementimage;

import java.io.IOException;
import static java.lang.Integer.min;
import static java.lang.Math.ceil;

/**
 *
 * @author Quentin GIBAUD, Yann BRIANCON, Justine BOUDIER
 */
public class Seuillage {

    //
    /**
     * Fonction de seuillage. Prend une image et un niveau max et renvoie
     * l'image avec les niveaux de gris seuillées.
     *
     * @param nomImage Nom de l'image à lire
     * @param seuil Valeur maximal souhaitée en niveau de gris [0:255]
     * @throws IOException
     */
    public static void seuillage(String nomImage, int seuil) throws IOException {
        int[][] matImage = LectureImage.lireImage(nomImage);
        for (int i = 0; i < matImage.length; i++) {
            for (int j = 0; j < matImage[0].length; j++) {
                if (matImage[i][j] > seuil) {
                    matImage[i][j] = seuil;
                }
            }
        }
        LectureImage.ecritureImage(matImage, nomImage + "_seuil");
    }

    /**
     * Fonction d'agrandissement de l'image
     *
     * @param nomImage Nom de l'image à lire
     * @param facteurAgrandissant Rapport entre l'image d'origine et celle
     * agrandie
     * @throws java.io.IOException
     */
    public static void agrandir(String nomImage, int facteurAgrandissant) throws IOException {
        int[][] matImage = LectureImage.lireImage(nomImage);
        int height = matImage.length;
        int width = matImage[0].length;

        int[][] matNewImage;
        matNewImage = new int[facteurAgrandissant * height][facteurAgrandissant * width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int value = matImage[i][j];
                for (int k1 = 0; k1 < facteurAgrandissant; k1++) {
                    for (int k2 = 0; k2 < facteurAgrandissant; k2++) {
                        matNewImage[(i * facteurAgrandissant) + k1][(j * facteurAgrandissant) + k2] = value;
                    }
                }
            }
        }

        LectureImage.ecritureImage(matNewImage, nomImage + "_agrandie");
    }

    
    /**
     * Fonction de réduction de l'image
     * @param nomImage Nom de l'image à lire
     * @param facteurReduction Rapport entre l'image d'origine et celle agrandie
     * @throws java.io.IOException
     */
    public static void reduire(String nomImage, int facteurReduction) throws IOException{
        int[][] matImage = LectureImage.lireImage(nomImage);
        int height = matImage.length;
        int width = matImage[0].length;
        
        int[][] matNewImage;
        int newHeight = height/facteurReduction + 1;
        int newWidth = width/facteurReduction + 1;
        matNewImage = new int[newHeight][newWidth];
        
        for(int k1=0; k1<newHeight; k1++){
            int indexMaxHeight = min((k1+1)*facteurReduction, height);
            for(int k2=0; k2<newHeight; k2++){
                int indexMaxWidth = min((k2+1)*facteurReduction, width);
                int average = 0;
                int nbValue = 0;
                for (int i = k1*facteurReduction; i < indexMaxHeight; i++) {
                    for (int j = k2*facteurReduction; j<indexMaxWidth;j++) {
                        average += matImage[i][j];
                        nbValue++;
                    }
                }
                if(nbValue > 0){
                    average = (int)ceil(((float)average)/nbValue);
                }
                matNewImage[k1][k2] = average;
            }
        }
        
        LectureImage.ecritureImage(matNewImage, nomImage + "_reduite");

    }
}
