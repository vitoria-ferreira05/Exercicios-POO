package Exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  Main {
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

        Biblioteca registro1 = new Biblioteca();
        registro1.registrarLivro(registro1.getIsbn());


    }
}
