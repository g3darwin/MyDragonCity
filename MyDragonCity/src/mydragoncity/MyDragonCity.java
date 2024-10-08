/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mydragoncity;

import java.util.Arrays;

/**
 *
 * @author Antonio
 */
public class MyDragonCity {
    
    public class Habitats{
        
        //Atributos
        
        public static int PRECIO = 100;
        public static int EXP_OBTENIDA = 100;
        public static String[] TIPO_ELEMENTOS = {"Tierra", "Fuego", "Agua", "Planta", "Electricidad", "Hielo"};
        public static int MAX_DRAGONES = 2;
        public static String ICONO = "";
        
        private int precioCompra;
        private int experienciaObtenida;
        private String[] tipoElementos;
        private int maxDragones;
        private String icono;
        
        
        //Constructores
        
        public Habitats(int precioCompra, int experienciaObtenida, String[] tipoElementos, int maxDragones, String icono){
            
            this.precioCompra = precioCompra;
            this.experienciaObtenida = experienciaObtenida;
            this.tipoElementos = tipoElementos;
            this.maxDragones = maxDragones;
            this.icono = icono;
        }
        
        public Habitats(){
        }
        
        public Habitats(Habitats otro){
            
            this.precioCompra = otro.precioCompra;
            this.experienciaObtenida = otro.experienciaObtenida;
            this.tipoElementos = otro.tipoElementos;
            this.maxDragones = otro.maxDragones;
            this.icono = otro.icono;
        }
        
        //Getters y Setters
        
        public int getPrecioCompra(){
            
            return precioCompra;
        }
        
        public int getExperiencia(){
            
            return experienciaObtenida;
        }
        
        public String[] getElementos(){
            
            return tipoElementos;
        }
        
        public int getMaxDragones(){
            
            return maxDragones;
        }
        
        public String getIcono(){
            
            return icono;
        }
        
        public void setPrecioCompra(int precio){
            
            this.precioCompra = precio;
        }
        
        public void setExperiencia(int experiencia){
            
            this.experienciaObtenida = experiencia;
        }
        
        public void setElementos(String[] elementos){
        
            this.tipoElementos = elementos;
        }
        
        public void setMaxDragones(int maxDragones){
            
            this.maxDragones = maxDragones;
        }
        
        public void setIcono(String Icono){
        
            this.icono = Icono;
        }
    }
    
    public static void main(String[] args) {
        
        MyDragonCity dragonCity = new MyDragonCity();
        String[] tipos = {"Tierra", "Fuego", "Agua", "Planta", "Electricidad", "Hielo"};
        
        Habitats h1 = dragonCity.new Habitats();
        Habitats h2 = dragonCity.new Habitats(100, 100, tipos, 2, Habitats.ICONO);
        Habitats h3 = dragonCity.new Habitats(h1);
        
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        
        System.out.println("Precio: " + h2.getPrecioCompra());
        System.out.println("Experiencia: " + h2.getExperiencia());
        System.out.println("Tipos de Elementos: " + Arrays.toString(h2.getElementos()));
        System.out.println("Maximo de Dragones: " + h2.getMaxDragones());
        System.out.println("Icono: " + h2.getIcono());      
    }
}
