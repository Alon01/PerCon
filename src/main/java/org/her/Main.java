package org.her;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio.");
        boolean fin = true;
        Scanner sc = new Scanner(System.in);
        while (fin){
            ConectionMysql con = new ConectionMysql();
            System.out.print("¿Quieres salir? (1:si 2 :no)");
            fin = sc.nextInt() != 1;
        }
        System.out.println("Finalizado. Adios.");
    }
}