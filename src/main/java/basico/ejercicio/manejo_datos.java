/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico.ejercicio;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
 
    boolean repetido(String nombre) {
         boolean repetido = archivos.Busquedarepetido(nombre);
     return repetido;
    }

   public void cambiar(String[] datos, String[] Ndatos) throws IOException {
         archivos.hacer_cambio(datos,Ndatos);
                  
         
    }


    void llenarTxt2(String nombre, String[] numero, String correo, String direccion, String alias, String lugar, String Nombreevaluar) throws IOException {
         String[] num = new String[numero.length];
        String[] datos = new String[5];
        archivos llenar = new archivos();
        
        datos[0] = nombre;
        num = numero;
        datos[1] = correo;
        datos[2] = direccion;
        datos[3] = alias;
        datos[4] = lugar;
        JOptionPane.showMessageDialog(null, "si llamo la funcion");
        archivos.EscribeFichero2("txt\\registro1.txt", datos, num, Nombreevaluar);
    }
}

    
