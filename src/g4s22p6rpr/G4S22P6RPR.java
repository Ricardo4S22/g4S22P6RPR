/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s22p6rpr;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ABIGAILSOFIA
 */
public class G4S22P6RPR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> lista = new ArrayList<String>(Arrays.asList("A","B", "C", "D", "E"));
        lista.forEach(Contenido -> {
        System.out.println("El Valor Contenido es:" + Contenido);
    });
        
        lista.add("F");
        lista.add("G");
        
        System.out.println("\n Segunda forma de trabajar recorridos de listas \n");
        
        for(String Contenido1: lista){
            System.out.println("El Valor contenido es:" + Contenido1);
        }
        lista.add("Ricardo");
        lista.add("Esta es una linea muy larga");
        lista.add("Rosas");
        lista.add("Segunda linea muy larga sin problemas de almacenamiento");
        
        System.out.println("\n Tercera forma de trabajar recorridos de listas \n");
        lista.stream().forEach(Contenido2 -> {
           System.out.println("El Valor contendo es:" + Contenido2);
        });
        }
    }  
