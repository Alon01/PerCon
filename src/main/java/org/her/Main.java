package org.her;

import org.her.service.AgendService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        AgendService agendaService = new AgendService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = scanner.next();

        System.out.println("Apellido: ");
        String telefono = scanner.next();

        System.out.println("Número telefónico: ");
        String email = scanner.next();

        if (agendaService.agregarContacto(nombre, telefono, email)) {
            System.out.println("Contacto agregado exitosamente!");
        } else {
            System.out.println("Error al agregar contacto");
        }

        scanner.close();
    }
}