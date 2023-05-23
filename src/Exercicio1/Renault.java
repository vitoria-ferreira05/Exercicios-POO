package Exercicio1;

public class Renault extends Carros {

    public Renault(String marca, int ano, double valor, String cor, int portas, double velocidade) {
        super(marca, ano, valor, cor, portas, 0);
    }

    public void iniciarPartidaDoMotor() {
      double inicio = getVelocidade() - getVelocidade();
        System.out.println("Iniciando o motor...minha velocidade está em " + inicio + " km");

    }

    public void frearOCarro() {
        double frear = getVelocidade() - 5;
        System.out.println("Freando... minha velocidade está em " + frear + " km");
    }

    public void acelerarOCarro() {
        double acelerar = getVelocidade() + 10;
        System.out.println("Acelerando... minha velocidade está em " + acelerar + " km");
    }

}
