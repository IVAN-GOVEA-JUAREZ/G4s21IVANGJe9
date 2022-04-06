/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author SpaceWolf
 */
public class Almacen {
    
    public void grabar(String cadena){
        try{
            FileWriter archivo = new FileWriter("datos.txt",true);
            BufferedWriter almacena = new BufferedWriter(archivo);
            almacena.write(cadena+"\n");
            almacena.close();
        }catch(Exception ex){
            ex.printStackTrace();//solo se pone en desarrollo y se quita ya cuando lo sacas online
        }
        
    }
    
    public ArrayList<String> leer(){
        ArrayList<String> informacion = new ArrayList<String>();
        try{
            FileReader archivo = new FileReader("datos.txt");
            BufferedReader datos = new BufferedReader(archivo);
            String Lineas;
            while((Lineas = datos.readLine())!= null) {
                informacion.add(Lineas);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return informacion;
    }
        
    }

