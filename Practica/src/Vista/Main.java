/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Controlador.ed.lista.ListaEnlazada;
import Controlador.ed.lista.exception.VacioException;
import Modelo.Sucursal;

/**
 *
 * @author wilman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEnlazada<Sucursal> lista = new ListaEnlazada <>();
        try {
            Sucursal s1 = new Sucursal();
            s1.setId(lista.size()+1);
            s1.setNombre("Alice");
            lista.insertar(s1);
            lista.imprimir();
            s1 = new Sucursal();
            s1.setId(lista.size()+1);
            s1.setNombre("Marilyn");
            lista.insertar(s1);
            lista.imprimir();
            
        }catch(VacioException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
