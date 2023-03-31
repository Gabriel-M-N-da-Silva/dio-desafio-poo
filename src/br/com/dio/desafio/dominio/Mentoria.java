package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

    //Atributos
    LocalDateTime dataHora;

    //Construtor
    public Mentoria(String titulo, String descricao, LocalDateTime dataHora) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.dataHora = dataHora;
    }

    //Getters
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    //Setters
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    //Métodos
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "\nMentoria{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }
}
