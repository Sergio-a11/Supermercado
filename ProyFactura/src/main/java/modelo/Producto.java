/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public abstract class Producto {
    protected String cod,nombre;
    protected double precioU;
    protected int cantidad;

    public Producto(String cod, String nombre, double precioU, int cantidad) {
        this.cod = cod;
        this.nombre = nombre;
        this.precioU = precioU;
        this.cantidad = cantidad;
    }
    
    public Producto() {
        this.cod = "";
        this.nombre = "";
        this.precioU = 0;
        this.cantidad = 0;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    public abstract double iva();

    public double valor()
    {
        return this.precioU * this.cantidad;
    }
}
