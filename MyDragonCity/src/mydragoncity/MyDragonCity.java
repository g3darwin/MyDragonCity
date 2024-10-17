/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mydragoncity;

/**
 *
 * @author Antonio
 */
public class MyDragonCity {
    
    public enum TipoDragon{
        
        TIERRA,
        FUEGO,
        AGUA,
        PLANTA,
        ELECTRICIDAD,
        HIELO
    }

    public static void main(String[] args) {

        Dragon d1 = new Dragon();
        Dragon d2 = new Dragon("Wallace", 1, 100, 190, 158, 35, 5, 
                                            "ICONO", TipoDragon.FUEGO);
        Dragon d3 = new Dragon(d1);
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        System.out.println("Nombre: " + d2.getNombre());
        System.out.println("Nivel: " + d2.getNivel());
        System.out.println("Precio: " + d2.getPrecio());
        System.out.println("Tipo: " + d2.getTipo());
        System.out.println("Vida: " + d2.getVida());
        System.out.println("Danio: " + d2.getDanio());
        System.out.println("Velocidad: " + d2.getVelocidad());
        System.out.println("Comida: " + d2.getComida());
        System.out.println("Icono: " + d2.getIcono());
        
        String nombre = "Steve";
        
        d2.setNombre(nombre);
        d2.setTipo(TipoDragon.TIERRA);
        System.out.println(" ");
        System.out.println("Nombre: " + d2.getNombre());
        System.out.println("Tipo: " + d2.getTipo());
        
        System.out.println(" ");
        System.out.println(d2);
        
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
    }
}
