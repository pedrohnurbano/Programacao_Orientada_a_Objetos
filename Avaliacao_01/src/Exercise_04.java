
import javax.swing.JOptionPane;
public class Exercise_04 {

	public static void main(String[] args) {
		/* DEFINI��O DE VARI�VEIS E SUAS CARACTER�STICAS: */
		double raio, area, perimetro;
		int quantidade_calculos;

		/* SOLICITA��O E DEFINI��O DO N�MERO DE CALCULOS A SEREM FEITOS: */
		quantidade_calculos = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de calculos que deseja realizar: "));

		/* REPETI��O DE ACORDO COM O N�MERO DE CADASTROS DIGITADO: */
		for (int i = 1; i<= quantidade_calculos; i++) {
			raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da medida do raio (m): "));
			
			/* C[ALCULO DE �REA E PER�METRO UTILIZANDO O VALOR DO RAIO DIGITADO: */
			area = (3.14159 * (raio * raio));
			perimetro = ((2 * 3.14159) * raio);
			
			/* EXIBI��O DO RESULTADO COMPLETO PARA O USU�RIO, INCLUINDO O VALORDO RAIO DIGITADO E OS CALCULADOS: */
			System.out.println("O valor do per�metro do c�rculo de raio " + raio + ", � de: " + perimetro + ", e a �rea do mesmo � de: " + area + "cm�");
		}
		System.exit(0);
}
}