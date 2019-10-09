/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama  : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 * Diskripsi Program : Perhitungan Lingakaran 
 */
public class Perhitunganlingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double diameter = 0;
        
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukan nilai diameter lingkaran = ");
        Scanner nilai = new Scanner(System.in);
        while (!nilai.hasNextDouble()){
            System.out.println("Nilai Diamater Tidak Sesuai");
            System.out.print("Masukkan Nilai Diameter Lingkaran : ");
            nilai.next();
        }
        diameter = nilai.nextDouble();
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Jari-jari Lingkaran = " + (diameter/2) +" cm");
        System.out.println("Luas lingkaran = " + (3.14*(diameter/2)*(diameter/2)) + " cm");
        System.out.println("Keliling Lingkaran = " + (3.14*diameter) + " cm");
    }
    
}
