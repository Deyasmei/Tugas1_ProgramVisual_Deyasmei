/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_ganjilgenap;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Tugas1_GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int bil;
        
        System.out.print("Masukan Angka : ");
        bil=input.nextInt();
        
        if(bil%2==0){
        System.out.print("Angka"+bil+" adalah Bilangan Genap");
    }else{
            System.out.print("Angka"+bil+" adalah Bilangan Ganjil");
            }
        // TODO code application logic here
    }
    
}
