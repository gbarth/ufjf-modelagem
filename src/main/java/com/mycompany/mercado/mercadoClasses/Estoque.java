package com.mycompany.mercado.mercadoClasses;

/**
 *
 * @author carlos.eduardo
 */

import java.util.ArrayList;
import java.util.List;

public class Estoque {

  public static List<Integer> quantidadeItem = new ArrayList<>();
  private Produto produto;
  public static List<Produto> estoque = new ArrayList<>();
  
  public Estoque(){}
  
  public Estoque(Produto produto, float quantidade) {
    this.produto = produto;
  }

  public List<Produto> getEstoqueTotal() {
    return estoque;
  }

  public void setEstoqueItem(String id_produto) {
    // editar quantidade em estoque de determinado produto (codigo de barras)
  }

  public List<Produto> buscaEstoque(String info) {
    return estoque;
  }

  public void addProduto(String id_produto) {
    // acrescenta, em quantidade, determinado produto
  }

  public void removeProduto(String id_produto) {
    // tirar, em quantidade, determinado produto
  }

}