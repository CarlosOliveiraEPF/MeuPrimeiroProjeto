package pkg_MeuPrimeiroProjetoVersionado;

public class Calculadora {

	//private int valorUm;
	//private int valorDois;
	private int valor;
	
	public void somar(int ValorUm,  int ValorDois){
		//this.valorUm=ValorUm;
		//this.valorDois=ValorDois;		
		//int soma = this.valorUm+this.valorDois;
		//return soma;
		this.valor += (ValorUm+ValorDois);
	}
	public void subtrair(){
		
	}
	public void dividir(){
		
	}
	public void multiplicar(int ValorUm, int ValorDois){
		this.valor += (ValorUm*ValorDois);
	}
	public int getValor() {
		return valor;
	}
	
	
}