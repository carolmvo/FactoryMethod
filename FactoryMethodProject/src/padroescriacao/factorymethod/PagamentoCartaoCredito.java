package padroescriacao.factorymethod;

public class PagamentoCartaoCredito implements IPagamento {
    public String aprovar() {
        return "Pagamento com Cartão de Crédito aprovado!";
    }
}