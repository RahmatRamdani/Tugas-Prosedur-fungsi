/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcedureAndFunction;

import java.util.Scanner;

/**
 *
 * @author rahmat ramdani
 */
public class Procedure {
    
    int panjang,lebar,luas;
    
    void LuasPersegi(){
        
    System.out.print("==================== Program Menghitung Luas Persegi Panjang ====================");
    
    System.out.print("\nMasukan Panjang : ");
    panjang = new Scanner(System.in).nextInt();
    System.out.print("Masukan Lebar : ");
    lebar = new Scanner(System.in).nextInt();
    
    luas = panjang * lebar;
    
    System.out.println("Luas Persegi Panjang : "+luas);
    }
    
    public static void main(String[] args) {

    Procedure hitung;
    hitung = new Procedure();
    hitung.LuasPersegi();

    }
}
