package br.com.caelum.contas.modelo;
/**
 *  
 *
 */
public class ContaCorrente extends Conta implements Tributavel{
	
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Voc� tentou sacar um valor negativo.");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteExcpetion(valor);
		}
		else {
			this.saldo -= (valor + 0.10);	
		}
	}
	
	public String getTipo() {
		return "Conta Corrente";
		
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo()*0.01;
	}

	@Override
	public int compareTo(Conta outraConta) {
		return this.getTitular().compareTo(outraConta.getTitular());
	}
}