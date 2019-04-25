/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorAuto;
import Controlador.ControladorCamion;
import Controlador.ControladorCliente;
import Controlador.ControladorFuncionario;
import java.util.Scanner;

/**
 * @version 1.2
 * @since 2019
 * @author Carmen Bravo
 *
 */
public class Principal {

  public static void main(String[] args) {


        Scanner Sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        // creacion de las variables
        int opcionMenuPrincipal = 0;
        int opcionMenuFuncionario = 0;
        int opcionMenuCliente = 0;
        int opcionMenuAuto = 0;
        int opcionMenuCamion = 0;

        /**
         * Instancias de los controladores
         */
        ControladorFuncionario controladorF = new ControladorFuncionario();
        ControladorCliente controladorC = new ControladorCliente();
        ControladorAuto controladorA = new ControladorAuto();
        ControladorCamion controladorCa = new ControladorCamion();    
           do {

            System.out.println("MENU PRINCIPAL");
            System.out.println("1. CRUD Funcionario");
            System.out.println("2. CRUD Cliente");
            System.out.println("3. CRUD Auto");
            System.out.println("4. CRUD Camion");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción");
            opcionMenuPrincipal = Sc.nextInt();
            switch (opcionMenuPrincipal) {
                case 1:

                    //opcion para el crud para la clase Funcionario
                    do {
                        System.out.println("**BIENVENIDO AL MENU DE FUNCIONARIO**");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. List");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuFuncionario = Sc.nextInt();

                        switch (opcionMenuFuncionario) {
}
}
