package Questão_3;

public class EmpregadoTeste {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();

        empregado1.aumentoSalarial(10);
        empregado2.aumentoSalarial(10);

        System.out.println("Digite as informações do primeiro empregado:");
        empregado1.cadastroDeInformacoes();

        System.out.println("Digite as informações do segundo empregado:");
        empregado2.cadastroDeInformacoes();

        System.out.println("\nApós aumento salarial de 10%:");
        System.out.println("Salário Anual do primeiro empregado: R$" + empregado1.salarioAnual());
        System.out.println("Salário Anual do segundo empregado: R$" + empregado2.salarioAnual());
    }
    

}
