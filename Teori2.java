/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori2;

import java.util.Scanner;

/**
 *
 * @author Bintang
 */
public class Teori2 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String nama,alamat;
    int umur;
    
    System.out.println("nama:");
    nama= input.next();
    
    System.out.println("alamat:");
    alamat= input.next();
    
    System.out.println("umur:");
    umur= input.nextInt();
    
    
    System.out.println("Saudara:"+nama);
    System.out.println("alamat:"+alamat);
    System.out.println("berumur:"+umur+ "tahun");
    
    }
    
}
