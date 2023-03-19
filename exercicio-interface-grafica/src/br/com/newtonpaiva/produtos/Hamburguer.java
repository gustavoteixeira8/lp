package br.com.newtonpaiva.produtos;

public class Hamburguer {
    private String nome;
    private Double valor;
    private Boolean artesanal;

    public String getNome() {
        return this.nome;
    }
    public Double getValor() {
        return this.valor;
    }
    public Boolean getArtesanal() {
        return this.artesanal;
    }

    public Hamburguer(String nome, Double valor, Boolean artesanal) {
        this.nome = nome;
        this.valor = valor;
        this.artesanal = artesanal;
    }

    public Double calculaValor() {
        return this.artesanal ? this.valor += 8 : this.valor;
    }
}
