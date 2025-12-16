## Práctica: Estructuras de Datos – Lineales

### Estudiante: 
Edison Jahir Mendieta Armijos
### Fecha:
15 / 12 /2025
### Curso:
Estructura de datos Grupo - 1 - Computación - CUE


### Instruciones

src/

├── utils/

│      ├── SignValidator.java

│    ├── StackSorter.java

│    └── QueueUtils.java

└── Main.java

### Ejercicio 01: Validación de Signos
Implementar un algoritmo en Java que determine si un String que contiene únicamente los caracteres:

( ) { } [ ]
es válido, considerando que:

Todo símbolo de apertura debe cerrarse.
Los símbolos deben cerrarse en el orden correcto.
Cada símbolo de cierre debe corresponder al tipo correcto de apertura.
Descripción del problema
Dado un String, se debe verificar si la secuencia de signos está correctamente balanceada.

Ejemplos
Input:  "([]){}"

Output: true

Input:  "({)}"

Output: false

### Ejercicio 02: Ordenar un Stack
Implementar un algoritmo que ordene un Stack de manera que los elementos más pequeños queden en el tope del Stack.

#### Restricciones
Solo se permite el uso de Stacks adicionales
No está permitido copiar los elementos a arreglos, listas u otras estructuras
El ordenamiento debe realizarse únicamente usando operaciones propias del Stack (push, pop, peek, isEmpty)
Descripción del problema
Dado un Stack de enteros, se debe reordenar su contenido usando otro Stack auxiliar, respetando las reglas de esta estructura de datos.

Ejemplo

Input:  (tope) 5 -> 1 -> 4 -> 2

Output: (tope) 1 -> 2 -> 4 -> 5

### Consideraciones
El Stack original debe quedar ordenado al finalizar el proceso
El elemento más pequeño debe quedar siempre en el tope
La solución debe evidenciar razonamiento lógico y dominio del Stack
Ejercicio 03: Palíndromo usando Colas
Idea principal
El método recibe un String
Internamente se usan dos colas
No se compara directamente el String
Se aprovecha el comportamiento FIFO de las colas
Lógica del algoritmo
Recibir el String

Insertar cada carácter en una cola original

Insertar los mismos caracteres en una segunda cola invertida

Para invertir se usa una cola auxiliar
Comparar elemento por elemento ambas colas

Si todos coinciden → palíndromo

Ejemplos

Input:  "ana"

Output: true

Input:  "radar"

Output: true

Input:  "java"

Output: false

## Salida de Consola de los ejercicios 1,2 y 3

![alt text](<assets/Captura de pantalla 2025-12-15 213919.png>)