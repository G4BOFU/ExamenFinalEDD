/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionfinal;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gabo
 */
public class Evaluacionfinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        ejercicios ej = new ejercicios();
        Scanner leer = new Scanner(System.in);
        lista l = new lista();
        int eleccion;
        cola c  = new cola();
        int opcion;

        System.out.println("Ejericios de examen final: ");
        System.out.println("1--- Ejericio 1");
        System.out.println("2--- Ejercicio 2");
        System.out.println("3--- Ejercicio 3");
        eleccion = leer.nextInt();
        switch (eleccion) {
            case 1:
                ej.ejericio1();

                break;
            case 2:
                l.read("texto.in", l);
                System.out.println("texto ->" + l.imprimir(l.L));

                break;
            case 3:
                c.read("cola.in", c);
                System.out.println("Bienvenido al centro de atencion de SAIME");
                System.out.println("Clientes en cola! ");
                System.out.println("Digite una de las opciones");
                System.out.println("1--- Cedulacion");
                System.out.println("2--- Pasaporte");
                System.out.println("3--- Retirar documentos");
                System.out.println("4--- Salir");
                    
                opcion = leer.nextInt();
                do {switch(opcion){
                    case 1:
                        c.cedulacion();
                        c.dequeue();
                        break;
                    case 2:
                        c.pasaporte();
                        c.dequeue();
                        break;
                    case 3:
                        c.documentos();
                        c.dequeue();
                        break;
                
                } 
                break;
        }while(opcion !=4);

    }

}}
