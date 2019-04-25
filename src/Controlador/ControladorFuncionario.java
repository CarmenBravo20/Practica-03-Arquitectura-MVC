/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;


/**
 * @version 1.2
 * @since 2019
 * @author Carmen Bravo
 *
 */
public class ControladorFuncionario {

    /**
     * Atributo lista
     */
    private List<Funcionario> list;
    private int codigo;
    

    /**
     * constructor
     */
    public ControladorFuncionario() {
        list = new ArrayList<>();
        codigo=0;
    }

    /**
     *  le paso un objeto funcionario y le agrego a la lista
     *
     * @param objeto
     */
    public void create(Funcionario objeto) {
       codigo++;
       objeto.setCodigo(codigo);
       list.add(objeto);
    }

    /**
     * para leer busca la lista y retorna si la misma es igual
     *
     * @param codigo
     * @return
     */
    public Funcionario read(int codigo) {
        for (Funcionario funcionario : list) {
            if (funcionario.getCodigo() == codigo) {
                return funcionario;
            }

        }
        //objeto que tendra todos sus valore nulos
        return null;
    }

    //el codigo no se actualiza solo se actualiza los nombre, apellidos,etc porque el codigo es lo primordiar porque sino despues no lo
    //vamos a encontrar
    public void update(Funcionario objeto) {
        for (int i = 0; i < 10; i++) {
            Funcionario funcionario = list.get(i);

            if (funcionario.getCodigo()==objeto.getCodigo()) {
               
                list.set(i, objeto);
                break;
            }

        }
    }

    public void delete(int codigo) {
        for (int i = 0; i < 10; i++) {
            Funcionario funcionario = list.get(i);

            if (funcionario.getCodigo() == codigo) {
                list.remove(i);
                break;

            }
        }
    }
    public void listar(){
        for (Funcionario funcionario:list){
            System.out.println(funcionario);
        }
    }
            
}

