package com.mycompany.mercado.controle;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercado.mercadoClasses.Cliente;
import com.mycompany.mercado.mercadoClasses.Funcionario;
import com.mycompany.mercado.telas.cadastroFuncionario;

public class EventoFuncionarios implements WindowListener {

  cadastroFuncionario cadastroFunc = null;

  public EventoFuncionarios(cadastroFuncionario tela) {
    this.cadastroFunc = tela;
  }

  @Override
  public void windowOpened(WindowEvent e) {
    
    try {
      if(Funcionario.func.size() > 0){
        for(int i = 0; i < Funcionario.func.size(); i++){
          if(Funcionario.func.get(i).getNome().length() > 0){
              String nome =  Funcionario.func.get(i).getNome();
              String cpf =  Funcionario.func.get(i).getDocumento();
              String id =  Funcionario.func.get(i).getId();
              String endereco = Funcionario.func.get(i).getEndereco();
              String cargo = String.valueOf( Funcionario.func.get(i).getCargo());
              String telefone = Funcionario.func.get(i).getContato();

              DefaultTableModel val = (DefaultTableModel) cadastroFunc.tableFunc.getModel();
              val.addRow(new String[]{nome, cpf, id, endereco, telefone, cargo});
            }
          }
        }   
      

      cadastroFunc.repaint();
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
