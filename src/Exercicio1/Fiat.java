package Exercicio1;

public class Fiat extends Carros{
    public Fiat(String marca, int ano, double valor, String cor, int portas, double velocidade){
        super(marca, ano, valor, cor, portas, 3);
    }
    public void iniciarPartidaDoMotor() {
        double inicio = getVelocidade();
        System.out.println("Iniciando o motor...minha velocidade está em " + getVelocidade());
    }

    public void frearOCarro() {
       double frear = getVelocidade() - 6;
        System.out.println("\"Freando... minha velocidade está em " + frear);
    }

    public void acelerarOCarro() {
        double acelerar = getVelocidade() + 12;
        System.out.println("Acelerando... minha velocidade está em " + acelerar);
    }
}
