package Questão_3;
import java.util.Scanner;

public class Empregado {
    String nome;
    String sobrenome;
    double salarioMensal;


public void cadastroDeInformacoes(){
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o nome do empregado: ");
    ler.next();
    System.out.println("Digite o sobrenome do empregado: ");
    ler.next();
    System.out.println("Digite o salário mensal desse empregado: ");
    ler.nextDouble();

    ler.close();
}

public double salarioAnual() {
    return salarioMensal * 12;
}

public void aumentoSalarial(double percentualAumento) {
    salarioMensal += (salarioMensal * percentualAumento / 100.0);
}



}
