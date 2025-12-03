/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        int opcion = 0;
        
        do{
            System.out.println("----------MENU------------\n");
            System.out.println("1. Agregar un nodo al final");
            System.out.println("2. Insertar un nodo en posicion especifica");
            System.out.println("3. Eliminar nodo por codigo");
            System.out.println("4. Mostrar tamaño de la lista");
            System.out.println("5. Buscar nodo por codigo");
            System.out.println("6. Imprimir lista");
            System.out.println("7. Salir");
            
            try{
                opcion = lea.nextInt();
                int code;
                String name;
                int index;
                Nodo nuevoNodo;
                boolean resultadoEliminar;
                Nodo resultadoBuscar;
                
                switch(opcion){
                    case 1:
                        System.out.print("Ingrese el codigo del nodo: ");
                        code = lea.nextInt();
                        lea.nextLine();
                        System.out.print("Ingrese el nombre: ");
                        name = lea.nextLine();
                        nuevoNodo = new Nodo(code, name);
                        lista.add(nuevoNodo);
                        System.out.println("Nodo agregado al final.");
                        break;
                    case 2:
                        System.out.print("Ingrese el codigo del nuevo nodo: ");
                        code = lea.nextInt();
                        lea.nextLine();
                        System.out.print("Ingrese el nombre: ");
                        name = lea.nextLine();
                        System.out.print("Ingrese la posicion para insertar (0 a " + lista.size() + "): ");
                        index = lea.nextInt();
                        nuevoNodo = new Nodo(code, name);
                        lista.addInsertar(index, nuevoNodo);
                        System.out.println("Nodo insertado en la posición " + index);
                        break;
                    case 3:
                        System.out.print("Ingrese el codigo del nodo a eliminar: ");
                        code = lea.nextInt();
                        resultadoEliminar = lista.remove(code);
                        if (resultadoEliminar) {
                            System.out.println("Nodo con codigo " + code + " eliminado con éxito");
                        } else {
                            System.out.println("Nodo con codigo " + code + " no encontrado");
                        }
                        break;
                    case 4:
                        System.out.println("Tamaño de la lista actual es de: "+lista.size());
                        break;
                    case  5:
                         System.out.print("Ingrese el codigo del nodo a buscar: ");
                        code = lea.nextInt();
                        resultadoBuscar = lista.get(code);
                        if (resultadoBuscar != null) {
                            System.out.println("Nodo encontrado: " + resultadoBuscar);
                        } else {
                            System.out.println(" Nodo con codigo " + code + " no encontrado");
                        }
                        break;
                    case 6:
                        lista.print();
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Opcion invalida, intente de nuevo");
                }
                
            }catch(InputMismatchException e){
                System.out.println("Ingresar una opcion valida");
                lea.next();
            }catch(IndexOutOfBoundsException e){
                System.out.println("Ocurrio un error: "+e.getMessage());
            }catch(Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
            }
            
        }while(opcion!=7);
    }
    
}
