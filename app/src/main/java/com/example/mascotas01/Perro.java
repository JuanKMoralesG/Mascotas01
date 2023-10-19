package com.example.mascotas01;

public class Perro {

    String nombre;
    double altura;
    double peso;
    String colorPelaje;
    String genero;
    String raza;
    Integer edad;

    //2. Definir metodos
    public Perro (String nombre, double altura,double peso, String colorPelaje, String genero, String raza, Integer edad){
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.colorPelaje = colorPelaje;
        this.genero = genero;
        this.raza = raza;
        this.edad = edad;

    }

    public double calcularTamano(double peso, double altura){

    }

    public void ladrar(){
        System.out.println("Su Perro ladra saludablemente");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
