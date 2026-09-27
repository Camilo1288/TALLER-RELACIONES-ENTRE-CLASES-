/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.herencia;

/**
 *
 * @author Usuario
 */
public class Mediodetransporte {
    public String marca;
    public String tamaño;
    private String placa;
    
    public Mediodetransporte(String marca, String tamaño, String placa){
        this.marca=marca;
        this.tamaño=tamaño;
        this.placa=placa;
    }
    public String getPlaca() {
        return placa;
    }
    public void arrancar(){
        System.out.println("el carro arranco");
    }
     public void frenar(){
        System.out.println("el carro arranco");
    }
    public void giraraladerecha(){
        System.out.println("girar a la derecha");
    }
    public void giraralaizquierda(){
        System.out.println("girar a la izquierda");
    }
    public void moversehacielfrente(){
        System.out.println("moverse hacia adelante");
    }
    public void moversehaciaatras(){ 
        System.out.println("moverse hacia atras");
    }
}

