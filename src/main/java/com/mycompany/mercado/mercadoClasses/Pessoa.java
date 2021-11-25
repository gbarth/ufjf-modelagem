/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mercado.mercadoClasses;

/**
 *
 * @author michel.andrade
 */


public  abstract  class  Pessoa {
  private String nome;
  private String documento;
  private String contato;
  private String endereco;

  public Pessoa(){}
  
  public Pessoa(String nome, String documento, String contato, String endereco){
      this.nome = nome;
      this.documento = documento;
      this.endereco = endereco;
      this.contato = contato;
  }
  
  public abstract boolean verificaDocumento(String documento); 
  
  public static boolean verificaContato (String contato){
      if(contato.isEmpty())
          return false;
      return true;
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
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the contato
     */
    public String getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
      
  }
  
  


 