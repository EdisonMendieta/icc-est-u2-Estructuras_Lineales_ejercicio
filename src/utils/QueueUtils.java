package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {
    
    public boolean isPalindromo(String caracter){

        char[] caracteres = caracter.toCharArray();
        Queue<Character> colaOriginal = new LinkedList<>();
        Queue<Character> colaInvertida = new LinkedList<>();
        Queue<Character> colaAuxi = new LinkedList<>();

        //validamos que no sea null
        if (caracter == null) 
            return false;

        //Ingresamos los caracteres a la cola
        for (char c : caracteres) {
            colaOriginal.add(c);
            colaAuxi.offer(c);
        }
        //Invertimos el orden de los carcteres
        while (!colaAuxi.isEmpty()) {

            for (int i = 0; i < colaAuxi.size() - 1; i++) {
                colaAuxi.offer(colaAuxi.poll());
            }
            colaInvertida.offer(colaAuxi.poll());
        }

        //comparamos y eliminamos el primer elemento de las dos colas 
        while (!colaOriginal.isEmpty()) {

            boolean igual = colaOriginal.poll().equals(colaInvertida.poll());
            
            //si dos elementos no son iguales retorna falso
            if (!igual) {
                return false;
            }
        }

        return true;

    }
}
