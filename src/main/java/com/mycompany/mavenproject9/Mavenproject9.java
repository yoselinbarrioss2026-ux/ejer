/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class Mavenproject9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese el numero 1");
        int num1 = sc.nextInt();
        System.out.println("ingrese el numero 2");
        int num2 = sc.nextInt();
        int suma=num1+num2;
        int resta=num1-num2;
        int multiplicacion=num1*num2;
        int division=num1/num2;
        int modulo=num1%num2;
        System.out.println("el resultado de la suma es"+suma);
         System.out.println("el resultado de la resta es"+resta);
          System.out.println("el resultado de la multiplicacion es"+multiplicacion);
           System.out.println("el resultado de la division es"+division);
            System.out.println("el resultado de el modulo es"+modulo);
            sc.close();
        
        
        
        
    }
}

