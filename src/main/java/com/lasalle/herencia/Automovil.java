/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.herencia;

/**
 *
 * @author Usuario
 */
public class Automovil extends Mediodetransporte {
    private String placa;
    private String puertas;
    private String ventanas;
    private String parabrisas;
    private String palanca; 
    public Automovil(String marca, String tamaño, String placa,
                      String puertas, String ventanas, String parabrisas, String palanca) {
        super(marca, tamaño, placa);
        this.puertas = puertas;
        this.ventanas = ventanas;
        this.parabrisas = parabrisas;
        this.palanca = palanca;
    }
}
