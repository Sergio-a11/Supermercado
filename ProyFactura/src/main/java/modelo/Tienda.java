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
public class Tienda {
    private ArrayList<Factura> listado;

    public Tienda(ArrayList<Factura> listado) {
        this.listado = listado;
    }
    
    public Tienda() {
        this.listado = new ArrayList<Factura>();
    }

    public ArrayList<Factura> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Factura> listado) {
        this.listado = listado;
    }

    @Override
    public String toString() {
        String msj = "";
        for (int i = 0; i < listado.size(); i++) {
            msj+=listado.get(i).toString();
        }
        msj+= "\nTotal de ventas:"+totalVentas()+"\nTotal Ivas: "+totalIVAS();
        return msj;
    }
    
    public double totalVentas(){
        double suma = 0;
        for (int i = 0; i < listado.size(); i++) {
            suma+=listado.get(i).totalFactura();
        }
        return suma;
    }
    
    public double totalIVAS(){
        double suma = 0;
        for (int i = 0; i < listado.size(); i++) {
            suma+=listado.get(i).iva();
        }
        return suma;
    }
}
