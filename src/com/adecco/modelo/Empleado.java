package com.adecco.modelo;

import java.time.LocalDate;

public class Empleado {
    //1 Atributos
    protected String nombre;
    protected float sueldo;
    protected LocalDate fNacimeinto;
    //2. Métodos

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", fNacimeinto=" + fNacimeinto +
                '}';
    }

    //3. Constructores
    public Empleado(){}
    public Empleado(String nombre, float sueldo, LocalDate fNacimeinto) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fNacimeinto = fNacimeinto;
    }


    //4. Setters y Getters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getfNacimeinto() {
        return fNacimeinto;
    }

    public void setfNacimeinto(LocalDate fNacimeinto) {
        this.fNacimeinto = fNacimeinto;
    }
}
