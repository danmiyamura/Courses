package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Inicio...");
		Collection<Integer> teste = new ArrayList<>();

		long inicio = System.currentTimeMillis();

		int total = 30000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = (fim - inicio);
		System.out.printf("Tempo gasto: %d milisegundos", tempo);
	}
}
