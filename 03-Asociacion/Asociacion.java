/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lasalle.asociacion;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Asociacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Datos del juego 1 ---");
        System.out.print("Nombre del juego: ");
        String nombreJuego1 = sc.nextLine();
        System.out.print("Categoria: ");
        String categoriaJuego1 = sc.nextLine();
        Juego juego1 = new Juego(nombreJuego1, categoriaJuego1);

        System.out.println("\n--- Datos del juego 2 ---");
        System.out.print("Nombre del juego: ");
        String nombreJuego2 = sc.nextLine();
        System.out.print("Categoria: ");
        String categoriaJuego2 = sc.nextLine();
        Juego juego2 = new Juego(nombreJuego2, categoriaJuego2);

        System.out.println("\n--- Datos de la persona 1 ---");
        System.out.print("Nombre: ");
        String nombrePersona1 = sc.nextLine();
        Persona persona1 = new Persona(nombrePersona1);

        System.out.println("\n--- Datos de la persona 2 ---");
        System.out.print("Nombre: ");
        String nombrePersona2 = sc.nextLine();
        Persona persona2 = new Persona(nombrePersona2);

        // Aquí se arma la relación muchos a muchos
        persona1.jugar(juego1);
        persona1.jugar(juego2);
        persona2.jugar(juego1);

        System.out.println("\n--- Resultados ---");
        System.out.println(persona1.getNombre() + " juega:");
        for (Juego j : persona1.getJuegos()) {
            System.out.println(" - " + j.getNombre());
        }

        System.out.println(persona2.getNombre() + " juega:");
        for (Juego j : persona2.getJuegos()) {
            System.out.println(" - " + j.getNombre());
        }

        System.out.println("Jugadores de " + juego1.getNombre() + ":");
        for (Persona p : juego1.getJugadores()) {
            System.out.println(" - " + p.getNombre());
        }

        sc.close();
    
    }
}
