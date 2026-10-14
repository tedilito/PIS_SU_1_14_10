/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.s_u_1_14_10_1zad;

import java.util.Scanner;

/**
 *
 * @author tedil
 */

public class S_U_1_14_10_1zad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size for the array");
        int sizeInput = Integer.parseInt(sc.nextLine());
        
        
         int[] array = new int[sizeInput];
          System.out.println("Enter elements of the aray: ");
          
          for (int i = 0; i < sizeInput; i++) {
          // System.out.println("Enter element that is whole number at index: " + i);
           array[i] = Integer.parseInt(sc.nextLine());
            
        }
         
          /*for (int i = 0; i < sizeInput; i++) {
            System.out.println("Element: " +array[i] + " at index: " + i);
        }*/
         
          //а) Отпечатване в прав и обратен ред:
           System.out.println("prav red: ");
          for (int i = 0; i < sizeInput; i++) {
            System.out.println("Element: " +array[i] + " at index: " + i);
        }
         System.out.println("Obraten red: ");
             for (int i = sizeInput - 1; i >= 0; i--) {
            System.out.println("Element: " +array[i] + " at index: " + i);
        }
         
         //Avereage sum 
        int sum = 0; 
          for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
          
          double avgElements = (sum * 1.0) / array.length; //  double avgElements = (double) sum  / array.length;
          System.out.println("The avarage value of the elements is: " + avgElements);
          
          
          // nechetni indexi i tehnite stoinosti
          
          for (int i = 1; i < array.length; i+=2) {
            System.out.println("The odd index values is: "+ i + " The value of the odd index element " + array[i]);
        }
          
        
        
    }
}
