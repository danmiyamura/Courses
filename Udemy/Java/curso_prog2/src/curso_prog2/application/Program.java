package curso_prog2.application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, soma;
		
		System.out.println("     _____                                                                                                                   \r\n" + 
				"  __|___  |__    _____    ____    __    ____        ____   _    __   _    ____    __    ______    _____     _____    ______  \r\n" + 
				" |   ___|    |  /     \\  |    \\  /  |  |    \\      |    \\ | |  |  | | |  |    \\  /  |  |   ___|  |     |   /     \\  |   ___| \r\n" + 
				"  `-.`-.     |  |     |  |     \\/   |  |     \\     |     \\| |  |  |_| |  |     \\/   |  |   ___|  |     \\   |     |   `-.`-.  \r\n" + 
				" |______|  __|  \\_____/  |__/\\__/|__|  |__|\\__\\    |__/\\____|  |______|  |__/\\__/|__|  |______|  |__|\\__\\  \\_____/  |______| \r\n" + 
				"    |_____|                                                                                                                  ");
		System.out.println("\nDigite o primeiro número da operação: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo número da operação: ");
		b = sc.nextInt();
		
		soma = a + b;
		System.out.printf("%d + %d = %d", a, b, soma);

		sc.close();
	}
}
