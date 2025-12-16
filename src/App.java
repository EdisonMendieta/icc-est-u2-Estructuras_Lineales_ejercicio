import java.util.Queue;
import java.util.Stack;

import utils.QueueUtils;
import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\nEjercicio 1");
        runSingValidator();
        System.out.println("\nEjercicio 2");
        runStackSorter();
        System.out.println("\nEjercicio 3");
        runQueuePalindrome();
    }

    private static void runSingValidator() {
        SignValidator signValidator = new SignValidator();
        String cadena1 = "{[()]}"; // VALIDO
        String cadena2 = "{[(])}"; // NO VALIDO

        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));
    }

    private static void runStackSorter() {
        StackSorter sortStack = new StackSorter();

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        System.out.println(stack);
        sortStack.ordenarStack(stack);
        System.out.println(stack); 
    }

    private static void runQueuePalindrome() {
        QueueUtils palindro = new QueueUtils();
        System.out.println("\ninput: ana ");
        System.out.println("output: " + palindro.isPalindromo("ana"));
        System.out.println("\ninput: radar ");
        System.out.println("output: " + palindro.isPalindromo("radar"));
        System.out.println("\ninput: java ");
        System.out.println("output: " + palindro.isPalindromo("java"));
    }
}
