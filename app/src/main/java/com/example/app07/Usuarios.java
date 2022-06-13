package com.example.app07;

import java.io.Serializable;

public class Usuarios implements Serializable {
    private int idUser;
    private String user;
    private String contraseña;
    private String nombreCompleto;
    private String email;

    //Constructores

    public Usuarios(int idUser, String user, String contraseña, String nombreCompleto, String email) {
        this.idUser = idUser;
        this.user = user;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
    }

    public Usuarios() {
    }

    //Encapsulamiento

    public int getIdUser() {
        return idUser;
    }

    public String getUser() {
        return user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Funciones



}
