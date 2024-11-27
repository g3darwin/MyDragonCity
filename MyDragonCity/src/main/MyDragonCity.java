/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import model.Dragon;
import model.Habitat;
import model.Jugador;
import model.TipoDragon;
import view.MainView;

/**
 *
 * @author Antonio
 */
public class MyDragonCity {

    public static void main(String[] args) {
        
        Dragon d1 = new Dragon("Steve", 5, 100, 190, 158, 35, 5, 
                                            "/img/dragones/Dragon tierra bebe.png",
                                            TipoDragon.TIERRA, null);
        Dragon d2 = new Dragon("Loche", 10, 100, 190, 158, 35, 5, 
                                            "/img/dragones/Dragon_fuego.png",
                                            TipoDragon.FUEGO, null);
        Dragon d3 = new Dragon("Dave", 6, 100, 190, 158, 35, 5, 
                                            "/img/dragones/Bebe-dragon-barro.png",
                                            TipoDragon.TIERRA, null);
        Dragon d4 = new Dragon("Bitz", 8, 100, 190, 158, 35, 5, 
                                            "/img/dragones/Flaming_Rock_Dragon.png",
                                            TipoDragon.FUEGO, null);
        
        Habitat h1 = new Habitat(100, 100, 2, Habitat.ICONO, TipoDragon.FUEGO);
        Habitat h2 = new Habitat(100, 100, 2, Habitat.ICONO, TipoDragon.TIERRA);
        
        h1.aniadirDragon(d2);
        h1.aniadirDragon(d4);
        h2.aniadirDragon(d1);
        h2.aniadirDragon(d3);
       
        System.out.println(" ");
        System.out.println(h1);
        System.out.println(" ");
        System.out.println(h2);
        
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador("Player 2", 5, 0, 10000, 5000);
        Jugador j3 = new Jugador(j2);
        
        System.out.println(" ");
        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
        
        /*
        
        System.out.println("Nombre: " + j2.getNombre());
        System.out.println("Nivel: " + j2.getNivel());
        System.out.println("Oro: " + j2.getOro());
        System.out.println("Comida: " + j2.getComida());
        
        j2.mejorarHabitat(h2);
        
        System.out.println(" ");
        System.out.println(h2);
        System.out.println(" ");
        System.out.println(j2);
        
        */
        /*
        
        Habitat h1 = new Habitat();
        Habitat h2 = new Habitat(100, 100, 2, Habitat.ICONO, d2, TipoDragon.TIERRA);
        Habitat h3 = new Habitat(h1);
        
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        
        System.out.println("Precio: " + h2.getPrecioCompra());
        System.out.println("Experiencia: " + h2.getExperiencia());
        System.out.println("Maximo de Dragones: " + h2.getMaxDragones());
        System.out.println("Icono: " + h2.getIcono());
        System.out.println("Tipo de Habitat: " + h2.getTipo());
        
        h2.setPrecioCompra(150);
        System.out.println("Precio: " + h2.getPrecioCompra());
        
        h2.setExperiencia(200);
        System.out.println("Experiencia: " + h2.getExperiencia());

        System.out.println(h2);

        */
        
        System.out.println(" ");
        System.out.println(h1.getMejorDragon());
        System.out.println(" ");
        System.out.println();
        
        MainView pantalla = new MainView(h2.getDragones(), h1.getDragones());
        pantalla.setVisible(true);
    }
}
