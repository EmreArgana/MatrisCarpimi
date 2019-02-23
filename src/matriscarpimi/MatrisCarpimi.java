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
import java.util.Scanner;
public class MatrisCarpimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matris satırını ve sütunun giriniz (arasında boşluk olacak şekilde)");
        String[] RowCol = scanner.nextLine().split(" ");
        int Row1=Integer.parseInt(RowCol[0]);
        int Col1=Integer.parseInt(RowCol[1]);
        
        
        System.out.println("Matris satırını ve sütunun giriniz (arasında boşluk olacak şekilde)");
        String[] RowCol2 = scanner.nextLine().split(" ");
        int Row2=Integer.parseInt(RowCol2[0]);
        int Col2=Integer.parseInt(RowCol2[1]);
        
        if (Col1==Row2) {
            int[][] dizi1=Matris.MatrisOlustur(Row1,Col1);
            int[][] dizi2=Matris.MatrisOlustur(Row2,Col2);
            System.out.println("1. Oluşturulan Matris");
            Matris.MatrisYazdir(dizi1, Row1, Col1);
            System.out.println("2. Oluşturulan Matris");
            Matris.MatrisYazdir(dizi2, Row2, Col2);
            System.out.println("Sonuç Matrisi");
            Matris.MatrisYazdir(Matris.MatisCarp(dizi1, dizi2, Row1,Col1, Col2), Row1, Col2);
        }
        else{
            System.out.println("Matris çarpımının yapılabilmesi için "
                    + "1. Matrisin Sütun(Column) ile 2. Matrisin Satır(Row)"
                    + " sayısının aynı olması gerek");
        }
    }
}
    
    
