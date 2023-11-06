import java.util.Scanner;

public class Data {
    int mes;
    int ano;
    int dia;

    public void cadastrarAsInformacoes() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        dia = ler.nextInt();
        System.out.println("Digite o mês: ");
        mes = ler.nextInt();
        System.out.println("Digite o ano: ");
        ano = ler.nextInt();

        ler.close();
    }

    public void displayData(){
        System.out.printf("%d/%d/%d \n0", dia, mes, ano);
    }

    public void dataExtenso(){
        if(mes == 1){
            System.out.printf("%d de Janeiro de %d", dia, ano);
        }
        if(mes == 2){
            System.out.printf("%d de Fevereiro de %d", dia, ano);
        }
        if(mes == 3){
            System.out.printf("%d de Março de %d", dia, ano);
        }
        if(mes == 4){
            System.out.printf("%d de Abril de %d", dia, ano);
        }
        if(mes == 5){
            System.out.printf("%d de Maio de %d", dia, ano);
        }
        if(mes == 6){
            System.out.printf("%d de Junho de %d", dia, ano);
        }
        if(mes == 7){
            System.out.printf("%d de Julho de %d", dia, ano);
        }
        if(mes == 8){
            System.out.printf("%d de Agosto de %d", dia, ano);
        }
        if(mes == 9){
            System.out.printf("%d de Setembro de %d", dia, ano);
        }
        if(mes == 10){
            System.out.printf("%d de Outubro de %d", dia, ano);
        }
        if(mes == 11){
            System.out.printf("%d de Novembro de %d", dia, ano);
        }
        if(mes == 12){
            System.out.printf("%d de Dezembro de %d", dia, ano);
        }
    }
}
