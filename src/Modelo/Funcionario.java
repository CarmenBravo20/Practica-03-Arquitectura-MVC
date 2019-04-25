/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Interfaz.Acciones;


/**
 * @version 1.2
 * @since 2019
 * @author Carmen Bravo
 *
 */
//clase hija de Persona
public final class Funcionario extends Persona implements Acciones{
    /**
     * son atributos de la clase funcionario
     */
    private String cargo;
    private double salario;
    private String area;
    private String horario;
    
    /**
     * Constructor vacio
     */
    public Funcionario(){
        
    }
    
    /**
     *  constructor de la clase persona con sus atributos
     * @param cargo
     * @param salario
     * @param area
     * @param horario 
     */

    public Funcionario(String cargo, double salario, String area, String horario) {
        this.cargo = cargo;
        this.salario = salario;
        this.area = area;
        this.horario = horario;
    }
    /**
     *  constructor de la clase persona con sus atributos mas los de la clase padre(persona)
     * @param cargo
     * @param salario
     * @param area
     * @param horario
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono 
     */

    public Funcionario(String cargo, double salario, String area, String horario, String cedula, String nombre, String apellido, String telefono) {
        super(cedula, nombre, apellido, telefono);
        this.cargo = cargo;
        this.salario = salario;
        this.area = area;
        this.horario = horario;
    }

    /**
     *  constructor de la clase persona con sus atributos, mas los de la clase padre(persona) mas la clase abuelo(consesionarioVehivulos)
     * @param cargo
     * @param salario
     * @param area
     * @param horario
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono
     * @param nombreConsesionario
     * @param codigo
     * @param direccion 
     */
    public Funcionario(String cargo, double salario, String area, String horario, String cedula, String nombre, String apellido, String telefono, String nombreConsesionario, String direccion) {
        super(cedula, nombre, apellido, telefono, nombreConsesionario, direccion);
        this.cargo = cargo;
        this.salario = salario;
        this.area = area;
        this.horario = horario;
    }

    public Funcionario(String cargo, double salario, String area, String horario, String cedula, String nombre, String apellido, String telefono, String nombreConsesionario, int codigo, String direccion) {
        super(cedula, nombre, apellido, telefono, nombreConsesionario, codigo, direccion);
        this.cargo = cargo;
        this.salario = salario;
        this.area = area;
        this.horario = horario;
    }


   
    // getters  and setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

     public static boolean ingresarFuncionario() {
        return false;

    }
     
      public static boolean modificarFuncionario() {
        return false;

    }

       public static boolean eliminarFuncionario() {
        return false;

    }
           /**
     * 
     * Declaracion de los metodos
     */
   
    public String revisar(){
        return " El funcionario " + super.getNombre() + " esta yendo a revisar los carros";
    }
    
    public String lavar(){
        return " El funcionario " + super.getNombre() + " esta lavando el carro";
    }
    

    @Override
    public String comprar() {
        return " El funcionario " + super.getNombre()+ " compro un carro";
    }

    @Override
    public String vender() {
       return " El funcionario " + super.getNombre() + " vendio el carro";
    
    }

    @Override
    public String conducir() {
        return " El funcionario " + super.getNombre() + " esta conduciendo";
    }

       /**
     * Metodo to String
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + " cargo=" + cargo + ", salario=" + salario + ", area=" + area + ", horario=" + horario + '}';
    }
       
    
}
