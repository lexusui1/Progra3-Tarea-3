/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Lex
 */

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        int inicio = 2;
        int incremento = 0;
        String verificador = "s";

        while (inicio <=1800){
        incremento = incremento + inicio; 
        System.out.println(inicio);
        //Se compara la variable  
        if( "s".equals(verificador)){
            inicio = inicio + 3;
            verificador = "n";
        } else {
            inicio = inicio +2;
            verificador = "s";
        }
        }
        System.out.println("Total de la suma de la Serie: "+incremento);
    
    
    }
    
}
