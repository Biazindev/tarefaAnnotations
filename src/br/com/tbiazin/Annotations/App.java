package br.com.tbiazin.Annotations;

import br.com.tbiazin.Annotations.Produto;

public class App {
    public static void main(String[] args) {
        Produto produto = new Produto();
        System.out.println(produto.nome()); 
    }
}
