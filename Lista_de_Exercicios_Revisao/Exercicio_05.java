import javax.swing.JOptionPane;

public class Exercicio_05 {
    public static void main(String[] args) {
    	int[] numeros = new int [10];
    	for (int i = 0; i < 10; i++) {
    		numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
    	}
    	
    	Verificacao_Numeros_Negativos(numeros);
    	System.exit(0);
    }
    
    public static void Verificacao_Numeros_Negativos(int[] numeros) {
    	for (int i1 = 0; i1 < numeros.length; i1++) {
    		if (numeros[i1] < 0) {
    			JOptionPane.showMessageDialog(null, "Número negativo: " + numeros[i1]);
            }
    	}
    }
}