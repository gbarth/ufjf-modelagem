package com.mycompany.mercado.utils;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.mercado.mercadoClasses.Produto;


public class JSON {
 
  public static String toJSON(Produto produto){
    Gson gson = new Gson();
    String json = gson.toJson(produto);
    return json;
  }

  public static String toJSON(List<Produto> produtos){
    Gson gson = new Gson();
    String json = gson.toJson(produtos);
    return json;
  }

  public static Produto toProduto(String conteudo){
    Gson gson = new Gson();
    Produto produto = gson.fromJson(conteudo, Produto.class);
    return produto;
  }

  public static List<Produto> toProdutos(String conteudo){
    Gson gson = new Gson();
    java.lang.reflect.Type produtosTipo = new TypeToken<ArrayList<Produto>>(){}.getType(); 
    List<Produto> produtos = gson.fromJson(conteudo, produtosTipo);
    return produtos;
  }
}
