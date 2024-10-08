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
    }
}
