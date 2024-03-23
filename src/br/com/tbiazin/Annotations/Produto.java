package br.com.tbiazin.Annotations;

import java.lang.annotation.Annotation;

@Tabela(nome = "preco")
public class Produto implements Tabela {

    public Produto() {
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return Tabela.class;
    }

    @Override
    public String nome() {
        return "preco";
    }
}
