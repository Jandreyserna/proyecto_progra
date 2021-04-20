/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico.ejercicio;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jandr
 */


public class manejo_datos {
    public static String direccion;
    public static String correo;
    public static String alias;
    public static String nombre;
    public static int numero;
    
    public static void abrirTxt(){
        try {
            archivos a = new archivos();
            String s = a.LeerTxt("txt\\registro.txt");
            System.out.println(s);
        } catch (IOException ex) {
            Logger.getLogger(manejo_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void llenarTxt(String nombre,String[] numero, String correo, String direccion,String alias, String lugar) throws IOException{
        String[] num = new String[numero.length];
        String[] datos = new String[5];
        archivos llenar = new archivos();
        
        datos[0] = nombre;
        num = numero;
        datos[1] = correo;
        datos[2] = direccion;
        datos[3] = alias;
        datos[4] = lugar;
        archivos.EscribeFichero("txt\\registro.txt", datos, num);  
    }
    
   
    
    public String[] devolverString(){
        String[] datos = archivos.puntoComa();
        
        return datos;
    }

 public String[] BusquedaNombre(String Nombre){
        String[] encontrados = archivos.busqueda(Nombre);
        return encontrados;
    }
    
}
