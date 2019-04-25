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
import Modelo.Auto;
import Modelo.Camion;
import Modelo.Cliente;
import Modelo.Funcionario;
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

            System.out.println("*******************");
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
                        System.out.println("**************************************");
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
                                int codigo = Sc.nextInt();

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
                case 2:
                    //opcion para el crud para la clase cliente
                    do {
                        System.out.println("**********************************");
                        System.out.println("**BIENVENIDO AL MENU DE CLIENTE**");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. List");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("Seleccione una opción");
                        opcionMenuCliente = Sc.nextInt();

                        switch (opcionMenuCliente) {
                            case 1:
                                System.out.println("*****************************************************");
                                System.out.println("Ingrese la direccion de Consesionario de Vehiculos: ");
                                String direccion1 = scanner.nextLine();
                                System.out.println("Ingrese el nombre del Consesionario de vehiculos: ");
                                String nombreC = scanner.nextLine();
                                System.out.println("Ingrese su Cedula:");
                                String cedula = scanner.nextLine();
                                System.out.println("Ingrese su Nombre:");
                                String nombre = scanner.nextLine();
                                System.out.println("Ingrese su Apellido:");
                                String apellido = scanner.nextLine();
                                System.out.println("usted va muy frecuente al consesionario de vehiculos");
                                String frecuente = scanner.nextLine();
                                System.out.println("Ingresar su telefono");
                                String telefono = scanner.nextLine();
                                System.out.println("Ingresar su forma de pago");
                                String formaPago = scanner.nextLine();
                                System.out.println("Ingresar su ruc");
                                String ruc = scanner.nextLine();
                                Cliente c = new Cliente(formaPago, ruc, true, cedula, nombre, apellido, telefono, nombreC, direccion1);
                                controladorC.create(c);
                                break;
                            case 2:
                                System.out.println("********************************");
                                System.out.println("Ingrese el codigo que desee leer");
                                System.out.println(controladorC.read(Sc.nextInt()));

                                break;
                            case 3:
                                System.out.println("*******************************************");
                                System.out.println("Ingrese el codigo que desee modificar");
                                int codigo = Sc.nextInt();
                                System.out.println("Ingrese la direccion de Consesionario de Vehiculos: ");
                                direccion1 = scanner.nextLine();
                                System.out.println("Ingrese el nombre del Consesionario de vehiculos: ");
                                nombreC = scanner.nextLine();
                                System.out.println("Ingrese su Cedula:");
                                cedula = scanner.nextLine();
                                System.out.println("Ingrese su Nombre:");
                                nombre = scanner.nextLine();
                                System.out.println("Ingrese su Apellido:");
                                apellido = scanner.nextLine();
                                System.out.println("usted va muy frecuente al consesionario de vehiculos");
                                frecuente = scanner.nextLine();
                                System.out.println("Ingresar su telefono");
                                telefono = scanner.nextLine();
                                System.out.println("Ingresar su forma de pago");
                                formaPago = scanner.nextLine();
                                System.out.println("Ingresar su ruc");
                                ruc = scanner.nextLine();
                                c = new Cliente(formaPago, ruc, true, cedula, nombre, apellido, telefono, nombreC, codigo, direccion1);

                                controladorC.update(c);

                                break;

                            case 4:
                                System.out.println("******************************************************");
                                System.out.println("Ingrese el codigo del Cliente  que desea eliminar ");
                                codigo = Sc.nextInt();
                                controladorC.delete(codigo);

                                break;
                            case 5:
                                System.out.println("********************************************************");
                                controladorC.listar();
                                break;

                            case 6:

                                //regresar
                                System.out.println("Regresando al menu principal");
                                break;

                        }

                    } while (opcionMenuCliente != 6);
                    break;
                     case 3:

                    //opcion para el crud para la clase Auto
                    do {
                        System.out.println("******************************");
                        System.out.println("**BIENVENIDO AL MENU DE AUTO**");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Lista Ordenada");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuAuto = Sc.nextInt();

                        switch (opcionMenuAuto) {
                            case 1:

                                System.out.println("******************************************************");
                                System.out.println("Ingrese la direccion de Consesionario de Vehiculos : ");
                                String direccion1 = scanner.nextLine();
                                System.out.println("El nombre del consesionario de Vehiculos: ");
                                String nombreC = scanner.nextLine();
                                System.out.println("Ingrese el auto que tiene");
                                String auto = scanner.nextLine();
                                System.out.println("Ingrese la capacidad de su auto");
                                String capacidad = scanner.nextLine();
                                System.out.println("la comodidad de su auto:");
                                String comodidad = scanner.nextLine();
                                System.out.println("Su auto es descapotable");
                                String descapotable = scanner.nextLine();
                                System.out.println("Ingresar la marca de su auto");
                                String marca = scanner.nextLine();
                                System.out.println("Ingresar el color de su auto");
                                String color = scanner.nextLine();
                                System.out.println("Ingresar el modelo de su auto");
                                String modelo = scanner.nextLine();
                                System.out.println("Ingresar la placa de su auto");
                                String placa = scanner.nextLine();
                                Auto a = new Auto(capacidad, comodidad, descapotable, marca, color, modelo, placa, nombreC, direccion1);
                                controladorA.create(a);
                                
                                break;
                            case 2:
                                System.out.println("**********************************");
                                System.out.println("Ingrese el codigo que desee leer");
                                System.out.println(controladorA.read(Sc.nextInt()));

                                break;
                            case 3:
                                System.out.println("****************************************************");
                                System.out.println("Ingrese el codigo que desee modificar");
                                int codigo= Sc.nextInt();

                                System.out.println("Ingrese la direccion de Consesionario de Vehiculos: ");
                                direccion1 = scanner.nextLine();
                                System.out.println("El nombre del consesionario de Vehiculos: ");
                                nombreC = scanner.nextLine();
                                System.out.println("Ingrese el auto que tiene");
                                auto = scanner.nextLine();
                                System.out.println("Ingrese la capacidad de su auto");
                                capacidad = scanner.nextLine();
                                System.out.println("Ingrese la comodidad de su auto:");
                                comodidad = scanner.nextLine();
                                System.out.println("Su auto es descapotable");
                                descapotable = scanner.nextLine();
                                System.out.println("Ingresar la marca de su auto");
                                marca = scanner.nextLine();
                                System.out.println("Ingresar el color de su auto");
                                color = scanner.nextLine();
                                System.out.println("Ingresar el modelo de su auto");
                                modelo = scanner.nextLine();
                                System.out.println("Ingresar la placa de su auto");
                                placa = scanner.nextLine();
                                a = new Auto(capacidad, comodidad, descapotable, marca, color, modelo, placa, nombreC, codigo, direccion1);
                                controladorA.update(a);

                                break;

                            case 4:
                                System.out.println("****************************************************");
                                System.out.println("Ingrese el codigo del Auto que desea eliminar ");
                                 codigo = Sc.nextInt();
                                controladorA.delete(codigo);
                                
                                break;
                                
                            case 5:
                                System.out.println("******************");
                                controladorA.imprimirListaOrdenada();
                                
                                break;
                                
                            case 6:
                                //regresar
                                System.out.println("Regresando al menu principal");
                                break;
                        }

                    } while (opcionMenuAuto != 6);
                    break;
                case 4:
                    do {
                        System.out.println("**********************************");
                        System.out.println("**BIENVENIDO AL MENU DE Camion**");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. List");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("Seleccione una opción");
                        opcionMenuCamion = Sc.nextInt();
                        
                            switch (opcionMenuCamion) {
                            case 1:

                                System.out.println("********************************");
                                System.out.println("Ingrese el espacio del Camion: ");
                                String espacio = scanner.nextLine();
                                System.out.println("Ingrese la cantidad de carga : ");
                                double carga = Sc.nextDouble();
                                System.out.println("Ingrese el peso tara de su Camion");
                                double PesoTara = Sc.nextDouble();
                                System.out.println("Ingresar la marca de su auto");
                                String marca = scanner.nextLine();
                                System.out.println("Ingresar el color de su auto");
                                String color = scanner.nextLine();
                                System.out.println("Ingresar el modelo de su auto");
                                String modelo = scanner.nextLine();
                                System.out.println("Ingresar la placa de su auto");
                                String placa = scanner.nextLine();
                                System.out.println("Ingresar el nombre de consesionario de vehiculos");
                                String Consesionario = scanner.nextLine();
                                System.out.println("Ingresar la direccion del consesionario de vehiculos");
                                String direc = scanner.nextLine();
                                Camion camion = new Camion(espacio, carga, PesoTara, marca, color, modelo, placa, Consesionario, direc);
                                controladorCa.create(camion);
                                break;
                            case 2:
                                System.out.println("********************************");
                                System.out.println("Ingrese el codigo que desee leer");
                                System.out.println(controladorCa.read(Sc.nextInt()));

                                break;
                            case 3:
                                System.out.println("*************************************");
                                System.out.println("Ingrese el codigo que desee modificar");
                                int codigo= Sc.nextInt();
                                System.out.println("Ingrese el espacio del Camion: ");
                                espacio = scanner.nextLine();
                                System.out.println("Ingrese la cantidad de carga : ");
                                carga = Sc.nextDouble();
                                System.out.println("Ingrese el peso tara de su Camion");
                                PesoTara = Sc.nextDouble();
                                System.out.println("Ingresar la marca de su auto");
                                marca = scanner.nextLine();
                                System.out.println("Ingresar el color de su auto");
                                color = scanner.nextLine();
                                System.out.println("Ingresar el modelo de su auto");
                                modelo = scanner.nextLine();
                                System.out.println("Ingresar la placa de su auto");
                                placa = scanner.nextLine();
                                System.out.println("Ingresar el nombre de consesionario de vehiculos");
                                Consesionario = scanner.nextLine();
                                System.out.println("Ingresar la direccion del consesionario de vehiculos");
                                direc = scanner.nextLine();
                                 camion = new Camion(espacio, carga, PesoTara, marca, color, modelo, placa, Consesionario, codigo, direc);
                                controladorCa.update(camion);

                                break;

                            case 4:
                                System.out.println("***********************************************");
                                System.out.println("Ingrese el codigo delCamion que desea eliminar ");
                                 codigo = Sc.nextInt();
                                controladorCa.delete(codigo);

                                break;
                            case 5:
                                System.out.println("***************");
                                controladorCa.listar();
                                break;

                            case 6:
                                //regresar
                                System.out.println("Regresando al menu principal");
                                break;
                        }      
                                
                    } while (opcionMenuCamion != 6);
                        break;
                      case 5:
                    //opcion para salir
                    System.out.println("Gracias !!!");
                    break;
            }
        }while(opcionMenuPrincipal != 5);

            }
        }
