package padroescriacao.factorymethod;

public class PagamentoPayPal implements IPagamento {
    public String aprovar() {
        return "Pagamento com PayPal aprovado!";
    }
}