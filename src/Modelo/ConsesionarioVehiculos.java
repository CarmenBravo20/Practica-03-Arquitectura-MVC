/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


/**
 * @version 1.2
 * @since 2019
 * @author Carmen Bravo
 *
 */
//clase abuelo
//implementar todos los metodos
//la clase string devuelve un entero con el compare to solo con el 0,1,-1
public class ConsesionarioVehiculos implements Comparable<ConsesionarioVehiculos> {

    /**
     * atributos de la lase consesionarioVehiculos
     */
    private String nombreConsesionario;
    private int codigo;
    private String direccion;

    /**
     * constructor de la clase consesionarioVehiculo
     */
    public ConsesionarioVehiculos() {
           codigo++;
    }
 
   /**
    * constructor de la clase consesionarioVehiculos con sus atributos
    * @param nombreConsesionario
    * @param codigo
    * @param direccion 
    */

    public ConsesionarioVehiculos(String nombreConsesionario, String direccion) {
        this.nombreConsesionario = nombreConsesionario;
        //this.codigo = codigo;
        this.direccion = direccion;
    }

    public ConsesionarioVehiculos(String nombreConsesionario, int codigo, String direccion) {
        this.nombreConsesionario = nombreConsesionario;
        this.codigo = codigo;
        this.direccion = direccion;
    }

 
    //getters and setters

    public String getNombreConsesionario() {
        return nombreConsesionario;
    }

    public void setNombreConsesionario(String nombreConsesionario) {
        this.nombreConsesionario = nombreConsesionario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /*ES UN  METODO SOBRE ESCRITO DE UNA SUPER CLASE LA SUPER CLASE STRING*/
    @Override
    public String toString() {
        return "ConsesionarioVehiculos{" + "nombreConsesionario=" + nombreConsesionario + ", codigo=" + codigo + ", direccion=" + direccion + '}';
    }

    //la clase object y este es la clase padre de los demas, esta implementado los metodos equals
    // genera un codigo unico que no se debe repetir po nada aleatorio
    /*ES UN METODO QUE esta sobre escrito */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.codigo;
        return hash;
    }

    /**
     * this es la clase
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {//esta clase es igual al objeto
            return true;
        }
        if (obj == null) {//cuando esta vacio o cuando el constructo no recibe parametos
            return false;
        }
        if (getClass() != obj.getClass()) {//obtiene la clase en la que esta actualmente, ala que esta como parametro
            return false;
        }
        final ConsesionarioVehiculos other = (ConsesionarioVehiculos) obj;//final es una constante , esta declarando una constante de un objeto
        if (this.codigo != other.codigo) {//el downcasting es una conversion //si es distinto 
            return false;
        }
        return true;//caso contrario retorna un true 

    }

    //es para saber quien es mayor a quien
    @Override
    public int compareTo(ConsesionarioVehiculos t) {
         if (nombreConsesionario.compareTo(t.getNombreConsesionario()) >=1){
             return 1;
         }else if(nombreConsesionario.compareTo(t.getNombreConsesionario()) <=-1){
            return -1;
         }else{
             return 0;
         }
     
    }

}
