package org.example;

import org.example.herenciamultiple.Alumno;
import org.example.herenciamultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("area=" + cuadrado.calcularArea());
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area del circulo:" + circulo.calcularArea());
        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Gaby");
        ada.setArte("Musica");
        ada.setDeporte("Natación");
        System.out.println(ada);
        ada.ensayar("Guitarra");
        ada.entrenar();
        ada.presentarCompetencia("Alberca olímpica UNAM");

    }


    }
