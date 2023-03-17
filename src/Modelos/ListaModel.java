/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class ListaModel {
    Queue<Pacientes> ListaClientes = new LinkedList();
    public void EncolarCliente(String ape, String nom)
    {
        Pacientes nuevoCliente = new Pacientes(ape, nom);
        this.ListaClientes.add(nuevoCliente);
        JOptionPane.showMessageDialog(null, "cliente agregado");
    }

    public Queue ListarClientes()
    {
        return this.ListaClientes;
    }
    public void DesEncolar()
    {
        this.ListaClientes.poll();
    }
}
