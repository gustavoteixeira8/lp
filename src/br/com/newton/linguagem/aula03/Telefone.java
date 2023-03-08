package br.com.newton.linguagem.aula03;

import java.util.ArrayList;
import java.util.Locale;

public class Telefone {
    private ArrayList<Contato> contatos;
    private String nome;
    private String tipo;
    private String cor;

    public String getCor() {
        return this.cor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public ArrayList<Contato> getContatos() {
        return this.contatos;
    }

    public void setContato(Contato c) {
        this.contatos.add(c);
    }

    public String getNome() {
        return this.nome;
    }

    public Telefone(String nome, String cor, String tipo, ArrayList<Contato> contatos) {
        this.contatos = contatos;
        this.cor = cor;
        this.tipo = tipo;
        this.nome = nome;
    }

    public void tocarMusica(String tipoMusica) {
        System.out.printf("Tocando %s\n", tipoMusica);
    }

    public void ligar(Contato contato) throws Exception {
        int indexContato = this.contatos.indexOf(contato);

        if (indexContato == -1) {
            throw new Exception("Contato não foi encontrado nesse telefone");
        }

        String nome = this.contatos.get(indexContato).getNome();
        String numero = this.contatos.get(indexContato).getNumero();

        System.out.printf("Ligando para %s - %s\n", nome, numero);
    }

    public void ligarParaJuliana(Contato contato) throws Exception {
        int indexContato = this.contatos.indexOf(contato);

        if (indexContato == -1) {
            throw new Exception("Contato não foi encontrado nesse telefone");
        }

        String nome = this.contatos.get(indexContato).getNome();

        if (!nome.toLowerCase(Locale.ROOT).equals("juliana")) {
            throw new Exception("Só é possível ligar para Juliana");
        }

        String numero = this.contatos.get(indexContato).getNumero();

        System.out.printf("Ligando para %s - %s\n", nome, numero);
    }
}
