/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melly Dwiliani
 */
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        
        for (int i=1; i<=6; i++){
            System.out.print ("Masukkan angka = ");
            input = scan.nextLine();
            try{
                long x = Long.parseLong(input);
                
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE){
                   System.out.println(input + " can be fitted in : \n byte\n short\n int\n long");
                }
                else if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE){
                   System.out.println(input + " can be fitted in : \n short\n int\n long");
                }
                else if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE){
                   System.out.println(input + " can be fitted in : \n int\n long");
                }
                else if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE){
                   System.out.println(input + " can be fitted in : \n long");
                }
            } catch (NumberFormatException e ){
                System.out.println (" can be fitted anywhere");
            }
        }
        scan.close();
    }
}
        
