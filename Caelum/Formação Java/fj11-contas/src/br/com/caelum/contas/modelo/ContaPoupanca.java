package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	public String getTipo() {
		return "Conta Poupan�a";
	}

	@Override
	public int compareTo(Conta outraConta) {
		return this.getTitular().compareTo(outraConta.getTitular());
	}
}