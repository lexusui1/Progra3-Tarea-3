/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Lex
 */


import java.util.*;
import java.io.*;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int n=3;
    int oi[]= new int[n];
    
    
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el Primer Numero de la Serie");
        oi[0]= teclado.nextInt();
        
        System.out.println("Ingrese el Segundo Numero de la Serie");
        oi[1]= teclado.nextInt();
        
        System.out.println("Ingrese el Tercer Numero de la Serie");
        oi[2]= teclado.nextInt();
        
        for(n=2; n>=0; n--){
             
            System.out.println("Numero " + oi[n]);
    
    
        }
    
    }
    
}
