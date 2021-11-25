package com.mycompany.mercado.controle;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import com.mycompany.mercado.mercadoClasses.Estoque;
import com.mycompany.mercado.mercadoClasses.Produto;
import com.mycompany.mercado.telas.cadastroProdutos;
import com.mycompany.mercado.utils.Arquivo;
import com.mycompany.mercado.utils.JSON;

public class EventoJanela implements WindowListener{

  cadastroProdutos cadastro = null;
  boolean teste = true;

  public EventoJanela(cadastroProdutos tela) {
    this.cadastro = tela;
  }

  @Override
  public void windowOpened(WindowEvent e) {
    
    try {
      String lerArquivo = Arquivo.lerArquivo("dados.json");
        
      if(lerArquivo.length() != 0){ 
        Estoque.estoque = JSON.toProdutos(lerArquivo);    
      }
    
      if(teste && lerArquivo.length() != 0){
        Produto.idAtual = Estoque.estoque.get(Estoque.estoque.size() - 1).getId_produto() + 1;
      }
      
      cadastro.repaint();
    } catch (Exception ex) {
      System.err.println(ex);
    }


    this.teste = false;
    
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
