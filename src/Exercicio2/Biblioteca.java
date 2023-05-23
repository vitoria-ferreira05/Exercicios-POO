package Exercicio2;

import java.util.Scanner;

public class Biblioteca {
    private String generoLivro;
    private int isbn;
    private String autorLivro;
    private String nomeLivro;

    public Biblioteca() {
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void registrarLivro(int isbn){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Qual a quantidade de livros você quer registrar por ISBN? ");
        int qtdadeLivros = sc.nextInt();

        String [] guardarQtd = new String[qtdadeLivros];

        System.out.println("Digite a identificação do(s) IBSN(s): ");
        for (int i = 0; i < qtdadeLivros; i++){
            guardarQtd[i] = sc.next();
        }
        System.out.println("O(s) livro(s) foi registrado(s) respectivamente com o ISBN: ");

        for (String isbnLivros : guardarQtd){
            System.out.println(isbnLivros);
        }
    }
    public void registrarLivro(String nomeLivro, int isbn){
        System.out.println("O livro foi registrado com o isbn " + isbn + "e o nome ." + nomeLivro);
    }
    public void registrarLivro(String nomeLivro, int isbn, String generoLivro){
        System.out.println("O livro foi registrado com o isbn " + isbn + ",o nome" + nomeLivro + "e o gênero " + generoLivro);
    }
}
