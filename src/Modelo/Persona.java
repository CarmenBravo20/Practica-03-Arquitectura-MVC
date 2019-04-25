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
// clase hija de consesionariovehiculos
public abstract class Persona extends ConsesionarioVehiculos {

    /**
     * atributos de la clase persona
     */
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    
    /**
     * Constructor vacio 
     */
    public Persona(){
        
    }

    /**
     *  constructor de la clase persona con sus atributos 
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono 
     */
    public Persona(String cedula, String nombre, String apellido, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    /**
     *  constructor de la clase persona con sus atributos mas los de la clase padre(consesionarioVehivulos)
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono
     * @param nombreConsesionario
     * @param codigo
     * @param direccion 
     */
    public Persona(String cedula, String nombre, String apellido, String telefono, String nombreConsesionario, String direccion) {
        super(nombreConsesionario, direccion);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Persona(String cedula, String nombre, String apellido, String telefono, String nombreConsesionario, int codigo, String direccion) {
        super(nombreConsesionario, codigo, direccion);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

   
 
     //getters and setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
     public static boolean ingresarPersona() {
        return true;

    }
     
      public static boolean modificarPersona() {
        return true;

    }

       public static boolean eliminarPersona() {
        return false;

    }
          /**
     * Metodo Abstracto
     * @return String (text)
     */
    public abstract String conducir();

    /**
     * Metodo to String
     * @return 
     */

    /*DE LA SUPER CLASE CONSESIONARIO VEHICULOS*/
    @Override
    public String toString() {
        return super.toString() + " cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + '}';
    }
       
}

