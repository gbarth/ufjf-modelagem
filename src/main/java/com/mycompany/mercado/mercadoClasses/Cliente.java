/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mercado.mercadoClasses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author michel.andrade
 */
public class Cliente extends Pessoa {
    
    
    private String idade;
    public static List<Cliente> cliente = new ArrayList<>();

    public Cliente(String nome, String documento, String telefone, String endereco, String idade) {
        // método que irá armazenar as informações de cada cliente
        super(nome,documento,telefone, endereco);
        this.idade = idade;
    }

    public String getIdade() {
        return idade;
    }

    
    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public boolean verificaDocumento(String documento) {
        return documento.length()==11;
    }
}