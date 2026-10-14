/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s_u_1_14_10_1zad;

/**
 *
 * @author tedil
 */
public class S_U_1_14_10_4zad {
    public static void main(String[] args)
    {
    int result =Fib(10);
    System.out.println(result);
    }
    
    public static int Fib(int num)
    {
        if (num < 1) {
            return 0;
        }
        else if (num < 2)
        {
            return 1;
        }
        else 
        {
            return Fib(num - 1) + Fib(num - 2);
        }
        

    }
}
