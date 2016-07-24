/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfix;
import java.util.*;
/**
 *
 * @author Didier
 */
public class Pila implements iPila{
    String linea;
    Vector pila;
    int result;
    
    public Pila(String linea){
        this.linea=linea;
        pila=new Vector(1,1);
    }
    public void setLinea(String linea){
        this.linea=linea;
    }
    public String getLinea(){
        return linea;
    }
    public void setPila(Vector pila){
        this.pila=pila;
    }
    public Vector getPila(){
        return pila;
    }
    public void setResult(int result){
        this.result=result;
    }
    public int getResult(){
        return result;
    }
    @Override
    public void operar() {
        int cont=0;
        int operacion=0;
        String cadenaNum="";
        
        while(cont<linea.length()){
            
            if((linea.charAt(cont))=='+'){
              
               operacion=((Integer)pila.elementAt((pila.size()-2)))+((Integer)pila.elementAt((pila.size()-1)));
               pila.removeElementAt(((pila.size()-2)));
               pila.removeElementAt(((pila.size()-1)));
               pila.addElement(operacion);
 
               
            }
            else if(linea.charAt(cont)=='-'){
               operacion=((Integer)pila.elementAt((pila.size()-2)))-((Integer)pila.elementAt((pila.size()-1)));
               pila.removeElementAt(((pila.size()-2)));
               pila.removeElementAt(((pila.size()-1)));
               pila.addElement(operacion);
               
                    }
            else if(linea.charAt(cont)=='*'){
               operacion=((Integer)pila.elementAt((pila.size()-2)))*((Integer)pila.elementAt((pila.size()-1)));
               pila.removeElementAt(((pila.size()-2)));
               pila.removeElementAt(((pila.size()-1)));
               pila.addElement(operacion);
               
        }
            else if(linea.charAt(cont)=='/'){
               operacion=((Integer)pila.elementAt((pila.size()-2)))/((Integer)pila.elementAt((pila.size()-1)));;
               pila.removeElementAt(((pila.size()-2)));
               pila.removeElementAt(((pila.size()-1)));
               pila.addElement(operacion);
            }
            else if(linea.charAt(cont)==' '){
    
            }
            else{
               if(linea.charAt(cont+1)!=' '){
                    cadenaNum+=Character.toString(linea.charAt(cont));
               }
               else if(linea.charAt(cont+1)==' '){
       
                    cadenaNum+=Character.toString(linea.charAt(cont));
                    int b=(pila.size()-1); 
                    pila.addElement(Integer.parseInt(cadenaNum)); 
                    cadenaNum="";
               }
            }
            cont+=1;
        }
        result=(Integer)pila.elementAt(0);
    }

    @Override
    public int resultado() {
        return result;
    }
    @Override
     public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Linea de datos:");
        sb.append(linea);
        sb.append("Pila de valores:");
        sb.append(pila);
        sb.append("Resultado:");
        sb.append(result);
        return sb.toString();
    }
    
}
