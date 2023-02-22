package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private Integer cargaHorariaInteger;
    private final String professorString;
    private Integer numeroDeAulas;

    public Curso(String titulo, String descricao, Integer novoNumeroDeAulas, Integer novaCargaHorariaInteger, String novoProfessorString) {
        super(titulo, descricao);
        numeroDeAulas = novoNumeroDeAulas;
        cargaHorariaInteger = novaCargaHorariaInteger;
        professorString = novoProfessorString;
    }

    public Integer getCargaHorariaInteger() {
        return this.cargaHorariaInteger;
    }

    public Boolean setCargaHorariaInteger(Integer novaCargaHoraria) {
        this.cargaHorariaInteger = novaCargaHoraria;
        return (this.cargaHorariaInteger.equals(novaCargaHoraria));
    }

    @Override
    public String toString() {
        return "[cargaHoraria=" + cargaHorariaInteger + 
        ", professor=" + professorString + 
        ", titulo=" + titulo + 
        ", descricao=" + descricao + 
        ", Aulas=" + numeroDeAulas + 
        "]";
    }

    @Override
    public Double calcularXp() {
        return cargaHorariaInteger * XP_PADRAO;
    }

}
