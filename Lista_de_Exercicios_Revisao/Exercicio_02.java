import javax.swing.JOptionPane;

public class Exercicio_02 {
    public static void main(String[] args) {
        String[] medicos = new String[3];
        String[] especialidades = new String[3];

        for (int i = 0; i < 3; i++) {
            medicos[i] = JOptionPane.showInputDialog("Digite o nome do m�dico " + (i + 1));
            especialidades[i] = JOptionPane.showInputDialog("Digite a especialidade do m�dico " + (i + 1));
        }

        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "M�dico: " + medicos[i] + "\nEspecialidade: " + especialidades[i]);
        }
    }
}