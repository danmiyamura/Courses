package br.com.caelum.contas.modelo;

public class SaldoInsuficienteExcpetion extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficienteExcpetion(double valor) {
		super("Saldo insuficiente para sacar o valor de: " + valor);
	}
}
