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
public class ejercicios {

    void ejericio1() {

        Usuarios[] usuarios = new Usuarios[5];
        
        usuarios[0] = new Usuarios("Silvestre Cardenas ",8," -satisfecho");
        usuarios[1] = new Usuarios("Andres Lopez ",1," -no satisfecho");
        usuarios[2] = new Usuarios("Andreina Gonzalez ",5," -neutro");
        usuarios[3] = new Usuarios("Maria Perez ",0," -el cliente no atendio ");
        usuarios[4] = new Usuarios("Armando Paredes ",10," -muy satisfecho");
        
        System.out.println("Aqui estan las experiencias de los clientes, y sus valoraciones:");
        
        usuarios[0].mostrar();
        usuarios[1].mostrar();
        usuarios[2].mostrar();
        usuarios[3].mostrar();
        usuarios[4].mostrar();
    }
    
    
    

}
