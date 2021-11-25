package com.mycompany.mercado.mercadoClasses;

/**
 *
 * @author michel.andrade
 */
public class Produto {

  public static int idAtual;
  private int id_produto;
  private String nome;
  private String marca;
  private String validade;
  private String codigo_barras;
  private String unidade_medida;
  private float preco;
  private int quantidade;

  public Produto(){
    this.nome = "";
    this.marca = "";
    this.validade = "";
    this.codigo_barras = "";
    this.unidade_medida = "";
    this.preco = 0;
    this.id_produto = idAtual;
  }

  public Produto(String nome, String marca, String validade, String codigo_barras,
      String unidade_medida, float preco, int quantidade) {
    this.id_produto = idAtual++;
    this.nome = nome;
    this.marca = marca;
    this.validade = validade;
    this.codigo_barras = codigo_barras;
    this.unidade_medida = unidade_medida;
    this.preco = preco;
  }

  /**
   * @return the id_produto
   */
  public int getId_produto() {
    return id_produto;
  }

  /**
   * @param id_produto the id_produto to set
   */
  public void setId_produto(int id_produto) {
    this.id_produto = id_produto;
  }

  public int getQuantidade(){
    return quantidade;
  }


  public void setQuantidade(int quantidade){
    this.quantidade = quantidade;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return the marca
   */
  public String getMarca() {
    return marca;
  }

  /**
   * @param marca the marca to set
   */
  public void setMarca(String marca) {
    this.marca = marca;
  }

  /**
   * @return the validade
   */
  public String getValidade() {
    return validade;
  }

  /**
   * @param validade the validade to set
   */
  public void setValidade(String validade) {
    this.validade = validade;
  }

  /**
   * @return the codigo_barras
   */
  public String getCodigo_barras() {
    return codigo_barras;
  }

  /**
   * @param codigo_barras the codigo_barras to set
   */
  public void setCodigo_barras(String codigo_barras) {
    this.codigo_barras = codigo_barras;
  }

  /**
   * @return the unidade_medida
   */
  public String getUnidade_medida() {
    return unidade_medida;
  }

  /**
   * @param unidade_medida the unidade_medida to set
   */
  public void setUnidade_medida(String unidade_medida) {
    this.unidade_medida = unidade_medida;
  }

  /**
   * @return the preco
   */
  public float getPreco() {
    return preco;
  }

  /**
   * @param preco the preco to set
   */
  public void setPreco(float preco) {
    this.preco = preco;
  }

}