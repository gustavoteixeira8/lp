import br.com.newtonpaiva.produtos.Hamburguer;
import br.com.newtonpaiva.produtos.Pizza;

import javax.swing.*;

public class Restaurante {
    public static void main(String[] args) {
        String nome, msg = null;
        Double valor;
        Boolean temBorda, artesanal;
        StringBuilder msgObj = new StringBuilder();

        String[] simOuNao = {"1. Sim", "2. Não"};
        String[] options = {"1. Pizza", "2. Hamburguer", "3. Sair"};
        int resposta = JOptionPane.showOptionDialog(
                null,
                "Informe o pedido",
                "",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[2]
        );

        if (resposta == -1 || resposta == 2) {
            msgObj.append("Pedido cancelado");
            JOptionPane.showMessageDialog(null, msgObj);
            return;
        }

        if (resposta == 0) {
            nome = JOptionPane.showInputDialog("Digite o sabor da pizza: ");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
            int querBorda = JOptionPane.showOptionDialog(
                    null,
                    "Deseja adicionar borda: ",
                    "",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    simOuNao,
                    simOuNao[1]
            );
            temBorda = querBorda == 0;
            Pizza p = new Pizza(nome, valor, temBorda);
            msg = String.format("O seu pedido (%s) ficou no valor de: %7.2f", p.getNome(), p.calculaValor());
        } else if (resposta == 1) {
            nome = JOptionPane.showInputDialog("Digite o sabor do hamburger: ");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
            int querArtesanal = JOptionPane.showOptionDialog(
                    null,
                    "Quer um hamburguer artesanal: ",
                    "",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    simOuNao,
                    simOuNao[1]
            );
            artesanal = querArtesanal == 0;
            Hamburguer h = new Hamburguer(nome, valor, artesanal);
            msg = String.format("O seu pedido (%s) ficou no valor de: %7.2f", h.getNome(), h.calculaValor());
        }

        msgObj.append(msg);

        JOptionPane.showMessageDialog(null, msgObj);
    }
}