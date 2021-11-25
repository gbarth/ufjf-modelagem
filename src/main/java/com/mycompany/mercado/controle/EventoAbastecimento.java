package com.mycompany.mercado.controle;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercado.mercadoClasses.Estoque;
import com.mycompany.mercado.telas.abastecimentoEstoque;
import com.mycompany.mercado.utils.Arquivo;
import com.mycompany.mercado.utils.JSON;

public class EventoAbastecimento implements WindowListener {

  abastecimentoEstoque telaAbastecimentoEstoque = null;

  public EventoAbastecimento(abastecimentoEstoque tela) {
    this.telaAbastecimentoEstoque = tela;
  }

  @Override
  public void windowOpened(WindowEvent e) {
    // TODO Auto-generated method stub

    
    try {
      String lerArquivo = Arquivo.lerArquivo("dados.json");
        
      if(lerArquivo.length() != 0){ 
        Estoque.estoque = JSON.toProdutos(lerArquivo);    
      }
      
      if(Estoque.estoque.size() > 0){
        for(int i = 0; i < Estoque.estoque.size(); i++){
          int id = Estoque.estoque.get(i).getId_produto();  
          String nome = Estoque.estoque.get(i).getNome();
          int valor = Estoque.estoque.get(i).getQuantidade();
  
            if(nome.length() > 0){
                DefaultTableModel val = (DefaultTableModel) telaAbastecimentoEstoque.getLista().getModel();
                val.addRow(new String[]{nome, String.valueOf(valor)});
            }
        }
      }
  
      telaAbastecimentoEstoque.repaint();
    } catch (Exception ex) {
        System.err.println(ex);
    }
   
  }

  @Override
  public void windowClosing(WindowEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowClosed(WindowEvent e) {
    // TODO Auto-generated method stub
    String toJSON = JSON.toJSON(Estoque.estoque);
    Arquivo.escreverArquivo("dados.json", toJSON);
    
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
