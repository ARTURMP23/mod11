package artur.matos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class mod11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();
        
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar nome e sexo");
            System.out.println("2. Ver listas");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    adicionarNomeSexo(scanner, masculino, feminino);
                    break;
                case 2:
                    exibirListas(masculino, feminino);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
    

    public static void adicionarNomeSexo(Scanner scanner, List<String> masculino, List<String> feminino) {
        while (true) {
            System.out.print("\nDigite o nome da pessoa (ou digite 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                return;
            }
            
            System.out.print("Digite o sexo da pessoa (M para Masculino, F para Feminino): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);
            
            if (sexo == 'M') {
                masculino.add(nome);
            } else if (sexo == 'F') {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, insira 'M' para Masculino ou 'F' para Feminino.");
            }
        }
    }
    

    public static void exibirListas(List<String> masculino, List<String> feminino) {
        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }
        
        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
    }
    {
}
}

