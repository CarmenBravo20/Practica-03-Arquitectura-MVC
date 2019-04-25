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
// clase hija de vehiculo
public final class Auto extends Vehiculo implements Acciones {

    /**
     * son atributos de la clase auto
     */
    private String capacidad;
    private String comididad;
    private String descapotable;

    /**
     * constructor vacio
     */
    public Auto() {
    }

    /**
     * constructor con todos los datos de la clase Auto
     *
     * @param capacidad
     * @param comididad
     * @param descapotable
     */
    public Auto(String capacidad, String comididad, String descapotable) {
        this.capacidad = capacidad;
        this.comididad = comididad;
        this.descapotable = descapotable;
    }

    /**
     * constructor con todos sus datos y de los de la clase padre
     *
     * @param capacidad
     * @param comididad
     * @param descapotable
     * @param marca
     * @param color
     * @param modelo
     * @param placa
     */
    public Auto(String capacidad, String comididad, String descapotable, String marca, String color, String modelo, String placa) {
        super(marca, color, modelo, placa);
        this.capacidad = capacidad;
        this.comididad = comididad;
        this.descapotable = descapotable;
    }

    public Auto(String capacidad, String comididad, String descapotable,String marca, String color, String modelo, String placa, String nombreConsesionario, String direccion) {
        super(marca, color, modelo, placa, nombreConsesionario, direccion);
        this.capacidad = capacidad;
        this.comididad = comididad;
        this.descapotable = descapotable;
    }

    public Auto(String capacidad, String comididad, String descapotable, String marca, String color, String modelo, String placa, String nombreConsesionario, int codigo, String direccion) {
        super(marca, color, modelo, placa, nombreConsesionario, codigo, direccion);
        this.capacidad = capacidad;
        this.comididad = comididad;
        this.descapotable = descapotable;
    }

    
    //getter and setters
    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getComididad() {
        return comididad;
    }

    public void setComididad(String comididad) {
        this.comididad = comididad;
    }

    public String getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(String descapotable) {
        this.descapotable = descapotable;
    }

    /**
     * Metodo revisar estado
     *
     * @return false
     */
    public static boolean revisarEstado() {
        return false;

    }

    /**
     * metodo lavar auto
     *
     * @return true
     */
    public static boolean lavarAuto() {
        return true;

    }

    /**
     * metodo de comprar auto
     *
     * @return false
     */
    public static boolean comprarAuto() {
        return false;

    }
 /**
     * 
     * Declaracion de los metodos
     */

    public String revisar() {
        return " El Auto " + super.getModelo() + " esta ya de reparar";
    }

    public String lavar() {
        return " El Auto " + super.getModelo() + " esta lavado";
    }

    @Override
    public String comprar() {
        return " El Auto " + super.getMarca() + " es recien comprado";
    }

    @Override
    public String vender() {
        return " El Auto de" + super.getPlaca() + " es vendido debido aque necesitaban otro mas grande";

    }
    @Override
    public String gustar() {
        return " El Auto " + super.getMarca() + " es muy bonito ";
    }

    
    @Override
    public String toString() {
        return super.toString() + "capacidad=" + capacidad + ", comididad=" + comididad + ", descapotable=" + descapotable + '}';
    }

}
