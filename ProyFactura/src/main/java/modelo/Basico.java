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
public class Basico extends Producto{

    @Override
    public double iva() {
        return 0.05;
    }

    public Basico(String cod, String nombre, double precioU, int cantidad) {
        super(cod, nombre, precioU, cantidad);
    }

    public Basico() {
        super();
    }
    
    
    
}
