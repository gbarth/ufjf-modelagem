package com.mycompany.mercado.mercadoClasses;



import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author michel.andrade
 */
public class Funcionario extends Pessoa {

  private String id;
  private String cargo;
  public static List<Funcionario> func = new ArrayList<>();

    public Funcionario(String id, String cargo, String nome, String documento, String contato, String endereco) {
        super(nome, documento, contato, endereco);
        this.id = id;
        this.cargo = cargo;
    }

 
    
  public String getId() {
     return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  /**
   * @return the cargo
   */
  public String getCargo() {
    return cargo;
  }

  /**
   * @param cargo the cargo to set
   */
  public void setCargo(String cargo) {
    this.cargo = cargo;
  }


    @Override
    public boolean verificaDocumento(String documento) {
        return documento.length()==11;
    }
}