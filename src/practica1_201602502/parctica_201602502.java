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

    public static int victoria = 0;

    public parctica_201602502() {

        menuEntrada();
    }
    String a;
    String matriza[][];
    String matrizb[][];
    String matrizc[][];
    String matrizd[][];
    String matrizf[][];
    String matrizg[][];

    public void menuEntrada() {
        vuelta();
        vueltaI();
        vueltaE();
        System.out.println("=============================");
        System.out.println("  Julio Edwin Carrera Diaz   ");
        System.out.println("         201602502           ");
        System.out.println("     Ipc1 A practica 1       ");
        System.out.println("         Buscaminas          ");
        System.out.println("=============================");
        System.out.println("");
        System.out.println("=============================");
        System.out.println("|SI DESEA AVANZAR OPRIMA ENTER|");
        System.out.println("=============================");
        System.out.println("");
        try {
            Scanner lector = new Scanner(System.in);
            a = lector.nextLine();
            switch (a) {
                case "":
                    System.out.println("=================================");
                    System.out.println("      JUEGO BUSCAMINAS           ");
                    System.out.println("=================================");
                    System.out.println("principiante..................[1]");
                    System.out.println("intermedio....................[2]");
                    System.out.println("experto.......................[3]");
                    System.out.println("salir.........................[4]");
                    System.out.println("=================================");
                    break;
                default:
                    System.out.println("");
                    System.out.println(" Caracter invalido presinone enter para avanzar");
                    System.out.println("");
                    menuEntrada();
                    break;
            }
        } catch (Exception e) {
            System.out.println("");
            System.out.println("Caracter invalido presinone enter para avanzar");

            System.out.println("");
            menuEntrada();
        }
        try {
            int v;
            Scanner dedo = new Scanner(System.in);
            v = dedo.nextInt();
            switch (v) {
                case 1:
                    nivelPrincipiante();
                case 2:
                    nivelIntermedio();
                case 3:
                    nivelExperto();
                case 4:

                    System.exit(0);
                default:
                    System.out.println("");
                    System.out.println(" Caracter invalido ");
                    System.out.println("");
                    menuPrincipal();
                    break;
            }
        } catch (Exception e) {
            System.out.println("");
            System.out.println("Caracter invalido ");
            System.out.println("");
            menuPrincipal();
        }
    }

    public void menuPrincipal() {

        System.out.println("=================================");
        System.out.println("      JUEGO BUSCAMINAS           ");
        System.out.println("=================================");
        System.out.println("principiante..................[1]");
        System.out.println("intermedio....................[2]");
        System.out.println("experto.......................[3]");
        System.out.println("salir.........................[4]");
        System.out.println("=================================");
        int v;
        Scanner dedo = new Scanner(System.in);
        v = dedo.nextInt();
        switch (v) {
            case 1:
                nivelPrincipiante();
            case 2:
                nivelIntermedio();
            case 3:
                nivelExperto();
            case 4:

                System.exit(0);
        }

    }

    public void nivelPrincipiante() {
        System.out.println("==================");
        System.out.println("Nivel Principiante");
        System.out.println("==================");
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(matrizb[i][j] + "  ");

            }
            System.out.println();
        }

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(matriza[i][j] + "  ");

            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("=================================");
        System.out.println("Voltear ......................[V]");
        System.out.println("Reiniciar.....................[R]");
        System.out.println("salir.........................[S]");
        
        System.out.println("=================================");
        System.out.println("INGRESE OPCION");
       
        Scanner lector = new Scanner(System.in);
        a = lector.nextLine();

        switch (a) {
            case "V":
                giro();
                break;
            case "R":
                vuelta();
                nivelPrincipiante();
                break;
            case "S":
                menuPrincipal();
                break;
            default:
                System.out.println("");
                System.out.println("Ingrese cualquier opción que desee en mayusculas V, R Y S");
                System.out.println("");
                nivelPrincipiante();

        }
    }

    public void giro() {
        System.out.println("");
        System.out.println("Ingrese una fila y columna");
        System.out.println("");
        try {
            Scanner giro = new Scanner(System.in);
            a = giro.nextLine();
            String[] coordenada = a.split(",");
            if (coordenada.length != 2) {
                System.out.println("");
                System.out.println("Ingrese coordenadas validas");
                System.out.println("");
            } else {
                System.out.println("=========================================");
                System.out.println("Usted seleccionó:(" + coordenada[0] + "," + coordenada[1] + ") ¿Desea continuar?");
                System.out.println("=========================================");
                System.out.println("");
                System.out.println("Si desea continuar preione 1 enter");
                System.out.println("si desea ingresar otra coordenada presione 0 y enter");
                System.out.println("");
                int resultado = giro.nextInt();
                if (resultado == 1) {
                    int celda;
                    celda = 0;

                    int i = Integer.parseInt(coordenada[0]) - 1;
                    int j = Integer.parseInt(coordenada[1]) - 1;

                    if (this.bomba1(i, j - 1) == 1) {
                        celda++;
                    }
                    if (this.bomba1(i, j + 1) == 1) {
                        celda++;
                    }
                    if (this.bomba1(i + 1, j - 1) == 1) {
                        celda++;
                    }
                    if (this.bomba1(i + 1, j + 1) == 1) {
                        celda++;
                    }
                    if (this.bomba1(i - 1, j - 1) == 1) {
                        celda++;
                    }
                    if (this.bomba1(i - 1, j + 1) == 1) {
                        celda++;
                    }
                    if (this.bomba1(i - 1, j) == 1) {
                        celda++;
                    }
                    if (this.bomba1(i + 1, j) == 1) {
                        celda++;
                    }

                    matriza[i][j] = Integer.toString(celda);

                    for (int a = 0; a <= 3; a++) {
                        for (int b = 0; b <= 3; b++) {
                            System.out.print(matriza[a][b] + " ");

                        }
                        System.out.println();
                    }

                    if (matrizb[Integer.parseInt(coordenada[0]) - 1][Integer.parseInt(coordenada[1]) - 1].equals("[*]")) {
                        victoria = 0;
                        System.out.println("");
                        System.out.println("FALLASTE");
                        System.out.println("LAS BOMBAS SE UBICABAN EN .....");
                        System.out.println("");
                        for (int a = 0; a <= 3; a++) {
                            for (int b = 0; b <= 3; b++) {
                                System.out.print(matrizb[a][b] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("");
                        System.out.println("LA MATRIZ SE SOLUCIONABA DE ESTA MANERA.");
                        System.out.println("");

                        String matrizX[][];
                        matrizX = new String[4][4];
                        for (int z = 1; z <= 4; z++) {
                            for (int k = 1; k <= 4; k++) {
                                int variable;
                                variable = 0;
                                int l = z - 1;
                                int h = k - 1;

                                if (this.bomba1(l, h - 1) == 1) {
                                    variable++;
                                }
                                if (this.bomba1(l, h + 1) == 1) {
                                    variable++;
                                }
                                if (this.bomba1(l + 1, h - 1) == 1) {
                                    variable++;
                                }
                                if (this.bomba1(l + 1, h + 1) == 1) {
                                    variable++;
                                }
                                if (this.bomba1(l - 1, h - 1) == 1) {
                                    variable++;
                                }
                                if (this.bomba1(l - 1, h + 1) == 1) {
                                    variable++;
                                }
                                if (this.bomba1(l - 1, h) == 1) {
                                    variable++;
                                }
                                if (this.bomba1(l + 1, h) == 1) {
                                    variable++;
                                }

                                matrizX[l][h] = Integer.toString(variable);

                            }
                        }
                        for (int a = 0; a <= 3; a++) {
                            for (int b = 0; b <= 3; b++) {
                                if (matrizb[a][b] == "[*]") {
                                    System.out.print(matrizb[a][b] + " ");
                                } else {

                                    System.out.print(matrizX[a][b] + " ");
                                }

                            }
                            System.out.println();
                        }
                        System.out.println("");
                        vuelta();
                        nivelPrincipiante();

                    } else {
                        victoria += 1;
                    }
                    if (victoria == 12) {
                        System.out.println("");
                        System.out.println("!!!FELICITACIONES HAS GANADO EL NIIVEL PRINCIPIANTE!!!");
                        System.out.println("");

                        vuelta();
                    }
                } else if (resultado == 0) {
                    giro();
                } else {
                    System.out.println("");
                    System.out.println("Inválido");
                    System.out.println("");
                    giro();
                }

            }

            nivelPrincipiante();
        } catch (Exception e) {
            System.out.println("");
            System.out.println("INGRESE UNA COORDENADA VALIDA");
            System.out.println("");
            giro();
        }
    }

    public void vuelta() {
        int t;
        matriza = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriza[i][j] = "X";
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
            int fila = s.nextInt(4);
            int columna = s.nextInt(4);
            if (matrizb[fila][columna].equals("[*]")) {
                t--;
            }

            matrizb[fila][columna] = "[*]";
        }
    }

    int bomba1(int i, int j) {
        try {
            if (matrizb[i][j].equals("[*]")) {
                return 1;
            }
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }

    public void nivelIntermedio() {
        System.out.println("");
        System.out.println("================");
        System.out.println("Nivel Intermedio");
        System.out.println("================");
        System.out.println("");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(matrizd[i][j] + "  ");

            }
            System.out.println();
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(matrizc[i][j] + "  ");

            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("=================================");
        System.out.println("Voltear ......................[V]");
        System.out.println("Reiniciar.....................[R]");
        System.out.println("salir.........................[S]");
      
        System.out.println("=================================");
        System.out.println("INGRESE OPCION");
       
        Scanner lector = new Scanner(System.in);
        a = lector.nextLine();

        switch (a) {
            case "V":
                giroI();
                break;
            case "R":
                vueltaI();
                nivelIntermedio();
                break;
            case "S":
                menuPrincipal();
                break;
            default:
                System.out.println("");
                System.out.println("Ingrese cualquier opción que desee en mayusculas V, R Y S");
                System.out.println("");
                nivelIntermedio();

        }

    }

    public void giroI() {
        System.out.println("");
        System.out.println("Ingrese una fila y columna");
        System.out.println("");
        try {
            Scanner d = new Scanner(System.in);
            a = d.nextLine();
            String[] coordenada = a.split(",");
            if (coordenada.length != 2) {
                System.out.println("");
                System.out.println("Ingrese coordenadas validas");
                System.out.println("");
            } else {
                System.out.println("=========================================");
                System.out.println("Usted seleccionó:(" + coordenada[0] + "," + coordenada[1] + ") ¿Desea continuar?");
                System.out.println("=========================================");
                System.out.println("");
                System.out.println("Si desea continuar preione 1 y enter");
                System.out.println("si desea ingresar otra coordenada presione 0 y enter");
                System.out.println("");
                int y = d.nextInt();
                if (y == 1) {
                    int num;
                    num = 0;

                    int i = Integer.parseInt(coordenada[0]) - 1;
                    int j = Integer.parseInt(coordenada[1]) - 1;

                    if (this.bomba2(i, j - 1) == 1) {
                        num++;
                    }
                    if (this.bomba2(i, j + 1) == 1) {
                        num++;
                    }
                    if (this.bomba2(i + 1, j - 1) == 1) {
                        num++;
                    }
                    if (this.bomba2(i + 1, j + 1) == 1) {
                        num++;
                    }
                    if (this.bomba2(i - 1, j - 1) == 1) {
                        num++;
                    }
                    if (this.bomba2(i - 1, j + 1) == 1) {
                        num++;
                    }
                    if (this.bomba2(i - 1, j) == 1) {
                        num++;
                    }
                    if (this.bomba2(i + 1, j) == 1) {
                        num++;
                    }

                    matrizc[i][j] = Integer.toString(num);

                    for (int h = 0; h <= 5; h++) {
                        for (int k = 0; k <= 5; k++) {
                            System.out.print(matrizc[h][k] + " ");

                        }
                        System.out.println();
                    }
                    if (matrizd[Integer.parseInt(coordenada[0]) - 1][Integer.parseInt(coordenada[1]) - 1].equals("[*]")) {
                        victoria = 0;
                        System.out.println("");
                        System.out.println("!!!!BOOOOOM HAS PERDIDO!!!!");
                        System.out.println("LAS MINAS ESTABAN EN...");
                        System.out.println("");
                        for (int h = 0; h <= 5; h++) {
                            for (int k = 0; k <= 5; k++) {
                                System.out.print(matrizd[h][k] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("");
                        System.out.println("LA SOLUCION ERA...");
                        System.out.println("");
                        String matrizp[][];
                        matrizp = new String[6][6];
                        for (int f = 1; f <= 6; f++) {
                            for (int t = 1; t <= 6; t++) {
                                int numerito;
                                numerito = 0;
                                int r = f - 1;
                                int m = t - 1;

                                if (this.bomba2(r, m - 1) == 1) {
                                    numerito++;
                                }
                                if (this.bomba2(r, m + 1) == 1) {
                                    numerito++;
                                }
                                if (this.bomba2(r + 1, m - 1) == 1) {
                                    numerito++;
                                }
                                if (this.bomba2(r + 1, m + 1) == 1) {
                                    numerito++;
                                }
                                if (this.bomba2(r - 1, m - 1) == 1) {
                                    numerito++;
                                }
                                if (this.bomba2(r - 1, m + 1) == 1) {
                                    numerito++;
                                }
                                if (this.bomba2(r - 1, m) == 1) {
                                    numerito++;
                                }
                                if (this.bomba2(r + 1, m) == 1) {
                                    numerito++;
                                }

                                matrizp[r][m] = Integer.toString(numerito);

                            }

                        }
                        for (int h = 0; h <= 5; h++) {
                            for (int k = 0; k <= 5; k++) {
                                if (matrizd[h][k] == "[*]") {
                                    System.out.print(matrizd[h][k] + " ");
                                } else {

                                    System.out.print(matrizp[h][k] + " ");
                                }

                            }
                            System.out.println();
                        }
                        vueltaI();
                        nivelIntermedio();

                    } else {
                        victoria += 1;
                    }
                    if (victoria == 28) {
                        System.out.println("");
                        System.out.println("!!!FELICITACIONES HAS GANADO EL NIVEL INTERMEDIO!!!");

                        System.out.println("");
                        vueltaI();
                    }
                } else if (y == 0) {
                    giroI();
                } else {
                    System.out.println("");
                    System.out.println("Inválido");
                    System.out.println("");
                    vueltaI();
                }

            }

            nivelIntermedio();
        } catch (Exception e) {
            System.out.println("");
            System.out.println("INGRESE UNA COORDENADA VALIDA");
            System.out.println("");
            vueltaI();
        }
    }

    public void vueltaI() {
        int z;
        matrizc = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrizc[i][j] = "X";
            }

        }

        Random vuelta = new Random();
        matrizd = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrizd[i][j] = "[ ]";
            }
        }
        for (z = 0; z < 8; z++) {
            int fila = vuelta.nextInt(6);
            int columna = vuelta.nextInt(6);
            if (matrizd[fila][columna].equals("[*]")) {
                z--;
            }

            matrizd[fila][columna] = "[*]";
        }
    }

    int bomba2(int i, int j) {
        try {
            if (matrizd[i][j].equals("[*]")) {
                return 1;
            }
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }

    public void nivelExperto() {
        System.out.println("");
        System.out.println("=============");
        System.out.println("Nivel Experto");
        System.out.println("=============");
        System.out.println("");
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.print(matrizg[i][j] + "  ");

            }
            System.out.println();
        }

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.print(matrizf[i][j] + "  ");

            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("=================================");
        System.out.println("Voltear ......................[V]");
        System.out.println("Reiniciar.....................[R]");
        System.out.println("salir.........................[S]");
       
        System.out.println("=================================");
        System.out.println("ingrese opcion");
        

        Scanner lector = new Scanner(System.in);
        a = lector.nextLine();

        switch (a) {
            case "V":
                giroR();
                break;
            case "R":
                vueltaE();
                nivelExperto();
                break;
            case "S":
                menuPrincipal();
                break;
            default:
                System.out.println("");
                System.out.println("Ingrese cualquier opción que desee en mayusculas V, R Y S");
                System.out.println("");
                nivelExperto();

        }

    }

    public void giroR() {
        System.out.println("");
        System.out.println("Ingrese una fila y columna");
        System.out.println("");
        try {
            Scanner l = new Scanner(System.in);
            a = l.nextLine();
            String[] coordenada = a.split(",");
            if (coordenada.length != 2) {
                System.out.println("");
                System.out.println("Ingrese coordenadas validas");
                System.out.println("");
            } else {
               System.out.println("=========================================");
                System.out.println("Usted seleccionó:(" + coordenada[0] + "," + coordenada[1] + ") ¿Desea continuar?");
                System.out.println("=========================================");
                System.out.println("");
                System.out.println("Si desea continuar preione 1");
                System.out.println("si desea ingresar otra coordenada presione 0");
                System.out.println("");
                int del = l.nextInt();
                if (del == 1) {
                    int vd;
                    vd = 0;

                    int i = Integer.parseInt(coordenada[0]) - 1;
                    int j = Integer.parseInt(coordenada[1]) - 1;

                    if (this.bomba3(i, j - 1) == 1) {
                        vd++;
                    }
                    if (this.bomba3(i, j + 1) == 1) {
                        vd++;
                    }
                    if (this.bomba3(i + 1, j - 1) == 1) {
                        vd++;
                    }
                    if (this.bomba3(i + 1, j + 1) == 1) {
                        vd++;
                    }
                    if (this.bomba3(i - 1, j - 1) == 1) {
                        vd++;
                    }
                    if (this.bomba3(i - 1, j + 1) == 1) {
                        vd++;
                    }
                    if (this.bomba3(i - 1, j) == 1) {
                        vd++;
                    }
                    if (this.bomba3(i + 1, j) == 1) {
                        vd++;
                    }

                    matrizf[i][j] = Integer.toString(vd);

                    for (int h = 0; h <= 7; h++) {
                        for (int k = 0; k <= 7; k++) {
                            System.out.print(matrizf[h][k] + " ");

                        }
                        System.out.println();
                    }
                    if (matrizg[Integer.parseInt(coordenada[0]) - 1][Integer.parseInt(coordenada[1]) - 1].equals("[*]")) {
                        victoria = 0;
                        System.out.println("");
                        System.out.println("FALLASTE");
                        System.out.println("LAS BOMBAS SE UBICABAN EN .....");
                        System.out.println("");
                        for (int h = 0; h <= 7; h++) {
                            for (int k = 0; k <= 7; k++) {
                                System.out.print(matrizg[h][k] + " ");
                            }
                            System.out.println();
                        }

                        System.out.println("");
                        System.out.println("LA MATRIZ SE SOLUCIONABA DE ESTA MANERA.");
                        System.out.println("");

                        String matrizq[][];
                        matrizq = new String[8][8];
                        for (int a = 1; a <= 8; a++) {
                            for (int b = 1; b <= 8; b++) {
                                int de;
                                de = 0;
                                int x = a - 1;
                                int y = b - 1;

                                if (this.bomba3(x, y - 1) == 1) {
                                    de++;
                                }
                                if (this.bomba3(x, y + 1) == 1) {
                                    de++;
                                }
                                if (this.bomba3(x + 1, y - 1) == 1) {
                                    de++;
                                }
                                if (this.bomba3(x + 1, y + 1) == 1) {
                                    de++;
                                }
                                if (this.bomba3(x - 1, y - 1) == 1) {
                                    de++;
                                }
                                if (this.bomba3(x - 1, y + 1) == 1) {
                                    de++;
                                }
                                if (this.bomba3(x - 1, y) == 1) {
                                    de++;
                                }
                                if (this.bomba3(x + 1, y) == 1) {
                                    de++;
                                }

                                matrizq[x][y] = Integer.toString(de);

                            }

                        }
                        for (int h = 0; h <= 7; h++) {
                            for (int k = 0; k <= 7; k++) {
                                if (matrizg[h][k] == "[*]") {
                                    System.out.print(matrizg[h][k] + " ");
                                } else {

                                    System.out.print(matrizq[h][k] + " ");
                                }

                            }
                            System.out.println();
                        }
                        vueltaE();
                        nivelExperto();

                    } else {
                        victoria += 1;
                    }
                    if (victoria == 52) {
                        System.out.println("");
                        System.out.println("!!!FELICITACIONES HAS GANADO EL NIVEL EXPERTO!!!");
                        System.out.println("");

                        vueltaE();
                    }
                } else if (del == 0) {
                    giroR();
                } else {
                    System.out.println("");

                    System.out.println("Inválido");
                    System.out.println("");
                    giroR();
                }
            }

            nivelExperto();
        } catch (Exception e) {
            System.out.println("");
            System.out.println("INGRESE UNA COORDENADA VALIDA");
            System.out.println("");
            giroR();
        }
    }

    public void vueltaE() {
        int z;
        matrizf = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrizf[i][j] = "X";
            }
        }

        Random vuelta = new Random();
        matrizg = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrizg[i][j] = "[ ]";
            }
        }
        for (z = 0; z < 12; z++) {
            int fila = vuelta.nextInt(8);
            int columna = vuelta.nextInt(8);
            if (matrizg[fila][columna].equals("[*]")) {
                z--;
            }

            matrizg[fila][columna] = "[*]";
        }
    }

    int bomba3(int i, int j) {
        try {
            if (matrizg[i][j].equals("[*]")) {
                return 1;
            }
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }
}
