/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raul_
 */
import java.io.*;
       
public class archivos{
    public String leerArchivos(String direccion){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                //Hace el ciclo mientra bfRead tiene datos
                temp = temp + bfRead;//guardado e; texto del archivo
            }
            texto = temp;
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        return texto;
    }
}
    