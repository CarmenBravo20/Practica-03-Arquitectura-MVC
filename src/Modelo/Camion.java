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
public final class Camion extends Vehiculo implements Acciones {

    /**
     * son atributos de la clase camion
     */
    private String espacio;
    private double carga;
    private double pesoTara;

    /**
     * costructor de la clase camion
     */
    public Camion() {
    }

    /**
     * constructor de la clase camion con sus atributos
     *
     * @param espacio
     * @param carga
     * @param pesoTara
     */

    public Camion(String espacio, double carga, double pesoTara) {
        this.espacio = espacio;
        this.carga = carga;
        this.pesoTara = pesoTara;
    }

    /**
     * constructor de la clase camion con sus atributos mas el del su padre
     * vehiculo
     *
     * @param espacio
     * @param carga
     * @param pesoTara
     * @param marca
     * @param color
     * @param modelo
     * @param placa
     */
    public Camion(String espacio, double carga, double pesoTara, String marca, String color, String modelo, String placa) {
        super(marca, color, modelo, placa);
        this.espacio = espacio;
        this.carga = carga;
        this.pesoTara = pesoTara;
    }

    public Camion(String espacio, double carga, double pesoTara,String marca, String color, String modelo, String placa, String nombreConsesionario, String direccion) {
        super(marca, color, modelo, placa, nombreConsesionario, direccion);
        this.espacio = espacio;
        this.carga = carga;
        this.pesoTara = pesoTara;
    }

    public Camion(String espacio, double carga, double pesoTara, String marca, String color, String modelo, String placa, String nombreConsesionario, int codigo, String direccion) {
        super(marca, color, modelo, placa, nombreConsesionario, codigo, direccion);
        this.espacio = espacio;
        this.carga = carga;
        this.pesoTara = pesoTara;
    }
    
    
    //getters and setters

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getPesoTara() {
        return pesoTara;
    }

    public void setPesoTara(double pesoTara) {
        this.pesoTara = pesoTara;
    }

    public static boolean revisarCamion() {
        return false;
        
    }

    public static boolean darMantenimiento() {
        return true;
      
    }

    public static boolean manejar() {
        return false;

    }
  
    //declaracion de los metodos
   
    public String revisar() {
        return " El camion " +  super.getColor() + " esta ya de reparar ";
    }

    public String lavar() {
        return " El camion " +  super.getModelo() + " esta lavado  ";
    }

    @Override
    public String comprar() {
        return " El camion " +  super.getModelo() + " es recien comprado" ;
    }

    @Override
    public String vender() {
        return " El camion " +  super.getColor() + " es vendido debido a que necesitaban otro mas grande ";

    }

    @Override
    public String gustar() {
        return "El camion " + super.getMarca() + " es bonito ";
    }

    
    /**
     * Metodo to String
     * @return 
     */
   
    @Override
    public String toString() {
        return "\n" + super.toString() + "espacio=" + espacio + ", carga=" + carga + ", pesoTara=" + pesoTara + '}';
    }

}

