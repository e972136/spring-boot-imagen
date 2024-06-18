package com.pizzati.imagen.entity;

import java.math.BigDecimal;

public class ClientesResponse {

    Long id;
    String nombre;
    String rtn;
    String identidad;
    String direccion;
    int departamento;
    int ciudad;
    String numerotelefono;
    int gira;
    String extra;
    BigDecimal limite;
    int diaslimite;
    int cia;
    int usuarioingreso;
    BigDecimal saldo;

    int estado;

    @Override
    public String toString() {
        return "ClientesResponse{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", rtn='" + rtn + '\'' +
                ", identidad='" + identidad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", departamento=" + departamento +
                ", ciudad=" + ciudad +
                ", numerotelefono='" + numerotelefono + '\'' +
                ", gira=" + gira +
                ", extra='" + extra + '\'' +
                ", limite=" + limite +
                ", diaslimite=" + diaslimite +
                ", cia=" + cia +
                ", usuarioingreso=" + usuarioingreso +
                ", saldo=" + saldo +
                ", estado=" + estado +
                '}';
    }

    public ClientesResponse() {
    }

    public ClientesResponse(Long id, String nombre, String rtn, String identidad, String direccion, int departamento, int ciudad, String numerotelefono, int gira, String extra, BigDecimal limite, int diaslimite, int cia, int usuarioingreso, BigDecimal saldo, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.rtn = rtn;
        this.identidad = identidad;
        this.direccion = direccion;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.numerotelefono = numerotelefono;
        this.gira = gira;
        this.extra = extra;
        this.limite = limite;
        this.diaslimite = diaslimite;
        this.cia = cia;
        this.usuarioingreso = usuarioingreso;
        this.saldo = saldo;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(String numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public int getGira() {
        return gira;
    }

    public void setGira(int gira) {
        this.gira = gira;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public int getDiaslimite() {
        return diaslimite;
    }

    public void setDiaslimite(int diaslimite) {
        this.diaslimite = diaslimite;
    }

    public int getCia() {
        return cia;
    }

    public void setCia(int cia) {
        this.cia = cia;
    }

    public int getUsuarioingreso() {
        return usuarioingreso;
    }

    public void setUsuarioingreso(int usuarioingreso) {
        this.usuarioingreso = usuarioingreso;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
