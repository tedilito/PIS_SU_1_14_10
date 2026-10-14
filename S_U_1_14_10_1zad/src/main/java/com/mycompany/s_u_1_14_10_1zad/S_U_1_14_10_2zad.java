/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s_u_1_14_10_1zad;

import java.util.Scanner;

/**
 *
 * @author tedil
 */
public class S_U_1_14_10_2zad {
    
    public static void main(String[] args) {
           System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);

        // Въвеждане на данните
        System.out.print("Въведете M: ");
        long M = sc.nextLong();

        System.out.print("Въведете W: ");
        long W = sc.nextLong();

        System.out.print("Въведете H: ");
        long H = sc.nextLong();

        // Изчисляване на площта на стадиона
        long area = W * H;

        // Общо време в минути
        long totalMinutes = area * M;

        // Преобразуване в дни, часове и минути
        long days = totalMinutes / 1440;
        long hours = (totalMinutes % 1440) / 60;
        long minutes = totalMinutes % 60;

        // Извеждане на резултата
        System.out.println("Необходимо време:");
        System.out.println("Дни: " + days);
        System.out.println("Часове: " + hours);
        System.out.println("Минути: " + minutes);
 
        
    }
}
    
    
    

