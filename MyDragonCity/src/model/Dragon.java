/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Victus
 */
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
        private TipoDragon habitat;
        
        
        //-----------------------------------------------------------------
        // Constructores
        //-----------------------------------------------------------------

        public Dragon(String nombre, int nivel, int precio, int vida, int danio, 
                int velocidad, int comida, String icono, TipoDragon tipo, TipoDragon habitat){
                        
            
            this.nombre = nombre;
            this.nivel = nivel;
            this.precio = precio;
            this.vida = vida;
            this.danio = danio;
            this.velocidad = velocidad;
            this.comida = comida;
            this.icono = icono;
            this.tipo = tipo;
            this.habitat = habitat;
        }
        
        public Dragon(Dragon otro){
            
            this(otro.nombre, otro.nivel, otro.precio, otro.vida, otro.danio,
                    otro.velocidad, otro.comida, otro.icono, otro.tipo, otro.habitat);
        }
        
        public Dragon(){
            
            this( NOMBRE, NIVEL, PRECIO, VIDA, DANIO, 
                    VELOCIDAD, COMIDA, ICONO, null, null);
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
        
        public TipoDragon getHabitat(){
            
            return habitat;
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
        
        public void setHabitat(TipoDragon habitat){
            
            this.habitat = habitat;
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
            sb.append(", habitat=").append(habitat);
            sb.append('}');
            return sb.toString();
        }
        
    }
