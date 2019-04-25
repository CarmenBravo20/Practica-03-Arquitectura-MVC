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
}
}