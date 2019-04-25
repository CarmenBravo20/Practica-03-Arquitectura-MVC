/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 * @version 1.2
 * @since 2019
 * @author Carmen Bravo
 *
 */
//clase controlador cliente
public class ControladorCliente {

    //aributos de la clase
    private Set<Cliente> lista;
    private int codigo; 

    //constructor
    public ControladorCliente() {
        lista = new HashSet<>();
        codigo = 0;
    }
     /**
    * Le paso un objeto cliente y le agrego a la lista
    * @param objeto 
    */
    public void create(Cliente objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);        
    }
  
    /**
     * Metodo de leer lo cual necesitamos pasar como parametro el codigo
     * @param codigo
     * @return el cliente
     */
    public Cliente read(int codigo){
        for (Cliente cliente : lista) {
            if(cliente.getCodigo() == codigo){
                return cliente;
            }
        }        
        return null;
    }
    /**
     * Metodo de actualizar lo cual necesitamos pasar como parametro un objeto
     * @param objeto 
     */
    public void update(Cliente objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    /**
     * Metodo de eliminar lo cual para esto necesitamos un codigo
     * @param codigo 
     */
    public void delete(int codigo){
        for (Cliente cliente : lista) {
            if(cliente.getCodigo() == codigo){
                lista.remove(cliente);
                break;
            }
        }  
    } 
    
    /*
    metodo de listar 
    */
    public void listar(){
        for(Cliente cliente: lista){
            System.out.println(cliente);
        }
    }
    
}
