/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mydragoncity;

/**
 *
 * @author Victus
 */
public class Habitat{
        
        //-----------------------------------------------------------------
        // Atributos
        //-----------------------------------------------------------------
        
        public static int PRECIO = 100;
        public static int EXP_OBTENIDA = 100;
        public static int MAX_DRAGONES = 2;
        public static String ICONO = "/img/habitat.png";
        
        private int precioCompra;
        private int experienciaObtenida;
        private int maxDragones;
        private String icono;
        private MyDragonCity.TipoDragon tipo;
        private Dragon dragon;
        
        
        //-----------------------------------------------------------------
        // Constructores
        //-----------------------------------------------------------------

        public Habitat(int precioCompra, int experienciaObtenida,
                            int maxDragones, String icono, Dragon dragon, 
                            MyDragonCity.TipoDragon tipo){
            
            this.precioCompra = precioCompra;
            this.experienciaObtenida = experienciaObtenida;
            this.maxDragones = maxDragones;
            this.icono = icono;
            this.dragon = dragon;
            this.tipo = tipo;
        }
        
        public Habitat(){
            
            this(0, 0, 0, null, null, null);
        }
        
        public Habitat(Habitat otro){
            
            this(otro.precioCompra, otro.experienciaObtenida,
                    otro.maxDragones, otro.icono, otro.dragon,
                    otro.tipo);
            
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
        
        public int getMaxDragones(){
            
            return maxDragones;
        }
        
        public String getIcono(){
            
            return icono;
        }
        
        public MyDragonCity.TipoDragon getTipo(){
            
            return tipo;
        }
        
        public Dragon getDragon(){
            
            return dragon;
        }
        
        public void setPrecioCompra(int precio){
            
            this.precioCompra = precio;
        }
        
        public void setExperiencia(int experiencia){
            
            this.experienciaObtenida = experiencia;
        }
        
        public void setMaxDragones(int maxDragones){
            
            this.maxDragones = maxDragones;
        }
        
        public void setIcono(String Icono){
        
            this.icono = Icono;
        }
        
        public void setDragon(Dragon dragon){
            
            this.dragon = dragon;
        }
        
        //-----------------------------------------------------------------
        // Overriden
        //-----------------------------------------------------------------

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Habitat{");
            sb.append("precioCompra=").append(precioCompra);
            sb.append(", experienciaObtenida=").append(experienciaObtenida);
            sb.append(", maxDragones=").append(maxDragones);
            sb.append(", icono=").append(icono);
            sb.append(", dragon=").append(dragon);
            sb.append(", tipo=").append(tipo);
            sb.append('}');
            return sb.toString();
        }
        
        //-----------------------------------------------------------------
        // Metodos
        //-----------------------------------------------------------------
        
        public void crearHabitat(){
            
            //cada habitat tiene un precio distinto
            
        }
        
        public void eliminarHabitat(){
            
            
        }
        
        public void aniadirDragon(Dragon dragon){
            
            
        }
        
        public void moverDragon(Dragon dragon){
            
            
        }
        
        public void moverHabitat(){
            
            
        }
        
        public void mejorarHabitat(){
        
            //aumenta el max_dragones a 4, exp_obtenida = 2500 y vale la mejora 1200 de oro
        }
        
        
    }
