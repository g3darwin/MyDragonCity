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
    
    public enum TipoDragon{
        
        TIERRA,
        FUEGO,
        AGUA,
        PLANTA,
        ELECTRICIDAD,
        HIELO
    }
    
    public class Habitats{
        
        //-----------------------------------------------------------------
        // Atributos
        //-----------------------------------------------------------------
        
        public static int PRECIO = 100;
        public static int EXP_OBTENIDA = 100;
        public static String[] TIPO_ELEMENTOS = {"Tierra", "Fuego", "Agua", "Planta", "Electricidad", "Hielo"};
        public static int MAX_DRAGONES = 2;
        public static String ICONO = "/img/habitat.png";
        
        private int precioCompra;
        private int experienciaObtenida;
        private String[] tipoElementos;
        private int maxDragones;
        private String icono;
        private TipoDragon tipo;
        
        
        //-----------------------------------------------------------------
        // Constructores
        //-----------------------------------------------------------------

        public Habitats(int precioCompra, int experienciaObtenida, String[] tipoElementos,
                            int maxDragones, String icono, TipoDragon tipo){
            
            this.precioCompra = precioCompra;
            this.experienciaObtenida = experienciaObtenida;
            this.tipoElementos = tipoElementos;
            this.maxDragones = maxDragones;
            this.icono = icono;
            this.tipo = tipo;
        }
        
        public Habitats(){
            
            this(0, 0, null, 0, null, null);
        }
        
        public Habitats(Habitats otro){
            
            this(otro.precioCompra, otro.experienciaObtenida, 
                    otro.tipoElementos, otro.maxDragones, otro.icono, otro.tipo);
            
        }            
        
        //-----------------------------------------------------------------
        // Getters & Setters
        //-----------------------------------------------------------------

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
        
        public TipoDragon getTipo(){
            
            return tipo;
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
        
        //-----------------------------------------------------------------
        // Overriden
        //-----------------------------------------------------------------

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Habitats{");
            sb.append("precioCompra=").append(precioCompra);
            sb.append(", experienciaObtenida=").append(experienciaObtenida);
            sb.append(", tipoElementos=").append(Arrays.toString(tipoElementos));
            sb.append(", maxDragones=").append(maxDragones);
            sb.append(", icono=").append(icono);
            sb.append(", tipo=").append(tipo);
            sb.append('}');
            return sb.toString();
        }
    }
    
    public class Dragon{

        //-----------------------------------------------------------------
        // Atributos
        //-----------------------------------------------------------------

        public static String NOMBRE = "Dave";
        public static int NIVEL = 1;
        public static int PRECIO = 100;
        public static int VIDA = 190;
        public static int DANIO = 158;
        public static int VELOCIDAD = 35;
        public static int COMIDA = 5;
        public static String ICONO = "/img/dragon.png";
        
        private String nombre;
        private int nivel;
        private int precio;
        private int vida;
        private int danio;
        private int velocidad;
        private int comida;
        private String icono;
        private TipoDragon tipo;
        
        
        //-----------------------------------------------------------------
        // Constructores
        //-----------------------------------------------------------------

        public Dragon(String nombre, int nivel, int precio, int vida, int danio, 
                int velocidad, int comida, String icono, TipoDragon tipo){
                        
            
            this.nombre = nombre;
            this.nivel = nivel;
            this.precio = precio;
            this.vida = vida;
            this.danio = danio;
            this.velocidad = velocidad;
            this.comida = comida;
            this.icono = icono;
            this.tipo = tipo;
        }
        
        public Dragon(Dragon otro){
            
            this(otro.nombre, otro.nivel, otro.precio, otro.vida, otro.danio,
                    otro.velocidad, otro.comida, otro.icono, otro.tipo);
        }
        
        public Dragon(){
            
            this( "", 0, 0, 0, 0, 0, 0, "", null);
        }
        
        //-----------------------------------------------------------------
        // Getters & Setters
        //-----------------------------------------------------------------
        
        public String getNombre(){
            
            return nombre;
        }
        
        public int getNivel(){
            
            return nivel;
        }
        
        public int getPrecio(){
            
            return precio;
        }
        
        public int getVida(){
            
            return vida;
        }
        
        public int getDanio(){
            
            return danio;
        }
        
        public int getVelocidad(){
            
            return velocidad;
        }
        
        public int getComida(){
            
            return comida;
        }
        
        public String getIcono(){
            
            return icono;
        }
        
        public TipoDragon getTipo(){
            
            return tipo;
        }
        
         public void setNombre(String nombre){
            
            this.nombre = nombre;
        }
         
         public void setNivel(int nivel){
            
            this.nivel = nivel;
        }
        
        public void setPrecio(int precio){
            
            this.precio = precio;
        }
        
        public void setVida(int vida){
            
            this.vida = vida;
        }
        
        public void setDanio(int danio){
            
            this.danio = danio;
        }
        
        public void setVelocidad(int velocidad){
            
            this.velocidad = velocidad;
        }
        
        public void setComida(int comida){
            
            this.comida = comida;
        }
        
        public void setIcono(String icono){
            
            this.icono = icono;
        }
        
        public void setTipo(TipoDragon tipo){
            
            this.tipo = tipo;
        }
        
        //-----------------------------------------------------------------
        // Overriden
        //-----------------------------------------------------------------
        
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Dragon{");
            sb.append("nombre=").append(nombre);
            sb.append(", nivel=").append(nivel);
            sb.append(", precio=").append(precio);
            sb.append(", vida=").append(vida);
            sb.append(", danio=").append(danio);
            sb.append(", velocidad=").append(velocidad);
            sb.append(", comida=").append(comida);
            sb.append(", icono=").append(icono);
            sb.append(", tipo=").append(tipo);
            sb.append('}');
            return sb.toString();
        }
        
    }

    public static void main(String[] args) {
        
        MyDragonCity dragonCity = new MyDragonCity();
        String[] tipos = {"Tierra", "Fuego", "Agua", "Planta", "Electricidad", "Hielo"};
        
        Habitats h1 = dragonCity.new Habitats();
        Habitats h2 = dragonCity.new Habitats(100, 100, tipos, 2, Habitats.ICONO, TipoDragon.TIERRA); //CAMBIAR TipoDragon
        Habitats h3 = dragonCity.new Habitats(h1);
        
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        
        System.out.println("Precio: " + h2.getPrecioCompra());
        System.out.println("Experiencia: " + h2.getExperiencia());
        System.out.println("Tipos de Elementos: " + Arrays.toString(h2.getElementos()));
        System.out.println("Maximo de Dragones: " + h2.getMaxDragones());
        System.out.println("Icono: " + h2.getIcono());
        System.out.println("Tipo de Habitat: " + h2.getTipo());
        
        h2.setPrecioCompra(150);
        System.out.println("Precio: " + h2.getPrecioCompra());
        
        h2.setExperiencia(200);
        System.out.println("Experiencia: " + h2.getExperiencia());
        
        String[] tipos2 = {"Tierra", "Fuego", "Agua", "Planta", "Electricidad", 
                            "Hielo", "Luz", "Oscuridad"};
        
        h2.setElementos(tipos2);
        System.out.println("Tipos de Elementos: " + Arrays.toString(h2.getElementos()));
        
        System.out.println(h2);
        
        
        Dragon d1 = dragonCity.new Dragon();
        Dragon d2 = dragonCity.new Dragon("Wallace", 1, 100, 190, 158, 35, 5, 
                                            "ICONO", TipoDragon.FUEGO);
        Dragon d3 = dragonCity.new Dragon(d1);
        
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
    }
}
