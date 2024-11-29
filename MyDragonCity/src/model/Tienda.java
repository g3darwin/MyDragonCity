/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victus
 */
public class Tienda {
    
    private List<Dragon> dragones;
    private List<Habitat> habitats;

    public Tienda() {
        this.dragones = new ArrayList<>();
        this.habitats = new ArrayList<>();
        crearInventario();
    }
    
    private void crearInventario(){
        
        dragones.add(new Dragon(" ", 1, 100, 120, 158, 35, 5, 
                                            "/img/dragones/Dragon tierra bebe.png",
                                            TipoDragon.TIERRA, null));
        dragones.add(new Dragon(" ", 1, 100, 120, 158, 35, 5, 
                                            "/img/dragones/Dragon_fuego.png",
                                            TipoDragon.FUEGO, null));
        dragones.add(new Dragon(" ", 1, 100, 120, 158, 35, 5, 
                                            "/img/dragones/dragon_agua.png",
                                            TipoDragon.AGUA, null));
        dragones.add(new Dragon(" ", 1, 100, 120, 158, 35, 5, 
                                            "/img/dragones/dragon_planta.png",
                                            TipoDragon.PLANTA, null));
        dragones.add(new Dragon(" ", 1, 100, 120, 158, 35, 5, 
                                            "/img/dragones/dragon_hielo.png",
                                            TipoDragon.HIELO, null));
        dragones.add(new Dragon(" ", 1, 100, 120, 158, 35, 5, 
                                            "/img/dragones/dragon_electrico.png",
                                            TipoDragon.ELECTRICIDAD, null));
        
        
        habitats.add(new Habitat(100, 100, 2, "/img/utilidades/habitat_arena.png", TipoDragon.TIERRA));
        habitats.add(new Habitat(100, 100, 2, "/img/utilidades/habitat_fuego.png", TipoDragon.FUEGO));
        habitats.add(new Habitat(100, 100, 2, "/img/utilidades/habitat_agua.png", TipoDragon.AGUA));
        habitats.add(new Habitat(100, 100, 2, "/img/utilidades/habitat_planta.png", TipoDragon.PLANTA));
        habitats.add(new Habitat(100, 100, 2, "/img/utilidades/habitat_hielo.png", TipoDragon.HIELO));
        habitats.add(new Habitat(100, 100, 2, "/img/utilidades/habitat_electrico.png", TipoDragon.ELECTRICIDAD));
    }
    
    public void mostrarDragones() {
        System.out.println("\nDragones disponibles:");
        for (int i = 0; i < dragones.size(); i++) {
            Dragon dragon = dragones.get(i);
            System.out.println((i + 1) + ". " + dragon.getTipo() + " - Precio: " + dragon.getPrecio() + " monedas");
        }
    }
    
    public void mostrarHabitats() {
        System.out.println("\nHábitats disponibles:");
        for (int i = 0; i < habitats.size(); i++) {
            Habitat habitat = habitats.get(i);
            System.out.println((i + 1) + ". " + habitat.getTipo() + " - Precio: " + habitat.getPrecioCompra() + " monedas");
        }
    }
    
    public int comprarDragon(int indice, int oro) {
        if (indice < 1 || indice > dragones.size()) {
            System.out.println("\nOpción inválida. Por favor, selecciona un dragón existente.");
            return oro;
        }

        Dragon dragon = dragones.get(indice - 1);
        if (oro >= dragon.getPrecio()) {
            System.out.println("\n¡Has comprado un dragon tipo " + dragon.getTipo() + " por " + dragon.getPrecio() + " monedas!");
            return oro - dragon.getPrecio();
        } else {
            System.out.println("\nNo tienes suficientes monedas para comprar este dragón.");
            return oro;
        }
    }
    
    public int comprarHabitat(int indice, int oro) {
        if (indice < 1 || indice > habitats.size()) {
            System.out.println("\nOpción inválida. Por favor, selecciona un hábitat existente.");
            return oro;
        }

        Habitat habitat = habitats.get(indice - 1);
        if (oro >= habitat.getPrecioCompra()) {
            System.out.println("\n¡Has comprado un habitat tipo " + habitat.getTipo() + " por " + habitat.getPrecioCompra() + " monedas!");
            return oro - habitat.getPrecioCompra();
        } else {
            System.out.println("\nNo tienes suficientes monedas para comprar este hábitat.");
            return oro;
        }
    }

    public List<Dragon> getDragones() {
        return dragones;
    }

    public void setDragones(List<Dragon> dragones) {
        this.dragones = dragones;
    }

    public List<Habitat> getHabitats() {
        return habitats;
    }

    public void setHabitats(List<Habitat> habitats) {
        this.habitats = habitats;
    }

    @Override
    public String toString() {
        return "Tienda{" + "dragones=" + dragones + ", habitats=" + habitats + '}';
    }
}
