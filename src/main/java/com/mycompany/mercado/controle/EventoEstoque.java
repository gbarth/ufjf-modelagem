package com.mycompany.mercado.controle;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import com.mycompany.mercado.mercadoClasses.Estoque;
import com.mycompany.mercado.telas.telaEstoque;
import com.mycompany.mercado.utils.Arquivo;
import com.mycompany.mercado.utils.JSON;

public class EventoEstoque implements WindowListener {

  telaEstoque estoque = null;

  public EventoEstoque(telaEstoque tela) {
    this.estoque = tela;
  }

  @Override
  public void windowOpened(WindowEvent e) {
    
    try {
      String lerArquivo = Arquivo.lerArquivo("dados.json");

      if(lerArquivo.length() != 0){ 
        Estoque.estoque = JSON.toProdutos(lerArquivo);    
      }

      if(Estoque.estoque.size() > 0){
        for(int i = 0; i < Estoque.estoque.size(); i++){
            String nome =  Estoque.estoque.get(i).getNome();
            String marca =  Estoque.estoque.get(i).getMarca();
            String validade =  Estoque.estoque.get(i).getValidade();
            String preco = String.valueOf( Estoque.estoque.get(i).getPreco());
            String codigo_barras = String.valueOf( Estoque.estoque.get(i).getCodigo_barras());
            int valor = Estoque.estoque.get(i).getQuantidade();

            if(nome.length() > 0){
                DefaultTableModel val = (DefaultTableModel) estoque.jTable1.getModel();
                val.addRow(new String[]{nome, marca, validade, preco, codigo_barras, String.valueOf (valor)});
            }
        }   
      }

      estoque.repaint();
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
