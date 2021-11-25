package com.mycompany.mercado.controle;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercado.mercadoClasses.Fornecedor;
import com.mycompany.mercado.telas.cadastroFornecedor;


public class EventoFornecedor implements WindowListener {

  cadastroFornecedor cadastroF = null;

  public EventoFornecedor(cadastroFornecedor tela) {
    this.cadastroF = tela;
  }

  @Override
  public void windowOpened(WindowEvent e) {
    
    try {
      if(Fornecedor.fornecedor.size() > 0){
        for(int i = 0; i < Fornecedor.fornecedor.size(); i++){
          if(Fornecedor.fornecedor.get(i).getNome().length() > 0){
            String nome =  Fornecedor.fornecedor.get(i).getNome();
            String cnpj =  Fornecedor.fornecedor.get(i).getDocumento();
            String endereco = Fornecedor.fornecedor.get(i).getEndereco();
            String telefone = Fornecedor.fornecedor.get(i).getContato();

                DefaultTableModel val = (DefaultTableModel) cadastroF.tableFor.getModel();
                val.addRow(new String[]{nome, telefone ,cnpj, endereco});
            }
        }   
      } 

        cadastroF.repaint();
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
