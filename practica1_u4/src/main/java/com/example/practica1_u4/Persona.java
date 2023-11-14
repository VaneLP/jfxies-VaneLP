package com.example.practica1_u4;

public class Persona {
    // atributos de la clase Persona
    private String nombre;
    private String DNI;
    private String tlf;
    private String edad;

    // constructor al cual le pasamos el nombre, el DNI, el tlf y la edad
    protected Persona(String nombre, String DNI, String tlf, String edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.tlf = tlf;
        this.edad = edad;

    }

    // getters y setters
    // nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // DNI
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dni) {

        this.DNI = dni;
    }

    // tlf
    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    // edad
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {

        this.edad = edad;
    }
}
