/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static model.Dragon.COMIDA;
import static model.Dragon.DANIO;
import static model.Dragon.NIVEL;
import static model.Dragon.NOMBRE;
import static model.Dragon.VIDA;

/**
 *
 * @author Victus
 */
public class DragonAgua extends Dragon{
    
    public DragonAgua(String nombre, int nivel, int vida, int danio, int comida){
        
        super(nombre, nivel, vida, danio, comida);
    }
    
    public DragonAgua(){
        this(NOMBRE, NIVEL, VIDA, DANIO, COMIDA);
    }
    
    @Override
    public void alimentarDragon(){
        
        super.alimentarDragon();
        
        this.nadar();
    }
    
    public void nadar(){
        
        System.out.println("Nadando");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
