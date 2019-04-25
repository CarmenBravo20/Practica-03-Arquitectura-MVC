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

            System.out.println("**MENU PRINCIPAL**");
            System.out.println("1. CRUD Funcionario");
            System.out.println("2. CRUD Cliente");
            System.out.println("3. CRUD Auto");
            System.out.println("4. CRUD Camion");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción");
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
                        System.out.println("Seleccione una opción");
                        opcionMenuFuncionario = Sc.nextInt();

                                    switch (opcionMenuFuncionario) {
                            case 1:
                                System.out.println("****************************************************");
                                System.out.println("Ingrese la direccion de Consesionario de Vehiculos: ");
                                String direccion = scanner.nextLine();
                                System.out.println("Ingrese el nombre del Consesionario de vehiculos: ");
                                String nombreCon = scanner.nextLine();
                                System.out.println("Ingrese su Cedula:");
                                String cedula = scanner.nextLine();
                                System.out.println("Ingrese su Nombre:");
                                String nombre = scanner.nextLine();
                                System.out.println("Ingrese su Apellido:");
                                String apellido = scanner.nextLine();
                                System.out.println("Ingrese su cargo:");
                                String cargo = scanner.nextLine();
                                System.out.println("Ingrese su salario");
                                double salario = Sc.nextDouble();
                                System.out.println("Ingrese su area de trabajo:");
                                String area = scanner.nextLine();
                                System.out.println("Ingrese su horario:");
                                String horario = scanner.nextLine();
                                System.out.println("Ingresar su telefono");
                                String telefono = scanner.nextLine();

                                Funcionario fuc = new Funcionario(cargo, salario, area, horario, cedula, nombre, apellido, telefono, nombreCon, direccion);
                                controladorF.create(fuc);

                                break;
                            case 2:
                                System.out.println("*********************************");
                                System.out.println("Ingrese el codigo que desee leer");
                                System.out.println(controladorF.read(Sc.nextInt()));

                                break;
                            case 3:
                                System.out.println("**********************************");
                                System.out.println("Ingrese el codigo que desee modificar");
                                int codigo= Sc.nextInt();

                                System.out.println("Ingrese la direccion de Consesionario de Vehiculos: ");
                                direccion = scanner.nextLine();
                                System.out.println("Ingrese el nombre del Consesionario de vehiculos: ");
                                nombreCon = scanner.nextLine();
                                System.out.println("Ingrese su Cedula:");
                                cedula = scanner.nextLine();
                                System.out.println("Ingrese su Nombre:");
                                nombre = scanner.nextLine();
                                System.out.println("Ingrese su Apellido:");
                                apellido = scanner.nextLine();
                                System.out.println("Ingrese su cargo:");
                                cargo = scanner.nextLine();
                                System.out.println("Ingrese su salario");
                                salario = Sc.nextDouble();
                                System.out.println("Ingrese su area de trabajo:");
                                area = scanner.nextLine();
                                System.out.println("Ingrese su horario:");
                                horario = scanner.nextLine();
                                System.out.println("Ingresar su telefono");
                                telefono = scanner.nextLine();

                                fuc = new Funcionario(cargo, salario, area, horario, cedula, nombre, apellido, telefono, nombreCon, codigo, direccion);

                                controladorF.update(fuc);

                                break;
                            case 4:
                                System.out.println("********************************************");
                                System.out.println("Ingrese el codigo del Funcionario que desea eliminar ");
                                codigo = Sc.nextInt();
                                controladorF.delete(codigo);

                                break;
                            case 5:
                                System.out.println("*******************");
                                controladorF.listar();
                                break;
                                
                            case 6:
                                    //regresar
                                System.out.println("Regresando al menu principal");
                                break;
                                
                        }

                    } while (opcionMenuFuncionario != 6);
                    break;
}
}
