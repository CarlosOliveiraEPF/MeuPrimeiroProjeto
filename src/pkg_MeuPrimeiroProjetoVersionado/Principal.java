package pkg_MeuPrimeiroProjetoVersionado;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		Calculadora calculadora = new Calculadora();
		calculadora.somar(10,50);
		calculadora.somar(20,10);
		//JOptionPane.showMessageDialog(null, retornoCalculo);
		JOptionPane.showMessageDialog(null, calculadora.getValor(), "O resultado da opera��o �...", 0);
		JOptionPane.showMessageDialog(null, calculadora.getValor(), "O resultado da opera��o �...", 1);
		JOptionPane.showMessageDialog(null, calculadora.getValor(), "O resultado da opera��o �...", 2);
		JOptionPane.showMessageDialog(null, calculadora.getValor(), "O resultado da opera��o �...", 3);
	}
}