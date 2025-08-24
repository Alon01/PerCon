package org.her;

import java.util.Scanner;

public class NewContact {
    private  String fName;
    private String lName;
    private long pNumber;
    private final String sql;

    NewContact(String fName, String lName, long pNumber){
        sql = "INSERT INTO alonso.contacts (fName, lName, pNumber) VALUES (" + fName + ", " + lName + ", " + pNumber + ");" ;
    }
    NewContact(){
        System.out.println("Entró en NC.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa nombre: ");
        fName = sc.nextLine();
        System.out.print("Igresa apellido: ");
        lName =  sc.nextLine();
        System.out.print("Ingresa número de telefono: ");
        pNumber = sc.nextLong();
        sql = "INSERT INTO alonso.contacts (fName, lName, pNumber) VALUES (" + fName + ", " + lName + ", " + pNumber + ");" ;
    }

    String getfName() {
        return fName;
    }
    String getlName() {
        return lName;
    }
    long getpNumber() {
        return pNumber;
    }
    String query(){
        return sql;
    }

}
