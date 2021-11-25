package com.mycompany.mercado.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Arquivo {

  public static String lerArquivo(String caminho){
    StringBuilder conteudo = new StringBuilder();
    File arquivo = new File(caminho);

    try {
      Scanner leitor = new Scanner(arquivo);
      
      while(leitor.hasNextLine()){
        conteudo.append(leitor.nextLine()).append("\n");
      }

    } catch (Exception e) {
      //TODO: handle exception
      System.err.println("Erro ao tentar ler o arquivo" + e.toString());
    }

    return conteudo.toString();
  }

  public static void escreverArquivo(String caminho, String linha){    
    FileWriter fwArquivo;
    BufferedWriter bwArquivo;

    try {
        File arquivo = new File(caminho);

        fwArquivo = new FileWriter(arquivo, false);
        bwArquivo = new BufferedWriter(fwArquivo);

        bwArquivo.write(linha + '\n');
        
        bwArquivo.close();
        fwArquivo.close();

    } catch (Exception e) {
      System.err.println("Erro ao tentar escrever no arquivo" + e.toString());
    }
  }

}
