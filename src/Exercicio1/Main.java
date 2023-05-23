package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Renault carroRenault1 = new Renault("Sandero", 2022, 62.978, "azul", 4, 200);
        System.out.println("---RENAULT---" +
                "\n Marca: " + carroRenault1.getMarca() +
                "\n Ano: " + carroRenault1.getAno() +
                "\n Valor: R$ " + carroRenault1.getValor() +
                "\n Cor: " + carroRenault1.getCor() +
                "\n Portas: " + carroRenault1.getPortas() +
                "\n Velocidade : " + carroRenault1.getVelocidade() + " km");

        System.out.println("--------------------------------");
        System.out.println("Ligando o carro: ");
        carroRenault1.iniciarPartidaDoMotor();
        System.out.println("Freando o carro: ");
        carroRenault1.frearOCarro();
        System.out.println("Acelerando o carro: ");
        carroRenault1.acelerarOCarro();

        Fiat carroFiat1 = new Fiat("Cronos Drive 1.3 MT", 2023, 84.490, "preto", 4, 160);
        System.out.println("--------------------------------");
        System.out.println("---FIAT---" +
                "\n Marca: " + carroFiat1.getMarca() +
                "\n Ano: " + carroFiat1.getAno() +
                "\n Valor: R$ " + carroFiat1.getValor() +
                "\n Cor: " + carroFiat1.getCor() +
                "\n Portas: " + carroFiat1.getPortas() +
                "\n Velocidade : " + carroFiat1.getVelocidade() + " km");

        System.out.println("--------------------------------");
        System.out.println("Ligando o carro: ");
        carroFiat1.iniciarPartidaDoMotor();
        System.out.println("Freando o carro: ");
        carroFiat1.frearOCarro();
        System.out.println("Acelerando o carro: ");
        carroFiat1.acelerarOCarro();

        Hyundai carroHyundai1 = new Hyundai("Tucson", 2023, 229.990, "cinza metalico", 4, 201);
        System.out.println("--------------------------------");
        System.out.println("---HYUNDAI---" +
                "\n Marca: " + carroHyundai1.getMarca() +
                "\n Ano: " + carroHyundai1.getAno() +
                "\n Valor: R$ " + carroHyundai1.getValor() +
                "\n Cor: " + carroHyundai1.getCor() +
                "\n Portas: " + carroHyundai1.getPortas() +
                "\n Velocidade : " + carroHyundai1.getVelocidade() + " km");

        System.out.println("--------------------------------");
        System.out.println("Ligando o carro: ");
        carroHyundai1.iniciarPartidaDoMotor();
        System.out.println("Freando o carro: ");
        carroHyundai1.frearOCarro();
        System.out.println("Acelerando o carro: ");
        carroHyundai1.acelerarOCarro();
    }
}
