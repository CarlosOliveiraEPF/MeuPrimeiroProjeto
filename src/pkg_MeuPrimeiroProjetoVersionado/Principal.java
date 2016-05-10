package pkg_MeuPrimeiroProjetoVersionado;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		Calculadora calculadora = new Calculadora();
//		calculadora.somar(10,50);
//		calculadora.somar(20,10);
		int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Valor: "));
		int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Valor: "));
		calculadora.multiplicar(primeiroValor,segundoValor);
		//JOptionPane.showMessageDialog(null, retornoCalculo);
		JOptionPane.showMessageDialog(null, calculadora.getValor(), "O resultado da operação é...", 0);
		JOptionPane.showMessageDialog(null, calculadora.getValor(), "O resultado da operação é...", 1);
		JOptionPane.showMessageDialog(null, calculadora.getValor(), "O resultado da operação é...", 2);
		JOptionPane.showMessageDialog(null, calculadora.getValor(), "O resultado da operação é...", 3);
	}
}