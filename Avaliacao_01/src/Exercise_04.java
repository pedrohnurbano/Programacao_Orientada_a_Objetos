
import javax.swing.JOptionPane;
public class Exercise_04 {

	public static void main(String[] args) {
		/* DEFINIÇÃO DE VARIÁVEIS E SUAS CARACTERÍSTICAS: */
		double raio, area, perimetro;
		int quantidade_calculos;

		/* SOLICITAÇÃO E DEFINIÇÃO DO NÚMERO DE CALCULOS A SEREM FEITOS: */
		quantidade_calculos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de calculos que deseja realizar: "));

		/* REPETIÇÃO DE ACORDO COM O NÚMERO DE CADASTROS DIGITADO: */
		for (int i = 1; i<= quantidade_calculos; i++) {
			raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da medida do raio (m): "));
			
			/* C[ALCULO DE ÁREA E PERÍMETRO UTILIZANDO O VALOR DO RAIO DIGITADO: */
			area = (3.14159 * (raio * raio));
			perimetro = ((2 * 3.14159) * raio);
			
			/* EXIBIÇÃO DO RESULTADO COMPLETO PARA O USUÁRIO, INCLUINDO O VALORDO RAIO DIGITADO E OS CALCULADOS: */
			System.out.println("O valor do perímetro do círculo de raio " + raio + ", é de: " + perimetro + ", e a área do mesmo é de: " + area + "cm²");
		}
		System.exit(0);
}
}