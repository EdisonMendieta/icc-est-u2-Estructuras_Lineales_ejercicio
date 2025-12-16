package utils;

import java.util.Stack;

public class StackSorter {

    public void ordenarStack(Stack<Integer> stack){
        //Hacemos una pila auxiliar
        Stack<Integer> stackAuxi = new Stack<>();

        //Entrmos en un bucle hasta que la pila original se vacie
        while (!stack.isEmpty()) {
            //Hagaramos el primer elemento de la pila
            int auxi = stack.pop();

            /*Si la pila auxiliar esta vacia entoces ingreso de una el valor que tome de la pila
             *original,en caso de que hallamos elementos en la pila auxiliar entonces comparamos 
             *auxi con estos elementos, si el elemento es mayor entonces iremos sacando uno por uno
             *y devolviendolo a la pila original hasta que ya solo halla elemtos menores a auxi,
             *y repetimos este proceso hasta que la pila original este vacia, el proceso me recuerda 
             *a las toores de Hanoi.  
             */
            while (!stackAuxi.isEmpty() && stackAuxi.peek() < auxi) {
                stack.push(stackAuxi.pop());
                
            }
            //Aqui ingresamos el auxi a la pila auxiliar 
            stackAuxi.push(auxi);
        }

        /*Luego ingresamos los elementos de la pila auxiliar a la pila, el orden se invierte con 
         *respecto a la pila auxiliar(La pila axuiliar esta de mayor a menor )entonces la pila 
         *original estara de menor a mayor y viceversa
         */
        while (!stackAuxi.isEmpty()) {
            stack.push(stackAuxi.pop());
        }
        
    }
    
}
