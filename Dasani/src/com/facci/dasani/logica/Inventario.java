/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facci.dasani.logica;

import com.facci.dasani.datos.GestionDatos;

/**
 *
 * @author dtoala
 */
public class Inventario {
    
    public int codigo;
    public String descripcion;
    public double pvp;
    
    public boolean guardarDatos(){
        if(this.codigo > 0 && !this.descripcion.contentEquals(" ") && this.pvp > 0){
            GestionDatos objetoGestion = new GestionDatos();
            if(objetoGestion.grabarAlDisco(this))
                return true;
            return false;
        }
        return false;
    }
    
}
