/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_luassegitiga;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Tugas1_LuasSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,t;
        double luas;
        
        System.out.print("Masukan Alas =");
        a=input.nextInt();
        
        System.out.print("Masukan Tinggi =");
        t=input.nextInt();
        
        luas= 0.5*a*t;
        System.out.println("Luas Sgitiga adalah " +luas);
        
        // TODO code application logic here
    }
    
}
