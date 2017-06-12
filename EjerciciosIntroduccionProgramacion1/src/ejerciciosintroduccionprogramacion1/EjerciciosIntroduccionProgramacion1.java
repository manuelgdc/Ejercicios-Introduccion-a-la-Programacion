/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosintroduccionprogramacion1;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class EjerciciosIntroduccionProgramacion1 {

    public static void main(String[] args) {
        System.out.println("LISTADO DE EJERCICIOS:");
        System.out.println("-----------------------");
        System.out.println("1.-- Se tienen dos variables, A y B. Escribe las asignaciones necesarias para intercambiar sus valores, sean cuales sean.");
        System.out.println("2.-- Se tienen tres variables, A, B y C. Escribe las asignaciones necesarias para intercambiar sus valores, sean cuales sean, \n"
                + "de manera que: B tome el valor de A, C tome el valor de B, A tome el valor de C");
        System.out.println("3.-- Leídos dos números por teclado, A y B, calcular la resta del mayor menos el menor. Por \n"
                + "ejemplo, si A = 8 y B = 3, el resultado debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el\n" + "resultado debe ser B – A, es decir, 3.");
        System.out.println("4.-- Determinar si un año es bisiesto o no (los años bisiestos son múltiplos de 4; utilícese el\n"
                + "operador módulo).");
        System.out.println("5.-- Leer un número real y un tipo de moneda, que puede ser \"euro\" o \"peseta\". Convertir\n"
                + "la cantidad al tipo de moneda indicado, suponiendo que está expresada en la otra. Por\n"
                + "ejemplo, si la cantidad es 15 y la moneda es \"peseta\", se supondrá que se trata de 15 €\n"
                + "y que hay que convertirlos a pesetas y, por lo tanto, el resultado debe ser 2495.");
        System.out.println("6.-- Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de menor a mayor.");
        System.out.println("7.-- Como el anterior, pero para averiguar si los números son consecutivos.");
        System.out.println("8.-- Determinar el número de cifras de un número entero. El algoritmo debe funcionar\n"
                + "para números de hasta 5 cifras, considerando los negativos. Por ejemplo, si se\n"
                + "introduce el número 5342, la respuesta del programa debe ser 4. Si se introduce -250,\n"
                + "la respuesta debe ser 3.");
        System.out.println("9.-- Calcular las dos soluciones de una ecuación de segundo grado, del tipo ax2 + bx + c = 0.\n"
                + "Los coeficientes a, b y c deberá introducirlos el usuario a través del teclado.");
        System.out.println("10.-- Dados tres números enteros, A, B, C, determinar cuál es el mayor, cuál el menor y cuál\n"
                + "el mediano.");

        Scanner leer = new Scanner(System.in);
        System.out.println("*********************************************************************************");
        System.out.println("*********************************************************************************");
        System.out.println("elige un ejercicio:");
        int op = leer.nextInt();

        int auxiliar, a, b, c, rdo;
        switch (op) {
            case 1:

                System.out.println("introduce el valor de la variable a:");
                a = leer.nextInt();
                System.out.println("introduce el valor de la variable b:");
                b = leer.nextInt();
                auxiliar = a;
                a = b;
                b = auxiliar;
                System.out.println("el valor de la variable a es: " + a + " y el de la variable b es: " + b);
                break;
            case 2:

                System.out.println("introduce el valor de la variable a:");
                a = leer.nextInt();
                System.out.println("introdcue el valor de la variable b:");
                b = leer.nextInt();
                System.out.println("introdcue el valor de la variable c:");
                c = leer.nextInt();
                auxiliar = a;
                a = c;
                c = b;
                c = auxiliar;
                System.out.println("a= " + a);
                System.out.println("b= " + b);
                System.out.println("c= " + c);

                break;
            case 3:
                System.out.println("introduce el valor de la variable a:");
                a = leer.nextInt();
                System.out.println("introduce el valor de la variable b:");
                b = leer.nextInt();
                if (a > b) {
                    rdo = a - b;
                    System.out.println("el resultado es: " + rdo);

                } else {
                    rdo = b - a;
                    System.out.println("el resultado es: " + rdo);
                }
                break;
            case 4:
                System.out.println("introduce un año para saber si es bisiesto:");
                int anno = leer.nextInt();
                if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) {
                    System.out.println("es bisiesto");
                } else {
                    System.out.println("no es bisiesto");
                }
                break;
            case 5:
                System.out.println("convertidor de monedas");
                System.out.println("introduce una cantidad:");
                double cantidad = leer.nextDouble();
                System.out.println("introduce una moneda:");
                String moneda = leer.next();
                if (moneda.equals("peseta")) {
                    double rdo1 = (cantidad / 166.386);
                    System.out.println(rdo1 + " euros");
                } else {
                    double rdo2 = (cantidad * 166.386);
                    System.out.println(rdo2 + " pesetas");
                }
                break;
            case 6:
                System.out.println("introduce el valor del primer numero:");
                a = leer.nextInt();
                System.out.println("introdcue el valor del segundo numero:");
                b = leer.nextInt();
                System.out.println("introdcue el valor del tercer numero:");
                c = leer.nextInt();
                if (a < b && a < c) {
                    System.out.println("los numeros estan ordenador de menor a mayor");
                } else {
                    System.out.println("los numeros no estan ordenador de menor a mayor");
                }
                break;
            case 7:
                System.out.println("introduce el valor del primer numero:");
                a = leer.nextInt();
                System.out.println("introdcue el valor del segundo numero:");
                b = leer.nextInt();
                System.out.println("introdcue el valor del tercer numero:");
                c = leer.nextInt();
                if (b - 1 == a && c - 1 == b) {
                    System.out.println("los numeros son consecutivos");
                } else {
                    System.out.println("los numeros no son consecutivos");
                }
                break;
            case 8:
                System.out.println("introduce un numero para determinar el numero de cifras que tiene:");
                int n = leer.nextInt();

                if (n < -99999 && n > 99999) {
                    System.out.println("Numero mayor de 5 cifras");
                }
                if (n <= 99999 && n > 9999) {
                    System.out.println("Numero de 5 cifras");
                }
                if (n >= -99999 && n < -9999) {
                    System.out.println("Numero de 5 cifras");
                }
                if (n <= 9999 && n > 999) {
                    System.out.println("Numero de 4 cifras");
                }
                if (n >= -9999 && n < -999) {
                    System.out.println("Numero de 4 cifras");
                }
                if (n <= 999 && n > 99) {
                    System.out.println("Numero de 3 cifras");
                }
                if (n >= -999 && n < 99) {
                    System.out.println("Numero de 3 cifras");
                }
                if (n <= 99 && n > 9) {
                    System.out.println("Numero de 2 cifras");
                }
                if (n >= -99 && n < -9) {
                    System.out.println("Numero de 2 cifras");
                }
                if (n <= 9 && n > 0) {
                    System.out.println("Numero de 1 cifras");
                }
                if (n >= -9 && n < 0) {
                    System.out.println("Numero de 1 cifras");
                }
                break;
            case 9:
                double x;
                double y;
                double z;
                double raiz;
                double resultado1;
                double resultado2;

                System.out.println(" escribe al valor de A");
                x = leer.nextDouble();
                System.out.println(" escribe al valor de B");
                y = leer.nextDouble();
                System.out.println(" escribe al valor de C");
                z = leer.nextDouble();

                if (x == 0) {
                    System.out.println("A no puede valer 0");
                } else {
                    raiz = (y * y) - (4 * x * z);
                    if (raiz > 0) {
                        raiz = Math.sqrt(raiz);
                        resultado1 = (-y + raiz) / (2 * x);
                        resultado2 = (-y - raiz) / (2 * x);

                        System.out.println("Los resultados de la ecuacion son x1: " + resultado1 + " x2: " + resultado2);
                    } else if (raiz == 0) {
                        resultado1 = -y / (2 * x);
                        System.out.println("El resultado de la ecuacion es x: " + resultado1);
                    } else {//raiz < 0
                        System.out.println("La ecuacion no tiene soluciones reales");

                    }
                }
                break;

            case 10:
                System.out.println("introduce el valor de la variable a:");
                a = leer.nextInt();
                System.out.println("introdcue el valor de la variable b:");
                b = leer.nextInt();
                System.out.println("introdcue el valor de la variable c:");
                c = leer.nextInt();
                if (a > b && a > c) {
                    System.out.println("la variable a es la mayor");
                } else if (b > a && b > c) {
                    System.out.println("la variable b es la mayor");
                } else {
                    System.out.println("la variable c es la mayor");
                }
                break;
        }

    }
}
