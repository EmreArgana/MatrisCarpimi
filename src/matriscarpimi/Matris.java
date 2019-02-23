/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriscarpimi;

/**
 *
 * @author emre
 */
import java.util.Random;
public class  Matris{
    public static int[][] MatrisOlustur(int Row, int Col){
        int[][] dizi = new int[Row][Col];
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                dizi[i][j]=new Random().nextInt(10);
            }
        }
        return dizi;
    }
    public static void MatrisYazdir(int[][] dizi, int Row,int Col){
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                System.out.print(dizi[i][j]+" ");
            }System.out.println("");
        }
    }
    public static int[][] MatisCarp(int[][] dizi1, int[][] dizi2,int Row1,int Col1, int Col2){
        int[][] sonuc= new int[Row1][Col2];
       
        for (int i = 0; i < Row1; i++) {
            for (int j = 0; j < Col2; j++) {
                for (int k = 0; k < Col1; k++) {
                    sonuc[i][j]+=dizi1[i][k]*dizi2[k][j];
                }
            }
        }
        return sonuc;
    }
    
}
