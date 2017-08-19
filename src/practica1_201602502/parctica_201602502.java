/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201602502;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class parctica_201602502 {

    public parctica_201602502() {

        menuEntrada();
    }
    String a;
    String matriza[][];
    String matrizb[][];

    public void menuEntrada() {
        reinicio();
reinicioI();
reiniciado();
        System.out.println(" Ipc1 A practica 1");
        System.out.println(" Julio Edwin Carrera Diaz");
        System.out.println(" 201602502");
            System.out.println(" Ipc1 A practica 1");
        System.out.println(" Buscaminas");
        try {
            Scanner lector = new Scanner(System.in);
            a = lector.nextLine();
            switch (a) {
                case "":
                    System.out.println("Buscaminas");
                    System.out.println("1.principiante");
                    System.out.println("2.intermedio");
                    System.out.println("3.experto");
                    System.out.println("4.salir");
                    break;
                default:
                    System.out.println(" Caracter invalido presinone enter para avanzar");
                    menuEntrada();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Caracter invalido presinone enter para avanzar");
            menuEntrada();
        }
        try {
            int v;
            Scanner d = new Scanner(System.in);
            v = d.nextInt();
            switch (v) {
                case 1:
                    Principiante();
                case 2:
                    Intermedio();
                case 3:
                    Experto();
                case 4:

                    System.exit(0);
                default:
                    System.out.println(" Caracter invalido ");
                    menuPrincipal();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Caracter invalido ");
            menuPrincipal();
        }
    }

    public void menuPrincipal() {

        System.out.println("Buscaminas");
        System.out.println("1.principiante");
        System.out.println("2.intermedio");
        System.out.println("3.experto");
        System.out.println("4.salir");

        int v;
        Scanner d = new Scanner(System.in);
        v = d.nextInt();
        switch (v) {
            case 1:
                Principiante();
            case 2:
                Intermedio();
            case 3:
                Experto();
            case 4:

                System.exit(0);
        }

    }

    public void Principiante() {
        System.out.println("Nivel Principiante");
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(matrizb[i][j] + "\t");

            }
            System.out.println();
        }

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(matriza[i][j] + "\t");

            }
            System.out.println();
        }

        System.out.println("Voltear : V");
        System.out.println("Reiniciar : R");
        System.out.println("Salir : S");
        System.out.println("Ingresar Opcion");

        Scanner lector = new Scanner(System.in);
        a = lector.nextLine();

        switch (a) {
            case "V":
                voltear();
                break;
            case "R":
                reinicio();
                Principiante();
                break;
            case "S":
                menuPrincipal();
                break;
            default:
                System.out.println("Ingrese opción valida");
                Principiante();

        }
    }

    public void voltear() {
        System.out.println("Ingrese una fila y columna");
        Scanner lector = new Scanner(System.in);
        a = lector.nextLine();
        String[] coordenada = a.split(",");
        if (coordenada.length != 2) {
            System.out.println("Ingrese coordenadas validas");
        } else {
            matriza[Integer.parseInt(coordenada[0]) - 1][Integer.parseInt(coordenada[1]) - 1] = matrizb[Integer.parseInt(coordenada[0]) - 1][Integer.parseInt(coordenada[1]) - 1];
        }
        if (matriza[Integer.parseInt(coordenada[0]) - 1][Integer.parseInt(coordenada[1]) - 1].equals("*")) {
            System.out.println("Fallaste");
            System.out.println("Las minas estaban en...");
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.print(matrizb[i][j] + "  ");

                }
                System.out.println();
            }
            reinicio();
            Principiante();

        } else {
        }
        Principiante();
    }

    public void reinicio() {
        int t;
        matriza = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriza[i][j] = "[X]";
            }
        }

        Random s = new Random();
        matrizb = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizb[i][j] = "[ ]";
            }
        }
        for (t = 0; t < 4; t++) {
            int fila = s.nextInt(3);
            int columna = s.nextInt(3);
            if (matrizb[fila][columna].equals("[*]")) {
                t--;
            }

            matrizb[fila][columna] = "[*]";
        }
    }

    public void Intermedio() {
        System.out.println("Nivel Intermedio");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(matrizb[i][j] + "  ");

            }
            System.out.println();
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(matriza[i][j] + "  ");

            }
            System.out.println();
        }

        System.out.println("Voltear : V");
        System.out.println("Reiniciar : R");
        System.out.println("Salir : S");
        System.out.println("Ingresar Opcion");

        Scanner lector = new Scanner(System.in);
        a = lector.nextLine();

        switch (a) {
            case "V":
                voltearI();
                break;
            case "R":
                reinicioI();
                Intermedio();
                break;
            case "S":
                menuPrincipal();
                break;
            default:
                System.out.println("Ingrese opción valida");
                Intermedio();

        }

    }

    public void voltearI() {
        System.out.println("Ingrese una fila y columna");
        Scanner lector = new Scanner(System.in);
        a = lector.nextLine();
        String[] coordenada = a.split(",");
        if (coordenada.length != 2) {
            System.out.println("Ingrese coordenadas validas");
        } else {
            matriza[Integer.parseInt(coordenada[0]) - 1][Integer.parseInt(coordenada[1]) - 1] = matrizb[Integer.parseInt(coordenada[0]) - 1][Integer.parseInt(coordenada[1]) - 1];
        }
        if (matriza[Integer.parseInt(coordenada[0]) - 1][Integer.parseInt(coordenada[1]) - 1].equals("*")) {
            System.out.println("Fallaste");
            System.out.println("Las minas estaban en...");
            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= 5; j++) {
                    System.out.print(matrizb[i][j] + "  ");

                }
                System.out.println();
            }
            reinicioI();
            Intermedio();

        } else {
        }
        Intermedio();
    }

    public void reinicioI() {
        int z;
        matriza = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriza[i][j] = "[X]";
            }

        }

        Random vuelta = new Random();
        matrizb = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrizb[i][j] = "[ ]";
            }
        }
        for (z = 0; z < 8; z++) {
            int fila = vuelta.nextInt(5);
            int columna = vuelta.nextInt(5);
            if (matrizb[fila][columna].equals("[*]")) {
                z--;
            }

            matrizb[fila][columna] = "[*]";
        }
    }

    public void Experto() {
        System.out.println("Nivel Experto");
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.print(matrizb[i][j] + "  ");

            }
            System.out.println();
        }

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.print(matriza[i][j] + "  ");

            }
            System.out.println();
        }

        System.out.println("Voltear : V");
        System.out.println("Reiniciar : R");
        System.out.println("Salir : S");
        System.out.println("Ingresar Opcion");

        Scanner lector = new Scanner(System.in);
        a = lector.nextLine();

        switch (a) {
            case "V":
                volterR();
                break;
            case "R":
                reiniciado();
                Experto();
                break;
            case "S":
                menuPrincipal();
                break;
            default:
                System.out.println("Ingrese opción valida");
                Experto();

        }

    }

    public void volterR() {
        System.out.println("Ingrese una fila y columna");
        Scanner lector = new Scanner(System.in);
        a = lector.nextLine();
        String[] coordenada = a.split(",");
        if (coordenada.length != 2) {
            System.out.println("Ingrese coordenadas validas");
        } else {
            matriza[Integer.parseInt(coordenada[0]) - 1][Integer.parseInt(coordenada[1]) - 1] = matrizb[Integer.parseInt(coordenada[0]) - 1][Integer.parseInt(coordenada[1]) - 1];
        }
        if (matriza[Integer.parseInt(coordenada[0]) - 1][Integer.parseInt(coordenada[1]) - 1].equals("*")) {
            System.out.println("Fallaste");
            System.out.println("Las minas estaban en...");
            for (int i = 0; i <= 7; i++) {
                for (int j = 0; j <= 7; j++) {
                    System.out.print(matrizb[i][j] + "  ");

                }
                System.out.println();
            }
            reiniciado();
            Experto();

        } else {
        }
        Experto();
    }

    public void reiniciado() {
        int z;
        matriza = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriza[i][j] = "[X]";
            }
        }

        Random vuelta = new Random();
        matrizb = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrizb[i][j] = "[ ]";
            }
        }
        for (z = 0; z < 12; z++) {
            int fila = vuelta.nextInt(7);
            int columna = vuelta.nextInt(7);
            if (matrizb[fila][columna].equals("[*]")) {
                z--;
            }

            matrizb[fila][columna] = "[*]";
        }
    }
}
