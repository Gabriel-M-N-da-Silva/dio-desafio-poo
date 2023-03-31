package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Set;

public class Aluno {

    //Atributos
    private String nome;
    private LocalDate dataNasc;
    private double experiencia;
    private ArrayList<Conteudo> conteudosInscritos;
    private ArrayList<Conteudo> conteudosFinalizados;
    private ArrayList<Bootcamp> bootcampsMatriculados;

    //Construtor
    public Aluno(String nome, LocalDate dataNasc){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.conteudosInscritos = new ArrayList<>();
        this.conteudosFinalizados = new ArrayList<>();
        this.bootcampsMatriculados = new ArrayList<>();
    }

    //Getters
    public double getExperiencia() {
        return experiencia;
    }
    public String getNome() {
        return nome;
    }
    public LocalDate getDataNasc() {
        return dataNasc;
    }
    public int getIdade(){
        return Period.between(this.dataNasc,LocalDate.now()).getYears();
    }
    public ArrayList<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }
    public ArrayList<Conteudo> getConteudosFinalizados() {
        return conteudosFinalizados;
    }
    public ArrayList<Bootcamp> getBootcampsMatriculados() {
        return bootcampsMatriculados;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    //Métodos
    public void inscreverConteudo(Set<Conteudo> conteudos){
        this.conteudosInscritos.addAll(conteudos);
    }
    public void inscreverConteudo(Conteudo conteudo){
        this.conteudosInscritos.add(conteudo);
    }
    public void finalizarConteudo(Set<Conteudo> conteudos){
        this.conteudosInscritos.removeAll(conteudos);
        this.conteudosFinalizados.addAll(conteudos);
        this.experiencia = this.calculaXP();
    }
    public void finalizarConteudo(Conteudo conteudo){
        this.conteudosInscritos.remove(conteudo);
        this.conteudosFinalizados.remove(conteudo);
    }
    public double calculaXP(){
        return conteudosFinalizados.stream().mapToDouble(Conteudo::calcularXP).sum();
    }
    public void inscreverBootcamp(Bootcamp bootcamp){
        if(!bootcamp.getMatriculas().containsKey(this))
            bootcamp.matricular(this);
        if(!this.bootcampsMatriculados.contains(bootcamp))
            this.bootcampsMatriculados.add(bootcamp);
    }

}
