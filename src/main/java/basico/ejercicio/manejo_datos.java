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
    public void llenarTxt(String nombre,String numero, String correo, String direccion,String alias){
        String[] datos = new String[5];
        archivos llenar = new archivos();
        
        datos[0] = nombre;
        datos[1] = numero;
        datos[2] = correo;
        datos[3] = direccion;
        datos[4] = alias;
        archivos.EscribeFichero("C:\\Users\\jandr\\Documents\\NetBeansProjects\\Ejercicio\\src\\main\\java\\txt\\registro.txt", datos);  
    }
    
    
    
}
