package org.example;

public class Circulo implements Figura{
    private double PI = 3.1416;
    private double radio;
    public Circulo(){
    }

    public Circulo(double PI) {
        this.PI = PI;
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "PI=" + PI +
                ", radio=" + radio +
                '}';
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    @Override
    public double calcularArea() {
        return this.PI * this.radio * this.radio;
    }
}
