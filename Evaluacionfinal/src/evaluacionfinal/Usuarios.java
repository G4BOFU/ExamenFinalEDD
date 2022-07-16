/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionfinal;

/**
 *
 * @author Gabo
 */
public class Usuarios {
    
    String nombre;
    int valoracion;
    String experiencia;
    
    
    Usuarios(String nom, int val, String exp){
        this.nombre = nom;
        this.valoracion = val;
        this.experiencia = exp;
    
    }
    
     void mostrar(){
        System.out.println("Nombre: " + nombre + " Valoracion: " + valoracion + " Experiencia: " + experiencia); 
                        
    }
    
}
