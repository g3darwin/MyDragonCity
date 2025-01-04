/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Victus
 */
public class DragonTierra extends Dragon{
    
    public DragonTierra(String nombre, int nivel, int vida, int danio, int comida){
        
        super(nombre, nivel, vida, danio, comida);
    }
    
    public DragonTierra(){
        this(NOMBRE, NIVEL, VIDA, DANIO, COMIDA);
    }
    
    @Override
    public void alimentarDragon(){
        
        super.alimentarDragon();
        
        this.excavar();
    }
    
    public void excavar(){
        
        System.out.println("Excavando");
    }

    @Override
    public String toString() {
        return super.toString();
    }  

}
