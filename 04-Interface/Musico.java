/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.interfase;

/**
 *
 * @author Usuario
 */
public class Musico implements TocaMusica  {
    private String nombre; 
    private String instrumento;
    
    public Musico(String nombre, String instrumento){
        this.nombre=nombre;
        this.instrumento=instrumento;
    }
     @Override public void tocar() { System.out.println(nombre + " toca " + instrumento + " en vivo."); }
}
