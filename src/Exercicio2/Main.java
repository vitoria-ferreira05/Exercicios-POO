package Exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> livros = new ArrayList<>();

        System.out.println("---LIVROS---");
        livros.add("Nome do livro: Água para elefantes; ISBN: 123456; Autor(a): Sara Gruen");
        livros.add("Nome do livro: O iluminado; ISBN: 123456; Autor(a): Stephen King");
        livros.add("Nome do livro: A caixa de pássaros; ISBN: 123456; Autor(a): Josh Malerman");

        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i));
        }

        while (true) {
            System.out.println("Qual registro deseja realizar: " +
                    "\n 1. Por ISBN" +
                    "\n 2. Por ISBN e nome do livro" +
                    "\n 3. Por ISBN, nome do livro e nome do autor" +
                    "\n 4. Sair");

            int opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    Biblioteca registro1 = new Biblioteca();
                    System.out.println("Digite o ISBN: ");
                    registro1.setIsbn(sc.nextInt());
                    registro1.registrarLivro(registro1.getIsbn());
                    break;
                case 2:
                    Biblioteca registro2 = new Biblioteca();
                    System.out.println("Digite o ISBN: ");
                    registro2.setIsbn(sc.nextInt());
                    System.out.println("Digite o(s) nome(s) do(s) livro(s) para o registro: ");
                    registro2.setNomeLivro(sc.next());
                    sc.nextLine();
                    registro2.registrarLivro(registro2.getNomeLivro(), registro2.getIsbn());
                    break;
                case 3:
                    Biblioteca registro3 = new Biblioteca();
                    System.out.println("Digite o ISBN: ");
                    registro3.setIsbn(sc.nextInt());
                    System.out.println("Digite o(s) nome(s) do(s) livro(s) para o registro: ");
                    registro3.setNomeLivro(sc.next());
                    sc.nextLine();
                    System.out.println("Digite o genero: ");
                    registro3.setGeneroLivro(sc.next());
                    sc.nextLine();
                    registro3.registrarLivro(registro3.getNomeLivro(), registro3.getIsbn(), registro3.getGeneroLivro());
                    break;
                case 4:
                    System.out.println("Programa de registro encerrado!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opçao invalida, tente novamente!");
                    break;
            }
        }
    }
}
