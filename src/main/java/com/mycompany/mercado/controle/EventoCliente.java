package com.mycompany.mercado.controle;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercado.mercadoClasses.Cliente;
import com.mycompany.mercado.telas.cadastroCliente;

public class EventoCliente implements WindowListener {

  cadastroCliente cadastroC = null;

  public EventoCliente(cadastroCliente tela) {
    this.cadastroC = tela;
  }

  @Override
  public void windowOpened(WindowEvent e) {
    
    try {
      if(Cliente.cliente.size() > 0){
        for(int i = 0; i < Cliente.cliente.size(); i++){
          if(Cliente.cliente.get(i).getNome().length() > 0){
              String nome =  Cliente.cliente.get(i).getNome();
              String cpf =  Cliente.cliente.get(i).getDocumento();
              String endereco = Cliente.cliente.get(i).getEndereco();
              String telefone = Cliente.cliente.get(i).getContato();
              String idade = Cliente.cliente.get(i).getIdade();

              DefaultTableModel val = (DefaultTableModel) cadastroC.tbC.getModel();
              val.addRow(new String[]{nome, telefone, cpf, endereco, idade});
            }
          }
        }   

        cadastroC.repaint();
    } catch (Exception ex) {
      System.err.println("erro: " + ex);
    }
    
    
  }

  @Override
  public void windowClosing(WindowEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowClosed(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowIconified(WindowEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowDeiconified(WindowEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowActivated(WindowEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowDeactivated(WindowEvent e) {
    // TODO Auto-generated method stub
    
  }
  
}
