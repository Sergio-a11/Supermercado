/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author dadxc
 */
public class Factura {
    private String nro;
    private Fecha fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos;

    public Factura(String nro, Fecha fecha, Cliente cliente, ArrayList<Producto> productos) {
        this.nro = nro;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
    }
    
    public Factura() {
        this.nro = "";
        this.fecha = new Fecha();
        this.cliente = new Cliente();
        this.productos = new ArrayList<Producto>();
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Factura" + "\nNumero:" + nro + "\nFecha:"+fecha.toString()+"\nTotal Factura:"+totalFactura()+"\nTotal IVA:"+iva();
    }
    
    public double totalFactura(){
        return iva()+subTotal();
    }
    
    public double subTotal(){
        double suma = 0;
        for (int i = 0; i < productos.size(); i++) {
            suma+=productos.get(i).valor();
        }
        return suma;
    }
    
    public double iva(){
        double sumIva = 0;
        for (int i = 0; i < productos.size(); i++) {
            sumIva+=productos.get(i).iva();
        }
        return sumIva;
    }
}
