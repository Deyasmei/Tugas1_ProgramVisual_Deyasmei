/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_aritmatika;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Tugas1_Aritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int angka1, angka2;
        int penjumlahan, pengurangan, perkalian, pembagian;
        
        System.out.print("Masukan Angka Pertama : ");
        angka1= input.nextInt();
        
        System.out.print("Masukan Angka Kedua : ");
        angka2= input.nextInt();
        
        penjumlahan=angka1+angka2;
        pengurangan=angka1-angka2;
        perkalian=angka1*angka2;
        pembagian=angka1/angka2;
        
        System.out.println("Penjumlahan dari Angka pertama dan kedua adalah " +penjumlahan);
        System.out.println("Pengurangan dari Angka pertama dan kedua adalah " +pengurangan);
        System.out.println("Perkalian dari Angka pertama dan kedua adalah " +perkalian);
        System.out.println("Pembagian dari Angka pertama dan kedua adalah " +pembagian);
    
    }
    
}
 