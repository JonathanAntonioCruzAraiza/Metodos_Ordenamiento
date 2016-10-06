/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenamiento;

import java.util.Scanner;

/**
 *
 * @author jonathana Antonio Cruz Araiza
 */
public class Arreglo {

    private static int Partition(int[] arr, int left, int right) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int numeros[];

    Arreglo(int tam) {
        numeros = new int[tam];
    }

    public int getlongitud() {

        return numeros.length - 1;
    }

    public void iniciaArreglo() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = -1;
        }
    }

    public void imprimeArreglo() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero[" + i + "] = " + numeros[i] + "\n");
        }

    }

    public void setDatos() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("insertar un dato");
            numeros[i] = teclado.nextInt();
        }
    }

    public int busquedaSecuencia(int numb) {

        int post = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numb) {
                post = i;
            }
        }
        return post;
    }

    public int BusquedaBinaria(int a) {
        int centro;
        int primer = 0;
        int ultimo = numeros.length - 1;
        int vCentro;
        int post = -1;
        for (int i = 0; i < numeros.length; i++) {

            centro = (primer + ultimo) / 2;
            vCentro = numeros[centro];

            if (a == vCentro) {
                return centro;
            } else if (a < vCentro) {
                ultimo = centro - 1;
            } else {
                primer = centro + 1;
            }
        }

        return post;
    }

    public void burbuja() {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int b = 0; b < numeros.length - 1; b++) {
                if (numeros[b] > numeros[b + 1]) {
                    int cambio = numeros[b + 1];
                    numeros[b + 1] = numeros[b];
                    numeros[b] = cambio;
                }
            }
        }
    }

    public void shell() {
        int salto;
        int aux;
        for (salto = numeros.length / 2; salto != 0; salto /= 2) {
            for (int r = 0; r < numeros.length; r++) {
                for (int i = salto; i < numeros.length; i++) {
                    if (numeros[i - salto] > numeros[i]) {
                        aux = numeros[i];
                        numeros[i] = numeros[i - salto];
                        numeros[i - salto] = aux;
                    }
                }
            }
        }
    }

    public void quicksort(int inicio, int termino) {

        int pivote = numeros[inicio];
        int principio = inicio;
        int fin = termino;
        int cambio;

        while (principio < fin) {
            while (numeros[principio] <= pivote && principio < fin) {
                principio++;
            }
            while (numeros[fin] > pivote) {
                fin--;
            }
            if (principio < fin) {
                cambio = numeros[principio];
                numeros[principio] = numeros[fin];
                numeros[fin] = cambio;
            }
        }
        numeros[inicio] = numeros[fin];
        numeros[fin] = pivote;
        if (inicio < fin - 1) {
            quicksort(inicio, fin - 1);
        }
        if (fin + 1 < termino) {
            quicksort(fin + 1, termino);
        }
    }

}
