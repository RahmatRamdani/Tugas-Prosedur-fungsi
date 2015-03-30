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
public class Function {
    
    static int Kuadrat(int bil){
    
        return bil*bil;
   }


    public static void main(String[] args) {

      int nilaiKuadrat;
      
      System.out.print("==================== Program Bilangan Kuadrat ====================");
      System.out.print("\nMasukan Nilai : ");
      nilaiKuadrat = new Scanner(System.in).nextInt();
      
      System.out.println(nilaiKuadrat +" kuadrat adalah "+ Kuadrat(nilaiKuadrat));
   
    }
}
