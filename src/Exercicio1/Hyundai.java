package Exercicio1;

public class Hyundai extends Carros{

    public Hyundai(String marca, int ano, double valor, String cor, int portas, double velocidade){
        super(marca, ano, valor, cor, portas, 5);
    }
    public void iniciarPartidaDoMotor() {
        System.out.println("Iniciando o motor...minha velocidade está em " + getVelocidade());
    }

    public void frearOCarro() {
        double frear = getVelocidade() - 2;
        System.out.println("\"Freando... minha velocidade está em " + frear);
    }

    public void acelerarOCarro() {
        double acelerar = getVelocidade() + 15;
        System.out.println("Acelerando... minha velocidade está em " + acelerar);
    }
}
