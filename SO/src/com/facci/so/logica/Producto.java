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
public class Producto {
    
    public String codigo;
    public String nombre;
    public double precioUnitario;
    public int cantidad;
    public double precioTotal;
    
    public Producto[] cargarListaProductosDefault(){
        
        Producto[] lista = new Producto[10];
        
        Producto producto1 = new Producto();
        producto1.codigo = "CCL";
        producto1.nombre = "Ciclon 200g";
        producto1.precioUnitario = 2;
        
        Producto producto2 = new Producto();
        producto2.codigo = "PBB";
        producto2.nombre = "Perla Bebe ";
        producto2.precioUnitario = 1.5;
        
        Producto producto3 = new Producto();
        producto3.codigo = "AJX";
        producto3.nombre = "Ajax Gel 500g";
        producto3.precioUnitario = 2.5;
        
        
        lista[0]= producto1;
        lista[1]= producto2;
        lista[2]= producto3;
        
        return lista;
    }
    
}
