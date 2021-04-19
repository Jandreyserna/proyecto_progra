/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico.ejercicio;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jandr
 */
public class archivos {
    public static String texto = "";
    
    
    public String LeerTxt(String direction) throws IOException{// direccion del archivo
        
        
        try{
            BufferedReader bf = new BufferedReader (new FileReader (direction));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                //haz el ciclo mientras bf tiene datos
                temp = temp + bfRead; // Guarda el Texto en el archivo
                
            }
            texto = temp;
            
        }catch(FileNotFoundException e){ // si no encuentra el archivo muestra el error
            System.err.println("No se encontro el archivo");    
        } 
        return texto;
    }
 
     
    public static void EscribeFichero (String direction,String[] datos, String[] numero) throws IOException{
        File f;
        FileWriter fichero = null;
        BufferedWriter bw;
        PrintWriter pw = null;
        
        try
        {
            f = new File(direction);
            fichero = new FileWriter(f,true);
            bw = new BufferedWriter(fichero);
            pw = new PrintWriter(bw);
            
            for(int i = 0; i < 5; i++){  
                pw.write(datos[i]);
                pw.append(",");
            }
            boolean resultado;       
            for (int j = 0; j < numero.length; j++) {
                resultado = comparar_numeros(numero[j]);
                if(resultado == true){
                       j = numero.length;
                       pw.append(";");
                       JOptionPane.showMessageDialog(null, "El numero ya existe en este registro");
                   } else if(j + 1 == numero.length ){
                       pw.write(numero[j]);
                       pw.append(";");
                   }else{
                       pw.write(numero[j]);
                       pw.append(",");
                   }
            }
             pw.close();
            bw.close();
   
            } catch(FileNotFoundException e){ // si no encuentra el archivo muestra el error
            System.err.println("No se encontro el archivo");    
        }    
    }
    
public static boolean comparar_numeros(String dato){
    int encontrado = 0;
    String[] divididoPuntos = texto.split(";");
    for(int x = 0; x < divididoPuntos.length; x = x + 1){
        String divididoComas;
        divididoComas = divididoPuntos[x];
        String[] dividido = divididoComas.split(","); 
        
        for (int z = 0; z < dividido.length; z = z + 1){
            if(dato.equals(dividido[z])){
                encontrado = 1;
            }
        }
    }
        return encontrado == 1;
    }

public static String[] puntoComa(){
    String[] divididoPuntos = texto.split(";");
    
    return divididoPuntos; 
    
    
}
    
}
  

    

