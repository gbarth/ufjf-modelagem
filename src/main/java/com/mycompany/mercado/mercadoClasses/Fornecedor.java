package com.mycompany.mercado.mercadoClasses;

import com.mycompany.mercado.mercadoClasses.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gustavo
 */

public class Fornecedor extends Pessoa {
    
    public static List<Fornecedor> fornecedor = new ArrayList<>();

    public Fornecedor(String nome, String documento, String contato, String endereco) {
        super(nome, documento, contato, endereco);
    }

  @Override
  public boolean verificaDocumento(String documento) {
      return documento.length() == 14;
  }
}