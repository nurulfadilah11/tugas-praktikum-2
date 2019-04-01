/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nurul_ganjil2;

import java.util.Scanner;

/**
 *
 * @author Bintang
 */
public class Nurul_ganjil2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("menghitung luas lingkaran");
    
    double r,luas;
    System.out.print("masukkan jari jari : ");
    r= input.nextDouble();
    luas=0.5*3.14*r*r;
    System.out.println("Luas Lingkaran= "+(int)luas);
    }
    
    }
    

