package Exercicio2;

public class Biblioteca {
    private String generoLivro;
    private int isbn;
    private String nomeLivro;

    public Biblioteca() {
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void registrarLivro(int isbn) {
        System.out.println("O livro foi registrado com o ISBN: " + isbn);
    }

    public void registrarLivro(String nomeLivro, int isbn) {
        System.out.println("O livro foi registrado com o isbn " + isbn + " e o nome " + nomeLivro);
    }

    public void registrarLivro(String nomeLivro, int isbn, String generoLivro) {
        System.out.println("O livro foi registrado com o isbn " + isbn + ",o nome" + nomeLivro + " e o gênero " + generoLivro);
    }
}
