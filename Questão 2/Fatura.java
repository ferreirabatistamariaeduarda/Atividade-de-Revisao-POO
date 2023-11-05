import java.util.Scanner;

public class Fatura {
    String numero;
    String descricao;
    int quantItemComprada;
    double precoPorItem;

    
public void cadastrarInformacoes() {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("número da fatura: ");
    numero = ler.next();
    System.out.println("Descrição: ");
    descricao = ler.next();
    System.out.println("Quantidade comprada: ");
    quantItemComprada = ler.nextInt();
    System.out.println("Preço por item: ");
    precoPorItem = ler.nextDouble();
    ler.close();

    }

    public double totalFatura(){
        if (quantItemComprada == 0){
            quantItemComprada = 0;
            System.out.println("Não há nenhum item");
        }
        if(precoPorItem <= 0){
            precoPorItem = 0;
            System.out.println("O preço está zerado");

        }
        return quantItemComprada * precoPorItem;
        
    }
}

