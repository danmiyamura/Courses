package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteDaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		
		conta.deposita(1000);
		
		System.out.println(conta.getSaldo());
	}
}