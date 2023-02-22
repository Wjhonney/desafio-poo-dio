package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final Double XP_PADRAO = 10d;

    protected String titulo;
    protected String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract Double calcularXp();

    public static Double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

}
