/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201602502;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class practica_201602502 {

    public practica_201602502() {
        menuEntrada();
    }

    String matrizx[][];
    String matrizm[][];
    String lector;

    public void menuEntrada() {
        System.out.println(" Julio Edwin Carrera Diaz ");
        System.out.println(" 201602502 ");
        System.out.println(" IPC1 A Practica 1 ");
        System.out.println("Buscaminas!!!!");
        try {
            Scanner scr = new Scanner(System.in);
            lector = scr.nextLine();

            switch (lector) {
                case "":
                    menuPrincipal();
                    break;
                default:
                    System.out.println(" Caracter invalido presinone enter para avanzar");
                    menuEntrada();
                    break;

            }
        } catch (Exception e) {
            System.out.println("Caracter invalido presione enter para avanzar");
            menuPrincipal();
        }

    }

    public void menuPrincipal() {
        System.out.println("Buscaminas");
        System.out.println("1.Nivel Principiante");
        System.out.println("2.Nivel Intermedio");
        System.out.println("3.Nivel Experto");
        System.out.println("4.salir");
      try{
        Scanner s = new Scanner(System.in);
        int x;
        x = s.nextInt();
        switch (x) {
            case 1:
                principiante();
            case 2:
                intermedio();
            case 3:
                experto();
            case 4:
                System.exit(0);
            default:
                System.out.println(" Caracter invalido ");
                menuPrincipal();
                break;
        
        }
       }catch (Exception e) {
            System.out.println("Caracter invalido ");
       menuPrincipal();      
       }
    }
public void principiante() {
    System.out.println("Nivel Principiante");
    for (int i=0; i<=3; i++){
    for (int j=0; j<=3; j++){
        System.out.println(matrizm [i][j]+ "  ");
    } System.out.println("");
    }
        System.out.println("Voltear : V");
        System.out.println("Reiniciar : R");
        System.out.println("Salir : S");
        System.out.println("Ingresar Opcion");
    try{
    Scanner w= new Scanner(System.in);
    lector=w.nextLine();
    switch(lector){
    
        case "V": voltear();
        break;
            
            case"R":
                reiniciar ();
                principiante ();
                break;
                
            case "S":
    menuPrincipal();
    break;
            default: System.out.println("caracter invalido");
            principiante();
            break;
    
    }
    } catch (Exception e){
        System.out.println("caracter invalido");
        principiante();
    
    } 
    
    
    }

    public void intermedio() {

    }

    public void experto() {

    }

public void voltear(){
}

public void reiniciar (){
    int z;
    matrizx=new String [4][4];
    for(int i=0; i<4; i++){
    for (int j=0; j<4; j++){
        matrizx [i][j]="[X]";
    }
    }
    Random p= new Random();
    matrizm = new String [4][4];
    for(int i=0; i<4; i++){
    for (int j=0; j<4; j++ ){
    matrizm [i][j]="M";
    }
    }
            for (z = 0; z < 4; z++) {
            int fila = p.nextInt(3);
            int columna = p.nextInt(3);
            if (matrizm[fila][columna].equals("*")) {
                z--;
            }

            matrizm[fila][columna] = "*";
        
            }
    
}
}
