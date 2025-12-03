/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class Lista {
     //aqui hacemos la lista
    private Nodo inicio = null;
    private int size = 0; //para saber cuantos nodos tengo
    
    public boolean isEmpty(){
        return inicio == null; //significa que la lista esta vacia
    }
    
    public void add(Nodo obj){
        if(obj == null){
            return;   //si esta vacio lo retornamos
        } 
        
        if(isEmpty()){
            inicio = obj;  //este seria el nuevo nodo que el va a contener
        } else{
            Nodo temp = inicio;
            while(temp.siguiente != null){
                temp = temp.siguiente;  
            }
            temp.siguiente = obj; //agregar el nuevo objeto
        }
        size++;
    }
    
    public void print(){
        Nodo temp = inicio;
        while(temp!=null){
            System.out.println(temp);
            temp = temp.siguiente;
        }
    }
    
    public Nodo get(int code){
        Nodo temp = inicio;
        while(temp!=null){
            if(temp.codigo==code)
                return temp;  //si existe ese nodo vamos a retornar toda la informacion de esa persona
            temp = temp.siguiente; //esto es para ir y verificar el siguiente nodo y revisar lo que se esta evaluando
        }
        return null;
    }
    
    //metodo de eliminar
    public boolean remove(int code){
        if(isEmpty()){
            return false; 
        }
        
        if(inicio.codigo == code){
            inicio = inicio.siguiente;
            size--;
            return true;
        }
        
        Nodo actual = inicio;
        
        while(actual.siguiente != null){
            if(actual.siguiente.codigo == code){
                actual.siguiente = actual.siguiente.siguiente;
                size--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
    
    //metodo de size
    public int size(){
        return this.size;
    }
    
    //metodo de insertar un nodo
    public void addInsertar(int index, Nodo obj) throws IndexOutOfBoundsException{
        if(obj == null){
            return;
        }
        
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("El indice debe estar estre 0 y "+size());
        }
        
        if(index == 0){
            obj.siguiente = inicio;
            inicio = obj;
            size++;
            return;
        }
        
        Nodo anterior = inicio;
        for (int i = 0; i < index -1 ; i++) {
            anterior = anterior.siguiente;
        }
        
        obj.siguiente = anterior.siguiente;
        anterior.siguiente = obj;
        size++;
    }
}
