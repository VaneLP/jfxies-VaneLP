package com.example.practica1_u4;

public class Persona {
    // atributos de la clase Persona
    private String nombre;
    private String DNI;
    private int tlf;
    private int edad;

    // constructor al cual le pasamos el nombre, el DNI, el tlf y la edad
    protected Persona(String nombre, String DNI, String tlf, String edad) {

            this.nombre = nombre;
            this.DNI = DNI;
            this.tlf = Integer.parseInt(tlf);
            this.edad = Integer.parseInt(edad);

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
    public int getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {

            this.tlf = Integer.parseInt(tlf);
    }

    // edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(String edad) {

            this.edad = Integer.parseInt(edad);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", tlf=" + tlf +
                ", edad=" + edad +
                '}';
    }
}
