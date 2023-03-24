package com.adecco.modelo;

import java.time.LocalDate;

public class Gerente extends Empleado{
    //1. Atributos
    private String departamento;
    //2. Métodos

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                "} " + super.toString();

    }

    //3. Constructores
    public Gerente(){}
    public Gerente(String nombre, float sueldo, LocalDate fNacimeinto) {
        super(nombre, sueldo, fNacimeinto);
    }

    //4. Setters Getters


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
