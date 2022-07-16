/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionfinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Gabo
 */
public class cola {
    
    Clientessaime primero, ultimo;
    PrintWriter pw;
    int turno;
    
    
    
    
    public cola() {

        primero = null;
        ultimo = null;

    }
    
    boolean isEmpty() {
        return primero == null;

    }
    
    void insertar(String nom, int ced) {
        Clientessaime nuevo = new Clientessaime (nom, ced);
        if (isEmpty()) {
            primero = nuevo;
            ultimo = primero;

        } else {
            ultimo.sig = nuevo;
            ultimo = ultimo.sig;

        }

    }
    
    Clientessaime dequeue() throws IOException {

        if (!isEmpty()) {

            Clientessaime temp = new Clientessaime(primero.nombre, primero.cedula);
            primero = primero.sig;
            return temp;

        }
        System.out.println("No hay clientes en cola ");
        return null;

    }
    
    void read(String Nombref, cola col) throws IOException {

        FileReader fr = new FileReader(Nombref);
        BufferedReader br = new BufferedReader(fr);
        String linea;

        while ((linea = br.readLine()) != null) {

            String[] datos = linea.split("//");
            
            col.insertar(datos[0], Integer.parseInt(datos[1]));
            
        }

    }
    
    
    void cedulacion() throws IOException{
    
        pw = new PrintWriter(new FileWriter("Tramites.txt", true));
        
        turno++;    
        pw.println(turno + "cedulacion, tiempo de ejecucion: " + "15 minutos");
        pw.close();
        
    }
    
    void pasaporte() throws IOException{
    
        pw = new PrintWriter(new FileWriter("Tramites.txt", true));
        
        turno++;    
        pw.println(turno + "pasaporte, tiempo de ejecucion: " + "20 minutos");
        pw.close();
    }
    
    void documentos() throws IOException{
    
        pw = new PrintWriter(new FileWriter("Tramites.txt", true));
        
        turno++;    
        pw.println(turno + "retiro de documentos, tiempo de ejecucion: " + "3 minutos");
        pw.close();
    }
    
    
}
