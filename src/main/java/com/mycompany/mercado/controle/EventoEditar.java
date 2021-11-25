package com.mycompany.mercado.controle;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import com.mycompany.mercado.mercadoClasses.Estoque;
import com.mycompany.mercado.telas.editarProduto;
import com.mycompany.mercado.utils.Arquivo;
import com.mycompany.mercado.utils.JSON;

public class EventoEditar implements WindowListener{

  editarProduto editar = null;

  public EventoEditar(editarProduto tela) {
    this.editar = tela;
  }

  @Override
  public void windowOpened(WindowEvent e) {
    
    try {
      String lerArquivo = Arquivo.lerArquivo("dados.json");
        
      if(lerArquivo.length() != 0){ 
        Estoque.estoque = JSON.toProdutos(lerArquivo);    
      }
    
      editar.repaint();
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
