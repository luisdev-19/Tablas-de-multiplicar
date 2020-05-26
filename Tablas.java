/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

/**
 * Programa que realiza las tablas de multiplicar
 *
 * @author Jose Luis Peña Arcos
 * 25/05/2020
 */
public class Tablas {
    
    private int numero;
    
    public Tablas(){
        this.setNumero(numero);
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    public void hacerUnaTabla(){
        int tabla = 1, res = 0;
        for( ;tabla <= 10; tabla ++){
            res = numero * tabla;
            System.out.println(numero + " x " + tabla + " = " + res);
            
        }        
    }
    
    public void hacerTodasLasTablas(){
        int res = 0;
        for(int numero = 1; numero <= 10; numero++){
            for( int tabla = 1; tabla <= 10; tabla++){
                res = tabla * numero;
                System.out.println(numero + " x " + tabla + " = " + res);
            }
        }
    }  
    
}
