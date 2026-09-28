/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.interfase;

/**
 *
 * @author Usuario
 */
public class Concierto implements TocaMusica  {
    private String nombreEvento;
    private String lugar;

public Concierto(String nombreEvento, String lugar) {
    this.nombreEvento = nombreEvento;
    this.lugar = lugar;
}

@Override
public void tocar() {
    System.out.println("En " + nombreEvento + " (" + lugar + ") suena música por los parlantes.");
}
}
