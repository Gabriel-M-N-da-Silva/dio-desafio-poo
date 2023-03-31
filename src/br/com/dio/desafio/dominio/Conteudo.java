package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    //Constantes
    protected final static double XP_PADRAO = 10d;

    //Atributos
    private String titulo;
    private String descricao;

    //Getters
    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Métodos
    public abstract double calcularXP();
}
