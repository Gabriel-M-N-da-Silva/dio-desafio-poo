package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    //Atributos
    private short cargaHoraria;

    //Construtor
    public Curso(String titulo, String descricao, short cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    //Getters
    public short getCargaHoraria() {
        return cargaHoraria;
    }

    //Setters
    public void setCargaHoraria(short cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //Métodos
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
    @Override
    public String toString() {
        return "\nCurso{" +
                "titulo ='" + this.getTitulo() + '\'' +
                ", descricao ='" + this.getDescricao() + '\'' +
                ", cargaHoraria =" + cargaHoraria +
                "}";
    }
}
