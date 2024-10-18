/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mydragoncity;

/**
 *
 * @author Victus
 */
public class Jugador {
    
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    
    
    public static String NOMBRE = "";
    public static int NIVEL = 1;
    public static int ORO = 1000;
    public static int COMIDA = 200;
    
    private String nombre;
    private int nivel;
    private int oro;
    private int comida;
    
    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------
    
    public Jugador(String nombre, int nivel, int oro, int comida){
        
        this.nombre = nombre;
        this.nivel = nivel;
        this.oro = oro;
        this.comida = comida;
        
    }
    
    public Jugador(Jugador otro){
        
        this(otro.nombre, otro.nivel, otro.oro, otro.comida);
    }
    
    public Jugador(){
        
        this(NOMBRE, NIVEL, ORO, COMIDA);
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
    
    public int getOro(){
        
        return oro;
    }
    
    public int getComida(){
        
        return comida;
    }
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
    }
    
    public void setNivel(int nivel){
        
        this.nivel = nivel;
    }
    
    public void setOro(int oro){
        
        this.oro = oro;
    }
    
    public void setComida(int comida){
        
        this.comida = comida;
    }
    
    //-----------------------------------------------------------------
    // Overriden
    //-----------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jugador{");
        sb.append("nombre=").append(nombre);
        sb.append(", nivel=").append(nivel);
        sb.append(", oro=").append(oro);
        sb.append(", comida=").append(comida);
        sb.append('}');
        return sb.toString();
    }
    
    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------

    public void restarOro(int otro_oro){
        
        if(otro_oro > 0){
            
            oro -= otro_oro;
        }
    }
    
    public boolean mejorarHabitat(Habitat h1){
        
            int coste_mejora = 1200;
            boolean dinero_suf = oro >= coste_mejora;
            
            if(dinero_suf){
            
                restarOro(coste_mejora);
            
                int max_dragones = 4;
                int exp_obtenida = 2500;
                
                h1.setMaxDragones(max_dragones); 
                h1.setExperiencia(exp_obtenida);
                
                return true;
            }
            
            return false;
        }
}
