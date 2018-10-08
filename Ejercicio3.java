/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Lex
 */

import java.util.*;
import java.io.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        double peso;
        double altura;
        double promediop=0;
        double promedioa=0;
        int limite;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el Numero de la Poblacion");
        limite=teclado.nextInt();
        
        for(int i=1;i<=limite;i++){
            System.out.println("Ingrese el Peso "+i+" en Libras:");
            peso=teclado.nextDouble();
            
            System.out.println("Ingrese la Altura "+i+" en Metros:");
            altura=teclado.nextDouble();
            
            promediop=promediop+peso;
            promedioa=promedioa+altura;
        }
        System.out.println("El promedio de el peso es: "+promediop/limite);
        System.out.println("El promedio de la altura es: "+promedioa/limite);
        
        
    }
    
}
