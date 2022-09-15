/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Christian
 */
public class Nodo {
    public double dato;
    public String dato_string;
    public String Scramble;
    public Nodo enlace;

    public Nodo(double x,String tiempo_str,String Scramble_c) {
        dato = x;
        enlace = null;
        dato_string = tiempo_str;
        Scramble = Scramble_c;
    }
    
    public double getDato(){
        return dato;
    }
    
    public Nodo getEnlace(){
        return enlace;
    }
    
    public void setEnlace(Nodo enlace){
        this.enlace = enlace;
    }

    /**
     * @return the dato_string
     */
    public String getDato_string() {
        return dato_string;
    }

    public String getScramble() {
        return Scramble;
    }

    public void setScramble(String Scramble) {
        this.Scramble = Scramble;
    }
    /**
     * @param dato_string the dato_string to set
     */
    public void setDato_string(String dato_string) {
        this.dato_string = dato_string;
    }
    
    
    
}
