package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Interfaz.Acciones;

/**
 * @version 1.2
 * @since 2019
 * @author Carmen Bravo
 *
 */
public final class Cliente extends Persona implements Acciones {

    /**
     * son atributos de la clase cliente
     */
    private String formaPago;
    private String ruc;
    private boolean frecuente;
    
    public Cliente(){
        
    }

    public Cliente(String formaPago, String ruc, boolean frecuente) {
        this.formaPago = formaPago;
        this.ruc = ruc;
        this.frecuente = frecuente;
    }

    public Cliente(String formaPago, String ruc, boolean frecuente, String cedula, String nombre, String apellido, String telefono) {
        super(cedula, nombre, apellido, telefono);
        this.formaPago = formaPago;
        this.ruc = ruc;
        this.frecuente = frecuente;
    }

    public Cliente(String formaPago, String ruc, boolean frecuente, String  cedula, String nombre, String apellido, String telefono, String nombreConsesionario, String direccion) {
        super(cedula, nombre, apellido, telefono, nombreConsesionario, direccion);
        this.formaPago = formaPago;
        this.ruc = ruc;
        this.frecuente = frecuente;
    }

    public Cliente(String formaPago, String ruc, boolean frecuente, String cedula, String nombre, String apellido, String telefono, String nombreConsesionario, int codigo, String direccion) {
        super(cedula, nombre, apellido, telefono, nombreConsesionario, codigo, direccion);
        this.formaPago = formaPago;
        this.ruc = ruc;
        this.frecuente = frecuente;
    }
    
 
   


    //getters and setters
    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public boolean isFrecuente() {
        return frecuente;
    }

    public void setFrecuente(boolean frecuente) {
        this.frecuente = frecuente;
    }

    public static boolean ingresarCliente() {
        return false;

    }

    public static boolean modificarCliente() {
        return false;

    }

    public static boolean eliminarCliente() {
        return false;

    }
    
    
    //declaracion de los metodos
    public String revisar() {
        return " El Cliente " + super.getNombre() + " revisa el carro para poderlo comprar";
    }

    @Override
    public String comprar() {
        return " El cliente " + super.getNombre() + " compro un carro";
    }

    @Override
    public String vender() {
        return " El cliente" + super.getNombre() + " vendio su carro porque queria otro más cómodo";

    }

    @Override
    public String conducir() {
        return " El cliente " + super.getNombre() + " esta conduciendo";
    }
    

    /**
     * Metodo to String
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "formaPago=" + formaPago + ", ruc=" + ruc + ", frecuente=" + frecuente + '}';
    }

}

