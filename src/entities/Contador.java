package entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Scanner terminal  = new Scanner(System.in);
		
		try {
		
		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = terminal.nextInt();
		
			
			contar(parametroUm, parametroDois);
			
			
			terminal.close();
			
		}catch(InputMismatchException exception) {
			System.out.println("Os parametros devem ser números inteiros.");
		}	
		catch(ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}finally {
			System.out.println("Encerrando contador...");
			System. exit(0);
		}
		
		
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		
		System.out.println("Iniciando contagem...");
		
		for(int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (i+1));
		}
		
	}
}
