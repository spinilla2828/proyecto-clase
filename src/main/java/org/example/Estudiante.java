package org.example;

public class Estudiante {
    private String nombre;
    private byte edad;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.edad = 18;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
}
