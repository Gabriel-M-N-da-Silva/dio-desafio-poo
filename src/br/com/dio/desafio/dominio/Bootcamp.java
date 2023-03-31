package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class Bootcamp {

    //Atributos
    private String titulo;
    private String descricao;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private HashMap<Aluno,Boolean> matriculas;
    private HashSet<Conteudo> conteudos;

    //Construtor
    public Bootcamp(String titulo, String descricao, LocalDateTime inicio, LocalDateTime fim) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.inicio = inicio;
        this.fim = fim;
        this.matriculas = new HashMap<>();
        this.conteudos = new HashSet<>();
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public LocalDateTime getInicio() {
        return inicio;
    }
    public LocalDateTime getFim() {
        return fim;
    }
    public HashMap<Aluno,Boolean> getMatriculas() {
        return matriculas;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }
    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    //Métodos
    public void matricular(Aluno alunoNovo){
        if(!this.matriculas.containsKey(alunoNovo)) // aluno não está matriculado no bootcamp
            matriculas.put(alunoNovo, false);
        if (!alunoNovo.getBootcampsMatriculados().contains(this)) // bootcamp não está matriculado no aluno
            alunoNovo.inscreverBootcamp(this);
    }
    public void cadastrarConteudo(Conteudo conteudo){
        this.conteudos.add(conteudo);
        this.matriculas.keySet().forEach(aluno -> aluno.inscreverConteudo(conteudo));
    }
    public void finalizarBootcamp(Aluno aluno){
        boolean alunoMatriculado = this.matriculas.containsKey(aluno);

        if(alunoMatriculado)
            this.matriculas.put(aluno, true);

        aluno.finalizarConteudo(this.conteudos);
    }
    @Override
    public String toString() {
        return "Bootcamp{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", inicio=" + inicio +
                ", fim=" + fim +
                ", conteudos=" + conteudos +
                '}';
    }
}
