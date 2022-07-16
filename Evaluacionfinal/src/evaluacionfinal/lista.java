/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionfinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Gabo
 */
public class lista {
    
    nodo L;
    
    
    nodo insertar(nodo n, String val){
        
        if(L == null){
            L = new nodo(val);
            return L;
        
        } else if(n.siguiente == null) {
        
            n.siguiente = new nodo(val);
            return n.siguiente;
        } else{
        
            return insertar(n.siguiente,val);
        }
    
    }
    
    void read(String Nombref, lista list) throws IOException {

        FileReader fr = new FileReader(Nombref);
        BufferedReader br = new BufferedReader(fr);
        String linea;

        while ((linea = br.readLine()) != null) {

            String[] datos = linea.split(" ");
            for(int i=0;i<datos.length;i++){
            
                list.insertar(L, datos[i]);
            }
        }

    }
    
    String imprimir(nodo n){
        if (n.siguiente == null) {
            return n.contenido;
        }
        return n.contenido + "->" + imprimir(n.siguiente);
    }
    
}
