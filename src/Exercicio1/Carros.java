package Exercicio1;

public class Carros {
    private String marca;
    private int ano;
    private double valor;
    private String cor;
    private int portas;
    private double velocidade;

    public Carros(String marca, int ano, double valor, String cor, int portas, double velocidade){
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }
    public int getPortas() {
        return portas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double v) {
        this.velocidade = velocidade;
    }

    public void iniciarPartidaDoMotor(){

    }
    public void frearOCarro(){

    }
    public void acelerarOCarro(){

    }
}
