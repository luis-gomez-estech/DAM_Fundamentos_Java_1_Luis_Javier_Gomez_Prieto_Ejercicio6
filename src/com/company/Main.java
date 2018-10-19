package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaner = new Scanner (System.in);

        System.out.println("Introduce el primer número");
        int numero1 = escaner.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = escaner.nextInt();

        // Un numero es multiplo de otro cuando el resto de la division es igual a cero
        // Entonces segun he buscado en Google, en Java el resto de una division entre 2 numeros se representa asi, numero1%numero2

        int resto = numero1%numero2;

        //Por tanto si el resto es igual a cero imprimirá este mensaje en pantalla
        if (resto==0) {
            System.out.println("El número " + numero1 + " es múltiplo de " + numero2);
        }//y en caso de no ser igual a cero, imprimira este otro mensaje
        else {
            System.out.println("El número " + numero1 + " no es múltiplo de " + numero2);
        }
    }


}

