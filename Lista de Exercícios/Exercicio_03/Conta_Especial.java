package Exercicio_03;
import javax.swing.JOptionPane;

public class Conta_Especial extends Conta {

    public Conta_Especial(double saldoInicial) {
        super(saldoInicial);
    }

    public boolean sacar(double quantia) {
        double taxa = quantia * 0.01;
        double total = quantia + taxa;
        if (quantia > 0 && saldo >= total) {
            saldo -= total;
            JOptionPane.showMessageDialog(null, "Saque de R$ " + quantia + " realizado com sucesso! Taxa especial: R$ " + taxa);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente ou valor inválido para saque.");
            return false;
        }
    }
}