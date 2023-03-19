package br.com.newtonpaiva.produtos;

public class Pizza {
    private String nome;
    private Double valor;
    private Boolean temBorda;

    public String getNome() {
        return this.nome;
    }
    public Double getValor() {
        return this.valor;
    }
    public Boolean getTemBorda() {
        return this.temBorda;
    }

    public Pizza(String nome, Double valor, Boolean borda) {
        this.nome = nome;
        this.valor = valor;
        this.temBorda = borda;
    }

    public Double calculaValor() {
        return this.temBorda ? this.valor += 5 : this.valor;
    }
}
