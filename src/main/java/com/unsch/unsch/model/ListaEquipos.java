/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsch.unsch.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


  @Entity
  public class ListaEquipos {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String dependencia;
        private String descripcion;
        private int cantidad;          // Si la cantidad es un número entero
        private double valorUnitario;  // Si el valor unitario tiene decimales
        private double valorTotal;     // Lo mismo para el valor total

    public ListaEquipos() {
    }

    public ListaEquipos(Long id, String dependencia, String descripcion, int cantidad, double valorUnitario, double valorTotal) {
        this.id = id;
        this.dependencia = dependencia;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
        
        
        
        
  }