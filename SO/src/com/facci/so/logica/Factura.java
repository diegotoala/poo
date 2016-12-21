/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facci.so.logica;

/**
 *
 * @author dtoala
 */
public class Factura {
    
    public String codigo;
    public Cliente objetoCliente = new Cliente();
    public Producto[] listaProductos = new Producto[10];
    
    public int apuntadorProducto = 0;
    
    public boolean agregarProducto(Producto objetoProducto){
        
        if(apuntadorProducto<10){
            this.listaProductos[apuntadorProducto] = objetoProducto;
            apuntadorProducto++;
        }
        
        return false;
    }
    
}
