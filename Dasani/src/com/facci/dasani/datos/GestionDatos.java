/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facci.dasani.datos;

import com.facci.dasani.logica.Inventario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 *
 * @author dtoala
 */
public class GestionDatos {
    
    public boolean grabarAlDisco(Inventario objetoInventario){
        try{
            
           BufferedWriter output = new BufferedWriter(new FileWriter("archivodatos.txt", true));
            
            //FileWriter fw = new FileWriter("archivodatos.txt");
            StringWriter sw = new StringWriter();
            sw.write(objetoInventario.codigo+" \t "+objetoInventario.descripcion+" \t "+objetoInventario.pvp+" \n");
            output.write(sw.toString());
            output.close();
            return true;
        }catch(Exception e){
            return false;
        }
        
       
        
    }
}
