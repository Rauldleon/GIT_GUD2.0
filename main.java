/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raul_
 */
public class main {
    public static void main(String[] args){
        Archivos a = new Archivos();
        String linea=" ";
        linea=(a.leerArchivos("C:\\Users\\Didier\\Desktop\\PostFix\\src\\postfix\\datos.txt"));
        Pila pil = new Pila(linea);
        pil.operar();
        System.out.println("El resultado de las operaciones expresadas en el archivo es:"+pil.resultado());  
        
    }
    
}
