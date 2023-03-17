/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.ListaModel;
import Modelos.Pacientes;
import Vistas.frmListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

public class PacientesController implements ActionListener{
        frmListas VistaLista;
       ListaModel ModeloLista;
  
       
       public PacientesController(frmListas VistaLista, ListaModel ModeloLista) {
        this.VistaLista = VistaLista;
        this.ModeloLista = ModeloLista;
        
        this.VistaLista.btnIngresarMedicouno.addActionListener(this);
        this.VistaLista.btnIngresarMedicodos.addActionListener(this);
        this.VistaLista.btnMostrarLista.addActionListener(this);
        
        //levantar la vista
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
        
    }
//escucha a los botones
    
        
        @Override
        
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==this.VistaLista.btnIngresarMedicouno)
            {
                this.ModeloLista.EncolarCliente(this.VistaLista.txtApellidos.getText(), 
                        this.VistaLista.txtNombres.getText());
                
                //traer a la vista los clientes
                Queue<Pacientes> ListaLocal = this.ModeloLista.ListarClientes();
                
                //recorre la lista y asigna el text area
                String Cadena = " ";
                for(Pacientes MiListaClientes: ListaLocal)
                   
                
                 {
                    Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombres()+"\n";
              this.VistaLista.txtListaMedicoUno.setText(Cadena);
                }
               
            
        }
            
                
            }
        
             public void actionPerformed(ActionEvent e){
            if(e.getSource()==this.VistaLista.btnIngresarMedicouno)
            {
                this.ModeloLista.EncolarCliente(this.VistaLista.txtApellidos.getText(), 
                        this.VistaLista.txtNombres.getText());
                
                //traer a la vista los clientes
                Queue<Pacientes> ListaLocal = this.ModeloLista.ListarClientes();
                
                //recorre la lista y asigna el text area
                String Cadena = " ";
                for(Pacientes MiListaClientes: ListaLocal)
                   
                
                 {
                    Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombres()+"\n";
              this.VistaLista.txtListaMedicoUno.setText(Cadena);
                }
        }
            
             }
