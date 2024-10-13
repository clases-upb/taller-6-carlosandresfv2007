/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.io.*;
import java.util.*;

public class App {

    public static String[] v_txt;
    public static int[] v_num;

    public static void main(String[] args) {

        try {

            double random_1 = 0;
            int random_2 = 0, r_3 = 0;
            String abcd = "abcdefghijklmnñopqrstuvwxyz";
            String opcion_1 = "";
            int vector = 2;
            Scanner teclado = new Scanner(System.in);
            String ruta = "";

            v_txt = new String[(random_2 = (int)(Math.random() * 30))];
            v_num = new int[(random_2 = (int)(Math.random() * 30))];

            for(int i = 0; i < v_txt.length; i++) {
                if ((random_1 = Math.random()) > 0.4) {
                    random_2 = (int)(Math.random() * 20);
                    for(int j = 0; j < random_2; j++) {
                        v_txt[i] += abcd.charAt(r_3 = (int)(Math.random() * 25));
                    }
                } else {
                    v_txt[i] = "";
                }
            }

            for(int k = 0; k < v_num.length; k++) {
                if ((random_1 = Math.random()) > 0.4) { 
                    v_num[k] = (int)(Math.random() * 30000);
                } else {
                    v_num[k] = 0;
                }
            }

            do {
                System.out.println("========MENU PUNTO 1===========" +"\n" +
                "1. Seleccione 1 para recorrer el vector que quiera ascendentemente o descendentemente" + "\n" + 
                "2. Seleccione 2 para actualizar el vector con una posicion y el elemento" + "\n" + 
                "3. seleccione 3 para añadir un elemento al final del vector \n" + 
                "4. sleccione 4 para borrar el elemnto de una posicion de un vector \n" +
                "5. seleccione 5 para ordenar el vector ascendente o descendentemente \n" + 
                "6. seleccione 6 para buscar un elemento en el vector \n" +
                "7. seleccione s para salir");
                opcion_1 = teclado.nextLine();


                switch (opcion_1) {
                    case "1":
                        System.out.println("Ingrese '1' para ascendente o '0' para descendente:");
                        boolean ascendente = teclado.nextInt() == 1;
                        System.out.println("Ingrese '1' para vector de texto (v_txt) o '2' para vector numérico (v_num):");
                        vector = teclado.nextInt();
                        recorrerVector(ascendente, vector);
                        teclado.nextLine(); 
                        break;
    
                    case "2":
                        System.out.println("Ingrese la posición a actualizar:");
                        int posicion = teclado.nextInt();
                        System.out.println("Ingrese el nuevo elemento (texto si es v_txt o número si es v_num):");
                        if (vector == 1) {
                            String nuevoTexto = teclado.next();
                            actualizarElemento(posicion, nuevoTexto, 1);
                        } else {
                            int nuevoNumero = teclado.nextInt();
                            actualizarElemento(posicion, nuevoNumero, 2);
                        }
                        teclado.nextLine(); 
                        break;
    
                    case "3":
                        System.out.println("Ingrese el nuevo elemento a añadir:");
                        if (vector == 1) {
                            String nuevoTexto = teclado.next();
                            añadirElemento(nuevoTexto, 1);
                        } else {
                            int nuevoNumero = teclado.nextInt();
                            añadirElemento(nuevoNumero, 2);
                        }
                        teclado.nextLine(); 
                        break;
    
                    case "4":
                        System.out.println("Ingrese la posición del elemento a borrar:");
                        int posicionBorrar = teclado.nextInt();
                        System.out.println("Ingrese '1' para vector de texto (v_txt) o '2' para vector numérico (v_num):");
                        vector = teclado.nextInt();
                        borrarElemento(posicionBorrar, vector);
                        teclado.nextLine(); 
                        break;
    
                    case "5":
                        System.out.println("Ingrese '1' para ordenar ascendente o '0' para descendente:");
                        boolean ordenarAscendente = teclado.nextInt() == 1;
                        System.out.println("Ingrese '1' para vector de texto (v_txt) o '2' para vector numérico (v_num):");
                        vector = teclado.nextInt();
                        ordenarVector(ordenarAscendente, vector);
                        teclado.nextLine(); 
                        break;
    
                    case "6":
                        System.out.println("Ingrese el elemento a buscar:");
                        if (vector == 1) {
                            String textoABuscar = teclado.next();
                            System.out.println("Posiciones: " + buscarElemento(textoABuscar, 1));
                        } else {
                            int numeroABuscar = teclado.nextInt();
                            System.out.println("Posiciones: " + buscarElemento(numeroABuscar, 2));
                        }
                        teclado.nextLine(); 
                        break;
    
                    case "s":
                        System.out.println("Saliendo del programa...");
                        break;
    
                    default:
                        System.out.println("Opción no válida, intenta de nuevo.");
                        break;
                }
    
                
            } while (opcion_1.charAt(0) != 's');

            System.out.println();

            calcularTemperaturas(10);

            System.out.println();

            if (ruta != "") {

                cargarYOrdenarVector(ruta);

            }

            System.out.println();

            Scanner scanner_m2 = new Scanner(System.in);
        
            System.out.print("Ingrese el número de elementos (N): ");
            int n_m2 = scanner_m2.nextInt();
            short[] vector_m2 = new short[n_m2];
        
            llenarVector_m2(vector_m2);
            String opcion_m2 = "";

            do {
                System.out.println("Vector actual: ");
                imprimirVector_m2(vector_m2);
                System.out.print("¿Qué posición quiere eliminar (0 a " + (n_m2 - 1) + ")? ");
                int posicion_m2 = scanner_m2.nextInt();
                
                if (posicion_m2 < 0 || posicion_m2 >= n_m2) {
                    System.out.println("Posición inválida.");
                    continue;
                }
            
                System.out.println("Elija una opción:");
                System.out.println("1. Dejar la casilla en 0");
                System.out.println("2. Desplazar elementos para que el cero quede al final");
                System.out.println("s. Terminar el programa");
                opcion_m2 = scanner_m2.next();
            
                if (opcion_m2.equals("s")) break;  // Usar .equals() para comparar strings
            
                switch (opcion_m2) {
                    case "1":
                        modificarVector_m2(vector_m2, posicion_m2, 1);
                        break;
                    case "2":
                        modificarVector_m2(vector_m2, posicion_m2, 2);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
            } while (!opcion_m2.equals("s"));
        
        
        
       
            

            System.out.println(conver_H_D(222));
            m_filycol();
            X0X0();
            ProductoYDivision();
            System.out.println(MatrizTranspuesta(2));

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    /*
     * 1. Implemente un programa en java donde inserte elementos en dos vectores
     * globales de tamaños aleatorios y de contenido aleatorio (uno numérico y otro
     * de Strings). Considere dejar espacios libres en los vectores.
     * 
     * Desde un menú en el programa principal debe considerar cada opción para
     * llamar las siguientes funciones que también debe programar:
     * 
     * a. Recorrer secuencialmente (recibe un true cuando va del primero al último y
     * un false cuando va del último al primero)
     * • De primer elemento a último elemento: Imprime desde el primer elemento
     * hasta el último del vector dado en el parámetro de entrada.
     * • De último elemento al primer elemento: Imprime desde el último elemento
     * hasta el primero del vector dado en el parámetro de entrada.
     * 
    /* */
    public static void recorrerVector(boolean ascendente, int vector) {
        if (vector == 1) { 
            if (ascendente) {
                for (int i = 0; i < v_txt.length; i++) {
                    System.out.println(v_txt[i]);
                }
            } else {
                for (int i = v_txt.length - 1; i >= 0; i--) {
                    System.out.println(v_txt[i]);
                }
            }
        } else { 
            if (ascendente) {
                for (int i = 0; i < v_num.length; i++) {
                    System.out.println(v_num[i]);
                }
            } else {
                for (int i = v_num.length - 1; i >= 0; i--) {
                    System.out.println(v_num[i]);
                }
            }
        }
    }
     /*
     * b. Actualizar: recibe la posición que va a actualizar y el elemento. Al final
     * imprime el vector actualizado.
     * 
     * 
     * c. Añadir: después del último: recibe el elemento que va a añadir. Al final
     * imprime el vector actualizado.
     * 
     * d. Borrar: Recibe la posición donde del elemento que va a borrar.
     * 
     * e. Ordenar el vector:
     * • Ascendentemente.
     * • Descendentemente.
     * 
     * f. Búsqueda: Recibe como parámetro el elemento a buscar y devuelve un String
     * separado por el carácter '-', mostrando las posiciones donde se encuentra el
     * elemento.
     */ 

     // b.

     private static void imprimirVector(int vector) {
        if (vector == 1) {
            for (String s : v_txt) {
                System.out.print(s + " ");
            }
        } else {
            for (int n : v_num) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

     public static void actualizarElemento(int posicion, Object elemento, int vector) {
        if (vector == 1) { 
            if (posicion >= 0 && posicion < v_txt.length) {
                v_txt[posicion] = (String) elemento;
            }
        } else { 
            if (posicion >= 0 && posicion < v_num.length) {
                v_num[posicion] = (int) elemento;
            }
        }
        imprimirVector(vector);
    }

    // c

    public static void añadirElemento(Object elemento, int vector) {
        if (vector == 1) { 
            String[] nuevoTxt = new String[v_txt.length + 1];
            for (int i = 0; i < v_txt.length; i++) {
                nuevoTxt[i] = v_txt[i];
            }
            nuevoTxt[v_txt.length] = (String) elemento;
            v_txt = nuevoTxt;
        } else { 
            int[] nuevoNum = new int[v_num.length + 1];
            for (int i = 0; i < v_num.length; i++) {
                nuevoNum[i] = v_num[i];
            }
            nuevoNum[v_num.length] = (int) elemento;
            v_num = nuevoNum;
        }
        imprimirVector(vector);
    }

    //d 

    public static void borrarElemento(int posicion, int vector) {
        if (vector == 1) { 
            if (posicion >= 0 && posicion < v_txt.length) {
                String[] nuevoTxt = new String[v_txt.length - 1];
                for (int i = 0, j = 0; i < v_txt.length; i++) {
                    if (i != posicion) {
                        nuevoTxt[j++] = v_txt[i];
                    }
                }
                v_txt = nuevoTxt;
            }
        } else { 
            if (posicion >= 0 && posicion < v_num.length) {
                int[] nuevoNum = new int[v_num.length - 1];
                for (int i = 0, j = 0; i < v_num.length; i++) {
                    if (i != posicion) {
                        nuevoNum[j++] = v_num[i];
                    }
                }
                v_num = nuevoNum;
            }
        }
        imprimirVector(vector);
    }
    
    //e

    public static void ordenarVector(boolean ascendente, int vector) {
        if (vector == 1) { 
            java.util.Arrays.sort(v_txt);
            if (!ascendente) {
                for (int i = 0; i < v_txt.length / 2; i++) {
                    String temp = v_txt[i];
                    v_txt[i] = v_txt[v_txt.length - i - 1];
                    v_txt[v_txt.length - i - 1] = temp;
                }
            }
        } else { 
            java.util.Arrays.sort(v_num);
            if (!ascendente) {
                for (int i = 0; i < v_num.length / 2; i++) {
                    int temp = v_num[i];
                    v_num[i] = v_num[v_num.length - i - 1];
                    v_num[v_num.length - i - 1] = temp;
                }
            }
        }
        imprimirVector(vector);
    }

    //f

    public static String buscarElemento(Object elemento, int vector) {
        String resultado = "";
        if (vector == 1) { 
            for (int i = 0; i < v_txt.length; i++) {
                if (v_txt[i].equals(elemento)) {
                    resultado += i + "-";
                }
            }
        } else { 
            for (int i = 0; i < v_num.length; i++) {
                if (v_num[i] == (int) elemento) {
                    resultado += i + "-";
                }
            }
        }
        return resultado.isEmpty() ? "No encontrado" : resultado.substring(0, resultado.length() - 1);
    }
     

    /*
     * 2. Escriba un algoritmo que calcule aleatoriamente N temperaturas, las lleve
     * a un vector y luego calcule su media, cuántas temperaturas están por encima
     * de la media y cuántas por debajo.
     */

     public static void calcularTemperaturas(int n) {
        double[] temperaturas = new double[n];
        double suma = 0;
        
        for (int i = 0; i < n; i++) {
            temperaturas[i] = Math.random() * 50 - 10; 
            suma += temperaturas[i];
        }
        
        double media = suma / n;
        int porEncima = 0;
        int porDebajo = 0;

        for (int i = 0; i < n; i++) {
            if (temperaturas[i] > media) {
                porEncima++;
            } else if (temperaturas[i] < media) {
                porDebajo++;
            }
        }

        System.out.println("Media: " + media);
        System.out.println("Temperaturas por encima de la media: " + porEncima);
        System.out.println("Temperaturas por debajo de la media: " + porDebajo);
    }


    /*
     * 3. Cargue un vector a partir de un archivo de palabras, con mínimo 10
     * palabras. Ordene el vector de manera ascendente y luego de forma descendente.
     * 
     * Escriba el vector inicial sin ordenar, los vectores ordenados.
     */

      public static void cargarYOrdenarVector(String archivo) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String[] palabras = new String[10];
        String linea;
        int i = 0;

        while ((linea = lector.readLine()) != null && i < palabras.length) {
            palabras[i++] = linea;
        }
        lector.close();

        System.out.println("Vector inicial sin ordenar: " + Arrays.toString(palabras));

        Arrays.sort(palabras);
        System.out.println("Vector ordenado ascendentemente: " + Arrays.toString(palabras));

        Arrays.sort(palabras, Collections.reverseOrder());
        System.out.println("Vector ordenado descendentemente: " + Arrays.toString(palabras));
    }

    /*
     * 4. Escriba un algoritmo que cree un vector de N elementos (el N es dado por
     * el usuario) de números short aleatorios positivos mayores que cero, y luego
     * le pregunte al usuario qué posición quiere eliminar. Luego por un menú
     * presente las opciones: Dejar la casilla en 0 o desplazar los elementos de
     * manera que el cero quede en la última posición del vector. Después de la
     * operación mostrará el vector cómo va quedando y volverá a preguntar qué
     * posición quiere borrar y mostrará nuevamente el menú. En el menú aparecerá la
     * opción para terminar el programa.
     */

        public static void llenarVector_m2(short[] vector_m2) {
        Random random_m2 = new Random();
        for (int i_m2 = 0; i_m2 < vector_m2.length; i_m2++) {
            vector_m2[i_m2] = (short) (random_m2.nextInt(Short.MAX_VALUE) + 1);
        }
        }

        public static void modificarVector_m2(short[] vector_m2, int posicion_m2, int opcion_m2) {
            if (opcion_m2 == 1) {
                vector_m2[posicion_m2] = 0;
            } else if (opcion_m2 == 2) {
                desplazarElementos_m2(vector_m2, posicion_m2);
            }
        }

        private static void desplazarElementos_m2(short[] vector_m2, int posicion_m2) {
            int n_m2 = vector_m2.length;
            for (int i_m2 = posicion_m2; i_m2 < n_m2 - 1; i_m2++) {
                vector_m2[i_m2] = vector_m2[i_m2 + 1];
            }
            vector_m2[n_m2 - 1] = 0;
        }

        private static void imprimirVector_m2(short[] vector_m2) {
            for (short num_m2 : vector_m2) {
                System.out.print(num_m2 + " ");
            }
            System.out.println();
        }



    /*
     * 5. Escriba un algoritmo para convertir un número decimal en un número
     * hexadecimal, apoyado en vectores.
     */

     public static String conver_H_D(int decimal) throws Exception {

        try {
            
            char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            char[] restos = new char[100];
            int indice = 0;

            if (decimal == 0) {
                return "0";
            }

            while (decimal > 0) {
                restos[indice] = hexChars[decimal % 16];
                decimal = decimal / 16;
                indice++;
            }

            String resultado = "";
            for (int i = indice - 1; i >= 0; i--) {
                resultado += restos[i];
            }

            return resultado;

        } catch (Exception e) {
            
            throw new Exception();

        }

    }

    /*
     * 6. Escriba un algoritmo que solicite al usuario el orden de una matriz
     * cuadrática, implemente su matriz transpuesta (investiga qué es) y la imprima.
     */

     public static String MatrizTranspuesta(int n) {
        int[][] matriz = new int[n][n];
        int[][] transpuesta = new int[n][n];
        String resultado = "";
        int contador = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        resultado += "Matriz transpuesta:\n";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado += transpuesta[i][j] + " ";
            }
            resultado += "\n";
        }

        return resultado;
    }



    /*
     * 7. Escriba un algoritmo que calcule el producto y la división. Los operandos
     * serán la suma de elementos de la diagonal principal y la suma de los
     * elementos de la diagonal secundaria. Los elementos de la matriz deben ser
     * llenados usando la función random para calcular números aleatorios entre 10 y
     * 100.
     */
    public static void ProductoYDivision() {

        int[][] matriz = new int[5][5];
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int valor = (int) (Math.random() * ((100 - 10) + 1)) + 10;
                matriz[i][j] = valor;

                if (i == j) {
                    sumaDiagonalPrincipal += matriz[i][j];
                }

                if (i + j == n - 1) {
                    sumaDiagonalSecundaria += matriz[i][j];
                }
            }
        }

        int producto = sumaDiagonalPrincipal * sumaDiagonalSecundaria;
        double division = (double) sumaDiagonalPrincipal / sumaDiagonalSecundaria;

        System.out.println("Producto de las diagonales: " + producto);
        System.out.println("División de la diagonal principal entre la secundaria: " + division);
    }



