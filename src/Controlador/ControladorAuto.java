/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Auto;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @version 1.2
 * @since 2019
 * @author Carmen Bravo
 *
 */
public class ControladorAuto {
    // ATRIBUTOS DE LA CLASE
    private SortedSet<Auto> listaOrd;  /*SORTEDSET es como tipo list que hace que la clase AUTO se contengan todos los objetos*/
    private int codigo;
   
    
    /*CRUD == CREATE, READ, UPDATE, DELETE*/
    
    public ControladorAuto() {
        listaOrd = new TreeSet<>();
        codigo = 0;
    }
    
    public void create(Auto objeto){
        codigo++;       // Empieza e cualquier valor
        objeto.setCodigo(codigo);       
        listaOrd.add(objeto);
    }
    
    public Auto read(int codigo){
        for (Auto auto : listaOrd) {
            if(auto.getCodigo() == codigo){
                return auto;
            }
        }
        return null;
    }            
    
    public void update(Auto objeto){
        for(Auto auto:listaOrd){
        if(auto.equals(objeto)){
            listaOrd.remove(auto);
            listaOrd.add(objeto);
            break;
        }
    }
    }

    
    public void delete(int codigo){
        for (Auto au : listaOrd) {
            if(au.getCodigo() == codigo){
                listaOrd.remove(au);                
                //listaOrdenada.clear();
                System.out.println("Borrado....");  
                break;
            }            
        }
    }
    
    public void imprimirListaOrdenada(){
        System.out.println("Lista Ordenada por nombre");
        for (Auto auto : listaOrd) {
            System.out.println(auto);
        }
    }
    
 

    
    
    
}
