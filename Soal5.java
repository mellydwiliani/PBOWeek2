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

public class Soal5 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String A = sc.nextLine();
        String B = sc.nextLine();
        
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);
        
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
        String capitalizedA = A.substring(0,1).toUpperCase()+A.substring(1);
        String capitalizedB = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(capitalizedA + " " +capitalizedB);
        
        sc.close();
        }
    }
