/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenamiento;

import java.util.Scanner;

/**
 *
 * @author jonathan Antonio Cruz Araiza
 * gsi-1243
 */
public class MetodosOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int logitud;
        System.out.println("Introduce la logitud del areglo");
//        int resp;
        logitud= scanner.nextInt();        
        Arreglo a = new Arreglo(logitud);
        
        a.iniciaArreglo();
        a.imprimeArreglo();
        a.setDatos();
        a.quicksort(0, a.getlongitud());
        a.imprimeArreglo();
              
//        resp = a.BusquedaBinaria(7);
//        if (resp != -1) {
//            System.out.println("La posicion del numero que buscas es: " + resp);
//        } else {
//            System.out.println("el numero que buscas no existe dentro del areglo");
//      }
    }
}
