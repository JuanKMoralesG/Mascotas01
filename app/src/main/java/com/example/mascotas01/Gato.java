package com.example.mascotas01;

public class Gato {
    public String nombre;
    public Double altura;
    public Double peso;
    public String colorPelaje;
    public String genero;
    public String raza;
    public Integer edad;

    public Gato(String nombre, Double altura, Double peso, String colorPelaje, String genero, String raza, Integer edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.colorPelaje = colorPelaje;
        this.genero = genero;
        this.raza = raza;
        this.edad = edad;
    }

    public void calcularTamaño(Double peso, Double altura){
        String tamaño = " ";
        if (peso <= 4 || altura <= 30){
            tamaño = "pequeño";
        }else if (peso <= 6 || altura <= 40) {
            tamaño = "mediano";
        }else{
            tamaño = "grande";
        }

        System.out.println(tamaño);
    }

    public void maullar(){
        System.out.println("El gato maulla");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public String getGenero() {
        return genero;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


}

