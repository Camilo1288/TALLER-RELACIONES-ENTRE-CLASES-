/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lasalle.herencia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Herencia {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
     System.out.println("--- Datos del automóvil ---");
        System.out.print("Marca: ");
        String marcaAuto = sc.nextLine();
        System.out.print("Tamaño: ");
        String tamanoAuto = sc.nextLine();
        System.out.print("Placa: ");
        String placaAuto = sc.nextLine();
        System.out.print("Puertas: ");
        String puertas = sc.nextLine();
        System.out.print("Ventanas: ");
        String ventanas = sc.nextLine();
        System.out.print("Parabrisas: ");
        String parabrisas = sc.nextLine();
        System.out.print("Palanca: ");
        String palanca = sc.nextLine();
 
        Automovil miAuto = new Automovil(marcaAuto, tamanoAuto, placaAuto,
                puertas, ventanas, parabrisas, palanca);
 
        System.out.println("\n--- Datos de la bicicleta ---");
        System.out.print("Marca: ");
        String marcaBici = sc.nextLine();
        System.out.print("Tamaño: ");
        String tamanoBici = sc.nextLine();
        System.out.print("Placa: ");
        String placaBici = sc.nextLine();
        System.out.print("Pedales: ");
        String pedales = sc.nextLine();
        System.out.print("Sillín: ");
        String sillin = sc.nextLine();
        System.out.print("Manillar: ");
        String manillar = sc.nextLine();
        System.out.print("Ruedas: ");
        String ruedas = sc.nextLine();
 
        Bicicleta miBici = new Bicicleta(marcaBici, tamanoBici, placaBici,
                pedales, sillin, manillar, ruedas);
 
        System.out.println("\n--- Probando el automóvil (métodos heredados de Mediodetransporte) ---");
        miAuto.arrancar();
        miAuto.moversehacielfrente();
        miAuto.giraraladerecha();
        miAuto.frenar();
 
        System.out.println("\n--- Probando la bicicleta (métodos heredados de Mediodetransporte) ---");
        miBici.arrancar();
        miBici.moversehacielfrente();
        miBici.giraralaizquierda();
        miBici.frenar();
 
        sc.close();
    }
}
