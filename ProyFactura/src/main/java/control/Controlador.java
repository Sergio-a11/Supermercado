/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.*;
import vista.CajasMensaje;

/**
 *
 * @author Usuario
 */
public class Controlador {
    Tienda listaF;
    CajasMensaje objCM ;

    public Controlador() {
        this.listaF = new Tienda();
        this.objCM = new CajasMensaje();
    }
    
    public void iniciar(){
        int aux=0;
        objCM.setTitulo("Supermercado");
        do{
        
        
        listaF.getListado().add(new Factura(objCM.leerTexto("Digite numero de la Factura"),
                                        new Fecha(objCM.leerEntero("Digite fecha\nDia:"),objCM.leerEntero("Mes[numero]:"),objCM.leerEntero("Año:")),
                                        new Cliente(objCM.leerTexto("Digite codigo del cliente:"),objCM.leerTexto("Digite nombre del cliente:"),objCM.leerTexto("Digite telefono del cliente:")),
                
                                        new ArrayList<Producto>()));
        do{
        Producto p = nuevoProducto();    
        listaF.getListado().get(aux).getProductos().add(p);
        }while(objCM.confirmar("Desea registrar otro producto?"));
        
        
        aux+=1;    
        }while(objCM.confirmar("Desea registrar otra factura?"));
        objCM.mostrar("Total de la tienda\n"+listaF.toString());
    }
    
    public Producto nuevoProducto(){
        int opc;
        opc=objCM.seleccion("Factura \nEliga el producto a ingresar en la factura:\n");
        Producto objP = null;
        switch(opc){
            case 0:{
                objP = new Basico(objCM.leerTexto("Producto Basico\nDigite codigo:"),objCM.leerTexto("Digite nombre:"),
                                  objCM.leerDecimal("Digite Precio Unitario"),objCM.leerEntero("Digite cantidad:"));
                break;
            }
            case 1:{
                objP = new General(objCM.leerTexto("Producto General\nDigite codigo:"),objCM.leerTexto("Digite nombre:"),
                                  objCM.leerDecimal("Digite Precio Unitario"),objCM.leerEntero("Digite cantidad:"));
                break;
            }
            case 2:{
                objP = new Exento(objCM.leerTexto("Producto Exento\nDigite codigo:"),objCM.leerTexto("Digite nombre:"),
                                  objCM.leerDecimal("Digite Precio Unitario"),objCM.leerEntero("Digite cantidad:"));
                break;
            }
        }
        return objP;
    }
}
