package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    System.out.println("Qual seu nome?");
    String nome = sc.nextLine();
    
    System.out.println("Qual sua idade?");
	int idade = sc.nextInt();
	
	System.out.println("Qual sua altura?");
	double altura = sc.nextDouble();
	
	System.out.println("seu nome é: " + nome);
	System.out.println("sua idade é: " + idade);
	System.out.println("sua altura é: " + altura);
	}

}
