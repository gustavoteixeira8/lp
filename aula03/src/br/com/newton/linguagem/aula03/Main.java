package br.com.newton.linguagem.aula03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Contato contatoJoao = new Contato("João", "31989878547");
        Contato contatoPedro = new Contato("Pedro", "31989873030");
        Contato contatoMaria = new Contato("Maria", "31989871010");
        Contato contatoCarla = new Contato("Carla", "31989870202");
        Contato contatoAmanda = new Contato("Amanda", "31989871568");

        ArrayList<Contato> contatos = new ArrayList();
        contatos.add(contatoJoao);
        contatos.add(contatoPedro);
        contatos.add(contatoMaria);
        contatos.add(contatoCarla);
        contatos.add(contatoAmanda);

        Telefone yphone = new Telefone("YPhone", "branco", "smartphone", contatos);

        yphone.setContato(new Contato("João", "318989952"));

        Contato contatoJuliana = new Contato("Juliana", "123456789");

        yphone.setContato(contatoJuliana);

        try {
            yphone.ligar(contatoPedro);
            yphone.ligarParaJuliana(contatoJuliana);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
