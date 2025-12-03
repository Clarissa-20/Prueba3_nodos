/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class Nodo {
    //podemos tener atributos
    public int codigo;
    public String nombre;
    public Nodo siguiente; //es del mismo tipo Nod para conectarlo con el siguiente nodo
    
    //el constructor
    public Nodo(int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
        siguiente = null; //hacemos referencia a que esta vacio para el siguiente nodo
    }
    
    //podemos tener funciones tmb
    public String toString(){
        return "Nodo ("+"Codigo: "+codigo+" | Nombre: "+nombre+")";
    }
}
