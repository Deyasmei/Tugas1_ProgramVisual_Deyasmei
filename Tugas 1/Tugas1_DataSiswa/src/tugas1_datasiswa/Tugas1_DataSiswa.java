/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_datasiswa;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Tugas1_DataSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String nama ;
        int usia;
        double tinggibadan;
        
        System.out.print("Nama :");
        nama= input.nextLine();
        
        System.out.print("Usia : ");
        usia= input.nextInt();
        
        System.out.print("Tinggi Badan :");
        tinggibadan=input.nextDouble();
        
        
    }
    
}
