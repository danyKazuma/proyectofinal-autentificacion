package com.nttdata.proyectofinal.model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String nombre;
    private String dni;
    private String correoElectronico;
    private String numeroCelular;
    private String password;

    public Usuario() {}

    public Usuario(String nombre, String dni, String correoElectronico, String numeroCelular, String password) {
        this.nombre = nombre;
        this.dni = dni;
        this.correoElectronico = correoElectronico;
        this.numeroCelular = numeroCelular;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}