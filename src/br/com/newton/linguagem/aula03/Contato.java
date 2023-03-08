package br.com.newton.linguagem.aula03;

public class Contato {
    private String nome;
    private String numero;

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }
}
