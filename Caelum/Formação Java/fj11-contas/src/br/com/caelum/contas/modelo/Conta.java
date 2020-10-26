package br.com.caelum.contas.modelo;

/**
 * Classe responsável pela entidade de Conta
 *
 */
public abstract class Conta implements Comparable<Conta>{
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			System.out.println("Depositou: " + valor);
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		System.out.println("Sacou: " + valor);
		this.saldo -= valor;
	}

	public abstract String getTipo();

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	@Override
	public String toString() {
		return String.format("[Titular= %s, número= %d, agencia= %s]", titular, numero, agencia);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		Conta outraConta = (Conta) obj;
		
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}
}