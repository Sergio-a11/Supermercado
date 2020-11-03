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
public class General extends Producto{
    
    @Override
    public int iva() {
        return 19;
    }

    public General(String cod, String nombre, double precioU, int cantidad) {
        super(cod, nombre, precioU, cantidad);
    }

    public General() {
        super();
    }
}
