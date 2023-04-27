package br.com.corretora;

import java.util.Scanner;

import br.com.corretora.dominio.Bonus;
import br.com.corretora.dominio.Cliente;
import br.com.corretora.dominio.ConcessorDeBonus;

public class Main {
    public static void main(String[] args) {
    	// Criacão do Scanner para entrada de dados
    	Scanner sc = new Scanner(System.in);
    	
    	//Entrada de dados do primeiro cliente
    	System.out.println("Dados do cliente:");
    	System.out.println("Nome: ");
    	String nome1 = sc.nextLine();
    	System.out.println("Telefone: ");
    	String telefone1 = sc.nextLine();
    	System.out.println("Email: ");
    	String email1 = sc.nextLine();
 
        // Criação dos objetos Cliente
        Cliente cliente1 = new Cliente(nome1, email1, telefone1);
        
     // Entrada de dados do segundo cliente
        System.out.println("Dados do segundo cliente:");
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone2 = sc.nextLine();
        System.out.print("Email: ");
        String email2 = sc.nextLine();
        
     // Criação do segundo cliente
        Cliente cliente2 = new Cliente(nome2, email2, telefone2);
     // Saída de dados dos clientes criados
        System.out.println();
        System.out.println("Clientes criados:");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

        // Adição de pontos para os clientes
        System.out.println();
        System.out.println("Adição de pontos:");
        System.out.print("Quantos pontos deseja adicionar ao primeiro cliente? ");
        int pontos1 = sc.nextInt();
        cliente1.adicionarPontos(pontos1); // adiciona pontos ao primeiro cliente
        System.out.print("Quantos pontos deseja adicionar ao segundo cliente? ");
        int pontos2 = sc.nextInt();
        cliente2.adicionarPontos(pontos2); // adiciona pontos ao segundo cliente

        // Saída de dados dos clientes após adição de pontos
        System.out.println();
        System.out.println("Clientes após adição de pontos:");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

        // Criação do objeto Bonus
        System.out.println();
        System.out.println("Criação do objeto Bonus:");
        System.out.print("Qual o valor do bônus? ");
        double valorBonus = sc.nextDouble();
        Bonus bonus = new Bonus(valorBonus);
        
     // Criação do objeto ConcessorDeBonus
        ConcessorDeBonus concessor = new ConcessorDeBonus(bonus);
        // Concedendo o bônus aos clientes que atingiram a pontuação mínima
        concessor.concederBonus(cliente1);
        concessor.concederBonus(cliente2);
        
     // Saída de dados dos clientes após concessão de bônus
        System.out.println();
        System.out.println("Clientes após concessão de bônus:");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

        // Fechando o Scanner
        sc.close();
    }
}

