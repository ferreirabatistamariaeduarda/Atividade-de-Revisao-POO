public class FaturaTeste {
    public static void main(String[] args) {

        Fatura fatura = new Fatura();

        fatura.cadastrarInformacoes();

        System.out.println("Número da Fatura: " + fatura.numero);
        System.out.println("Descrição: " + fatura.descricao);
        System.out.println("Quantidade Comprada: " + fatura.quantItemComprada);
        System.out.println("Preço por Item: $" + fatura.precoPorItem);
        System.out.println("Total da Fatura: $" + fatura.totalFatura());
        
       
    }
}