    /*
     * 8. Escriba un algoritmo que llene de manera aleatoria una matriz de 100 filas
     * por 3 columnas con Xs y Os. Y mediante un vector cuente el número de Xs y Os
     * en cada fila. Imprima la matriz antes de llenarla, luego de llenarla y el
     * vector con el resultado.
     */

        public static void X0X0() throws Exception{

            try {

                char[][] matriz = new char[100][3];
                int[][] contadorFilas = new int[100][2]; 
                Random random = new Random();
        
                
                System.out.println("Matriz vacía:");
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("- "); 
                    }
                    System.out.println();
                }
        
                
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j < 3; j++) {
                        matriz[i][j] = random.nextBoolean() ? 'X' : 'O';
        
                        
                        if (matriz[i][j] == 'X') {
                            contadorFilas[i][0]++; 
                        } else {
                            contadorFilas[i][1]++; 
                        }
                    }
                }
        
                
                System.out.println("\nMatriz llena:");
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
        
               
                System.out.println("\nConteo de Xs y Os por fila:");
                for (int i = 0; i < 100; i++) {
                    System.out.println("Fila " + (i + 1) + ": Xs = " + contadorFilas[i][0] + ", Os = " + contadorFilas[i][1]);
                }
        



            } catch (Exception e) {
                


            }


        }


    /*
     * 9. Llene una matriz de 5x5 con números aleatorios entre 1 y 9. En un vector
     * adicional, calcule la cantidad de números repetidos por cada fila y en otro
     * vector la cantidad de números repetidos de cada columna.
     */

     public static void m_filycol() throws Exception { 

        try {

            int[][] matriz = new int[5][5];
            int[] repetidosFila = new int[5];
            int[] repetidosColumna = new int[5];

        
            int valor = 0;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                matriz[i][j] = valor;
                valor = (int)(Math.random() * (((9 - 1) + 1) +1));
                }
            }

        
            for (int i = 0; i < 5; i++) {
                int[] contador = new int[10]; 
                for (int j = 0; j < 5; j++) {
                contador[matriz[i][j]]++;
                }
                for (int k = 1; k <= 9; k++) {
                    if (contador[k] > 1) {
                        repetidosFila[i] += contador[k] - 1; 
                    }
                }
            }

        
            for (int j = 0; j < 5; j++) {
                int[] contador = new int[10]; 
                for (int i = 0; i < 5; i++) {
                    contador[matriz[i][j]]++;
                }
                for (int k = 1; k <= 9; k++) {
                    if (contador[k] > 1) {
                    repetidosColumna[j] += contador[k] - 1;
                    }
                }
            }

        
            System.out.println("\n Repetidos por fila:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Fila " + (i + 1) + ": " + repetidosFila[i]);
            }

        
            System.out.println("\n Repetidos por columna:");
            for (int j = 0; j < 5; j++) {
                System.out.println("Columna " + (j + 1) + ": " + repetidosColumna[j]);
            }
            
        } catch (Exception e) {
            
            throw new Exception("error");

        }

    }

}

