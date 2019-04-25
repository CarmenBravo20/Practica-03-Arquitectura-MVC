/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Camion;
import java.util.HashMap;
import java.util.Map;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @version 1.2
 * @since 2019
 * @author Carmen Bravo
 *
 */

// nombre de la clase
public class ControladorCamion {

    /*
    Atributos de la clase ControladorCamion
    */
   private Map<Integer,Camion>list;
   private int codigo;
   
   /*
   constructor
   */
   public ControladorCamion(){
       list= new HashMap<Integer,Camion>();
       codigo=0;
       
   }
   /**
    * Metodo de crear le paso un objeto Camion y le agrego a la lista
    * @param objeto 
    */
   
   public void create(Camion objeto){
       codigo++;
       objeto.setCodigo(codigo);
       list.put(codigo, objeto);
       
   }
   /**
    * metodo de leer de los cuales necesitamos pasar el codigo para poder leer
    * @param codigo
    * @return 
    */
   public Camion read(int codigo){
       return list.get(codigo);
   }
   /**
    * metodo de actualizar lo caul recibe como parametro el objeto
    * @param objeto 
    */
   public void update (Camion objeto){
    
           list.remove(objeto.getCodigo());
           list.put(objeto.getCodigo(), objeto);
       }
   
   
    /*
   metodo de eliminar lo cual necesitamos el codigo para poder eliminar
   */   
   public void delete(int codigo){
        
           list.remove(codigo);
        
       
   }
            
 
   /**
    * metodo de listar
    */
   public void listar(){
       
       System.out.println(list.values());
   }
}
