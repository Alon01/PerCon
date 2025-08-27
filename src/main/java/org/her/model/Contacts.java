package org.her.model;

/**
 * Clase que genera elementos del tipo de la clase que contienen los datos de la misma(el tipo de elementos).
 */
public class Contacts {
    private final String fName;
    private final String lName;
    private final String pNumber;

    public Contacts(String fName, String lName, String pNumber){
        //sql = "INSERT INTO alonso.contacts (fName, lName, pNumber) VALUES (" + fName + ", " + lName + ", " + pNumber + ");" ;
        this.fName = fName;
        this.lName = lName;
        this.pNumber = pNumber;
    }

    String getfName() {
        return fName;
    }
    String getlName() {
        return lName;
    }
    String getpNumber() {
        return pNumber;
    }

}
