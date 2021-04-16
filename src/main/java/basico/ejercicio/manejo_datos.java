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
    public void llenarTxt(String nombre,String numero, String correo, String direccion,String alias, String lugar){
        String[] datos = new String[6];
        archivos llenar = new archivos();
        
        datos[0] = nombre;
        datos[1] = numero;
        datos[2] = correo;
        datos[3] = direccion;
        datos[4] = alias;
        datos[5] = lugar;
        archivos.EscribeFichero("txt\\registro.txt", datos);  
    }
    
    public String[] devolverString(){
        String[] datos = archivos.puntoComa();
        
        return datos;
    }
    
 // public void Rellenar_tabla(String a,String b,String c,String d,String e){
        
        
   //     DefaultTableModel modelo = (DefaultTableModel)Main.Tabla.getModel();
        //Esto es obligatorio
     //   if(modelo.getRowCount()>0){
       //     for (int i = modelo.getRowCount() -1; i >= 0; i--){
         //       modelo.removeRow(i);
           // } 
        //}
        
        

            //String[] fila = {a, b, c, d, e}; //las comas separan las filas
          //  modelo.addRow(fila); //Instrucción de llenado de fila
        //}  
    
}
