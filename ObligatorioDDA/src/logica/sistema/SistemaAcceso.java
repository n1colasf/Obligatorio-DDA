/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.sistema;

import java.util.ArrayList;

import logica.dominio.Usuario;
import logica.dominio.Propietario;
import logica.dominio.Administrador;
/**
 *
 * @author Nicolas
 */
public class SistemaAcceso {
    //ATRIBUTOS
    private ArrayList<Propietario> propietarios = new ArrayList();
    private ArrayList<Administrador> administradores = new ArrayList();
    
    //GETTERS
    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }
    
    //FUNCIONES AGREGAR
    public void agregarPropietario(int cedula,String pass,String nombreCompleto){
        propietarios.add(new Propietario(cedula, pass, nombreCompleto));
    }

    public void agregarAdministrador(int cedula,String pass,String nombreCompleto){
        administradores.add(new Administrador(cedula, pass, nombreCompleto));  
    }
    
    //FUNCIONES LOGIN
    public Administrador loginAdministrador(int cedula,String pass){
       Usuario u = buscarUsuario(cedula, pass, administradores);
       return (Administrador)u;
    }
    
    public Propietario loginPropietario(int cedula,String pass){
       Usuario u = buscarUsuario(cedula, pass, propietarios);
       return (Propietario)u;
    }
    
    //FUNCION AUXILIAR BUSCAR USUARIO
    private Usuario buscarUsuario(int cedula,String pass,ArrayList usuarios){
        Usuario u;
        for(Object obj:usuarios){
            u = (Usuario)obj;
            if(u.getCedula() == cedula && u.getPassword().equals(pass)){
                return u;
            }
        }
        return null;
    }   
   
}
