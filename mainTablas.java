/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainTablas;

/**
 * Main del programa para hacer tablas de multiplicar
 * @author Jose Luis Peña Arcos
 * 25/05/2020
 */

import Tablas.Tablas;
import java.util.Scanner;


public class mainTablas {
    
    public static void main(String args[]){
        
        int pedirNumero;
        char opcion = ' ';
            
        
        Tablas miTabla = new Tablas();        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Que opcion deseas hacer:");
        System.out.println(" a) Hacer una tabla");
        System.out.println(" b) Imprimir todas las tablas");
        
       opcion = scanner.nextLine().charAt(0);
        
        System.out.println("Opcion Ingresada : " + opcion);
        
        switch(opcion){
            case 'a': case 'A':
                System.out.println("Ingrese su numero:");
                pedirNumero = scanner.nextInt();                    
                System.out.println("Tabla del " + pedirNumero);
                miTabla.setNumero(pedirNumero);
                miTabla.hacerUnaTabla();
                break;
            case 'b': case 'B':
                miTabla.hacerTodasLasTablas();
                break;
            default:
                System.out.println("Opcion incorrecta");
                
        }
                
    }
    
}
