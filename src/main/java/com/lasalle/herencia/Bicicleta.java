/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.herencia;

/**
 *
 * @author Usuario
 */
public class Bicicleta extends Mediodetransporte {
    private String pedales;
    private String sillin;
    private String manillar;
    private String vielas; 
    public Bicicleta(String marca, String tamaño, String placa,
                      String pedales, String sillin, String manillar, String ruedas) {
        super(marca, tamaño, placa);
        this.pedales = pedales;
        this.sillin = sillin;
        this.manillar = manillar;
        this.vielas = ruedas;
    }
}
