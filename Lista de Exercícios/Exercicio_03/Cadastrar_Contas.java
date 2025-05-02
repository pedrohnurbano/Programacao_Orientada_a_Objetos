package Exercicio_03;
import javax.swing.JOptionPane;

public class Cadastrar_Contas {
    public static void main(String[] args) {
        Conta conta = null;

        String[] opcoesConta = {"Conta Corrente Normal", "Conta Corrente Especial"};
        int tipoConta = JOptionPane.showOptionDialog(
            null,
            "Escolha o tipo de conta:",
            "Tipo de Conta",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            opcoesConta,
            opcoesConta[0]
        );

        if (tipoConta == 0) {
            conta = new Conta(0);
            JOptionPane.showMessageDialog(null, "Você escolheu uma Conta Corrente Normal.");
        } else if (tipoConta == 1) {
            conta = new Conta_Especial(0);
            JOptionPane.showMessageDialog(null, "Você escolheu uma Conta Corrente Especial.");
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida. Encerrando...");
            return;
        }

        int opcao = 0;
        while (opcao != 3) {
            String[] opcoesOperacoes = {"Depositar", "Sacar", "Consultar Saldo", "Sair"};
            opcao = JOptionPane.showOptionDialog(
                null,
                "Escolha uma operação:",
                "Operações",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoesOperacoes,
                opcoesOperacoes[0]
            );

            switch (opcao) {
                case 0:
                    String valorDepositoStr = JOptionPane.showInputDialog("Digite o valor para depositar:");
                    if (valorDepositoStr != null) {
                        try {
                            double valorDeposito = Double.parseDouble(valorDepositoStr);
                            conta.depositar(valorDeposito);
                            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Valor inválido. Tente novamente.");
                        }
                    }
                    break;

                case 1: // Sacar
                    String valorSaqueStr = JOptionPane.showInputDialog("Digite o valor para sacar:");
                    if (valorSaqueStr != null) {
                        try {
                            double valorSaque = Double.parseDouble(valorSaqueStr);
                            if (conta.sacar(valorSaque)) {
                                JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Valor inválido. Tente novamente.");
                        }
                    }
                    break;

                case 2: // Consultar Saldo
                    JOptionPane.showMessageDialog(null, "Saldo atual: " + conta.getSaldo());
                    break;

                case 3: // Sair
                    JOptionPane.showMessageDialog(null, "Encerrando o programa. Obrigado!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}