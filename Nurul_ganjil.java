/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nurul_ganjil;

import java.util.Scanner;

/**
 *
 * @author Bintang
 */
public class Nurul_ganjil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Mengkonversi Suhu Celcius Ke Fahrenheit");
    int c,f;
    System.out.print("Masukkan nilai celcius:");
    c= input.nextInt();
    f= (c*9)/5+32;
    System.out.println("Hasil konversi="+f+"derajat fahrenheit");
    }
    
    
}
