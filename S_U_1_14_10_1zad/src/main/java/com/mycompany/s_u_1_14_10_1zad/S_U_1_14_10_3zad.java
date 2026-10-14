/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s_u_1_14_10_1zad;

/**
 *
 * @author tedil
 */
public class S_U_1_14_10_3zad {
    
      public static void main(String[] args) {
        
        int[][] array = {
            {1,2} , 
            {4,5,6} , 
            {12,8,1,8} , 
            {0,12,3,5,8}, 
            {3}
        };
        
        int cNum = 0; 
        
        
         
          for (int i = 0; i < array.length; i++) {
              int[] subArray = array[i];
               //System.out.println( "!!" +subArray.length);
              cNum += subArray.length;
          }
        
                      // System.out.println( "!!" +cNum);

                       //System.out.println( "!!" +array.length);

        int avgIndex = cNum / array.length; //5 
          //System.out.println( "!!" + avgIndex);
        int sumNums = 0; 
        
         for (int i = 0; i < array.length; i++) {
              int[] subArray = array[i];
              
              for (int j = 0; j < subArray.length; j++) {
                  if (j == avgIndex) {
                      sumNums += subArray[j];
                  }
             }
              

              
          }
        
        System.out.println("The sum is " + sumNums);
        System.out.println("Avg index "+ avgIndex);
        //System.out.println(array.length);
        
        
        
    }
    
    
}
