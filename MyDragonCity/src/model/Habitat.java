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
        private TipoDragon tipo;
        private List<Dragon> dragones;
        
        
        //-----------------------------------------------------------------
        // Constructores
        //-----------------------------------------------------------------

        public Habitat(int precioCompra, int experienciaObtenida,
                            int maxDragones, String icono, 
                            TipoDragon tipo){
            
            this.precioCompra = precioCompra;
            this.experienciaObtenida = experienciaObtenida;
            this.maxDragones = maxDragones;
            this.icono = icono;
            this.tipo = tipo;
            this.dragones = new ArrayList<>();
        }
        
        public Habitat(){
            
            this(PRECIO, EXP_OBTENIDA, MAX_DRAGONES, ICONO, null);
        }
        
        public Habitat(Habitat otro){
            
            this(otro.precioCompra, otro.experienciaObtenida, 
                    otro.maxDragones, otro.icono, otro.tipo);
            
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
        
        public TipoDragon getTipo(){
            
            return tipo;
        }

        public List<Dragon> getDragones(){
            
            return dragones;
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
        
        public void addDragon(Dragon dragon){
            
            this.dragones.add(dragon);
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
            sb.append(", tipo=").append(tipo);
            sb.append(", lista=").append(dragones);
            sb.append('}');
            return sb.toString();
        }
        
        //-----------------------------------------------------------------
        // Metodos
        //-----------------------------------------------------------------
        
        public boolean aniadirDragon(Dragon dragon){
            
            if(dragones.size() < maxDragones && tipo == dragon.getTipo()){
               
                TipoDragon habitat = dragon.getTipo();
                dragones.add(dragon);
                dragon.setHabitat(habitat);
                
                System.out.println("Dragon "+dragon.getNombre()+" añadido");
                
                return true;
                
            }else{
                
                System.out.println("No ha sido posible, diferente tipo");
                
                return false;
            }
        }
        
        public void moverDragon(Dragon dragon, Habitat h1, Habitat h2){
            
            TipoDragon tipo = null;
            TipoDragon habitat;
            
            if(h2.dragones.size() < maxDragones && dragon.getTipo() == h2.tipo
                     && !h1.dragones.isEmpty()){
                
                h1.dragones.remove(dragon);
                h2.dragones.add(dragon);
                
                if(h2.getTipo() == tipo.FUEGO){
                    habitat = tipo.FUEGO;
                    dragon.setHabitat(habitat);
                }else if(h2.getTipo() == tipo.TIERRA){
                    habitat = tipo.TIERRA;
                    dragon.setHabitat(habitat);
                }
                
                System.out.println("Dragon "+dragon.getNombre()+" transladado con exito");
                
            }else{
                
                System.out.println("No ha sido posible la accion");
            }
        }
    }
