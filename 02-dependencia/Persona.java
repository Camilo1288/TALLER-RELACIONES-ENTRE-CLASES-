/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.dependencia;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private String edad;
    
    public Persona( String nombre, String edad ) {
        this.nombre=nombre;
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEdad(){
        return edad;
    }
    
    public void entrenar(Gimnasio g){
        System.out.println(nombre + " entrena en el gimnasio.");
    g.abrir();
    }
    public void pagarsuscripcion(Gimnasio g){
        System.out.println(nombre + " paga la suscripción en un gimnasio " + g.getTipo());
    }
}

