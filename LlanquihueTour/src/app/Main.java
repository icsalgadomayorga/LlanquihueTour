package app;

import model.Direccion;
import model.Persona;
import model.Empleado;

public class Main {

    public static void main(String[] args) {

        Direccion direccion1 = new Direccion(
                "Baquedano 931",
                "Llanquihue",
                "Los Lagos"
        );

        Direccion direccion2 = new Direccion(
                "Montt 90",
                "Llanquihue",
                "Los Lagos"
        );

        Direccion direccion3 = new Direccion(
                "Errazuriz 206",
                "Llanquihue",
                "Los Lagos"
        );

        Persona empleado1 = new Empleado(
                "Juan Soto",
                "15.987.654-3",
                direccion1,
                "Guía Turístico",
                950000
        );

        Persona empleado2 = new Empleado(
                "Ana Gómez",
                "18.456.789-0",
                direccion2,
                "Coordinadora de Tours",
                1200000
        );

        Persona empleado3 = new Empleado(
                "Esteban Muñoz",
                "17.123.456-7",
                direccion3,
                "Chofer de tour",
                850000
        );

        System.out.println("=== SISTEMA LLANQUIHUE TOUR ===\n");

        System.out.println(empleado1);
        System.out.println();

        System.out.println(empleado2);
        System.out.println();

        System.out.println(empleado3);
    }
}