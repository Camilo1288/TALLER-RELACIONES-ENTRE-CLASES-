/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lasalle.asociacion;
import java.util.List; 
import java.util.ArrayList; 
/**
 *
 * @author Usuario
 */
public class Juego {

    private String nombre;
    private String categoria;
    private List<Persona> jugadores = new ArrayList<>();

    public Juego(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void agregarJugador(Persona p) {
        jugadores.add(p);
    }

    public List<Persona> getJugadores() {
        return jugadores;
    }
}
